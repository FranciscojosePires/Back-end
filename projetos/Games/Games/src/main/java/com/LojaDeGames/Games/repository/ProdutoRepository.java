package com.LojaDeGames.Games.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LojaDeGames.Games.model.Produto;
@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long>{
	//public List<Produto > findAllbyProdutoContainingIgnoreCase(String produto);
}
