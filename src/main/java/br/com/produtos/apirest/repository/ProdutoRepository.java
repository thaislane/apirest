package br.com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.produtos.apirest.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{ //JpaRepository possui varios metodos para fazer persistencia no Banco de dados como "save", "delete", "findall", "findbyid", entre outros

}
