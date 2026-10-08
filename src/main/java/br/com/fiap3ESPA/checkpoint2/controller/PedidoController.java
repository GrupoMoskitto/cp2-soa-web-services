package br.com.fiap3ESPA.checkpoint2.controller;

import br.com.fiap3ESPA.checkpoint2.model.Pedido;
import br.com.fiap3ESPA.checkpoint2.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.EntityNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    public ResponseEntity<Object> createPedido(@Valid @RequestBody Pedido pedido) {
        try {
            Pedido novoPedido = service.createPedido(pedido);
            return new ResponseEntity<>(novoPedido, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(java.util.Map.of("mensagem", e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public List<Pedido> readPedidos() {
        return service.readAllPedidos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getPedido(@PathVariable Long id) {
        try {
            Pedido pedido = service.readPedidoById(id);
            return new ResponseEntity<>(pedido, HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(java.util.Map.of("mensagem", e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updatePedido(@PathVariable Long id, @Valid @RequestBody Pedido pedido) {
        try {
            Pedido pedidoAtualizado = service.updatePedido(id, pedido);
            return new ResponseEntity<>(pedidoAtualizado, HttpStatus.OK);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(java.util.Map.of("mensagem", e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePedido(@PathVariable Long id) {
        try {
            service.deletePedidoById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (EntityNotFoundException e) {
            return new ResponseEntity<>(java.util.Map.of("mensagem", e.getMessage()), HttpStatus.NOT_FOUND);
        }
    }
}
