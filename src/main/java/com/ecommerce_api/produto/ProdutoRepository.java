package com.ecommerce_api.produto;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findById(long id);

}
