package com.ecommerce_api.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public ResponseEntity<Double> criarPedido(@RequestBody Pedido pedido) {
        double valorComDesconto = pedidoService.calcularValorComDesconto(pedido.getValorTotal());
        return ResponseEntity.ok(valorComDesconto);

    }

}
