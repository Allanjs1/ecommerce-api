package com.ecommerce_api.produto;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto registerProduto(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> findAll() {
        return repository.findAll();
    }

    public Optional<Produto> findById(Long id) {
        return repository.findById(id);
    }

    public Produto update(Produto produto, Long id) {
        produto.setId(id);
        return repository.save(produto);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
