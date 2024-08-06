package com.ecommerce_api.pedido;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido adicionarPedido(Pedido pedido) {
        return repository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return repository.findAll();
    }

    public Optional<Pedido> findById(Long id) {
        return repository.findById(id);
    }

    public Pedido update(Pedido pedido, Long id) {
        pedido.setId(id);
        return repository.save(pedido);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Double calcularValorComDesconto(Double valorTotal) {
        if (valorTotal > 200) {
            return valorTotal * 0.9;

        } else {
            return valorTotal;
        }
    }

}
