package com.tecnologiaefinancas.desafiostech.cruds.produto.repository;

import com.tecnologiaefinancas.desafiostech.cruds.produto.entity.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository  extends CrudRepository<Produto, Long> {
}
