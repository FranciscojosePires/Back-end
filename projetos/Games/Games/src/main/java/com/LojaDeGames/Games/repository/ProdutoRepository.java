
package com.LojaDeGames.Games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LojaDeGames.Games.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long >{
//public List<Produto> findAllByProdutoContainingIgnoreCase (String produto);
		
	}
