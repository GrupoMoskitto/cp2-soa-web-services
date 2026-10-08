CREATE TABLE pedidos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cliente_nome VARCHAR(255) NOT NULL,
    data_pedido DATE,
    valor_total DOUBLE NOT NULL
);
