package io.github.curso_springboot.produtosapi.repository;

import io.github.curso_springboot.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
