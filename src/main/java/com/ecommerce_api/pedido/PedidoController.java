package com.ecommerce_api.pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<Double> adicionarPedido(@RequestBody Pedido pedido) {
        double valorComDesconto = pedidoService.calcularValorComDesconto(pedido.getValorTotal());
        return ResponseEntity.ok(valorComDesconto);
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listarPedidos() {
        return ResponseEntity.status(HttpStatus.OK).body(pedidoService.listarPedidos());

    }
}
