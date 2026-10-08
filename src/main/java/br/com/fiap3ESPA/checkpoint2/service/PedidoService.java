package br.com.fiap3ESPA.checkpoint2.service;

import br.com.fiap3ESPA.checkpoint2.model.Pedido;
import br.com.fiap3ESPA.checkpoint2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido createPedido(Pedido pedido) {
        return repository.save(pedido);
    }

    public List<Pedido> readAllPedidos() {
        return repository.findAll();
    }

    public Pedido readPedidoById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Pedido não encontrado"));
    }

    public Pedido updatePedido(Long id, Pedido pedido) {
        return repository.findById(id).map(existingPedido -> {
            existingPedido.setClienteNome(pedido.getClienteNome());
            existingPedido.setValorTotal(pedido.getValorTotal());
            return repository.save(existingPedido);
        }).orElseThrow(() -> new EntityNotFoundException("Pedido não encontrado"));
    }

    public void deletePedidoById(Long id) {
        try {
            if (!repository.existsById(id)) {
                throw new EntityNotFoundException("Pedido não encontrado");
            }
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new EntityNotFoundException("Pedido não encontrado");
        }
    }
}
