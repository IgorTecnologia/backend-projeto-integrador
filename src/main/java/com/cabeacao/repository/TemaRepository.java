package com.cabeacao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.cabeacao.model.Tema;

public interface TemaRepository extends JpaRepository <Tema,Long>{
	public List <Tema> findAllByNomeContainingIgnoreCase(@Param("nome")String nome); 
	 //Ele procura por todos os metodos que tem nome com ignoreCase
}
