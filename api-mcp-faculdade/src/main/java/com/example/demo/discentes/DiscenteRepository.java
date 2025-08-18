package com.example.demo.discentes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.discentes.domain.Discente;
import com.example.demo.discentes.dto.DiscenteDTO;

@Repository
public interface DiscenteRepository extends JpaRepository<Discente, Integer> {

	@Query(value = "select nome, cidade, curso, linha_pesquisa from discentes "
			+ "", nativeQuery = true)
	List<DiscenteDTO> findDiscentes();

	@Query(value = "select nome, cidade, curso, linha_pesquisa from discentes "
			+ " where upper(cidade) = upper(:cidade)", nativeQuery = true)
	List<DiscenteDTO> findDiscentesPorCidade(String cidade);
	
	@Query(value = "select nome, cidade, curso, linha_pesquisa from discentes "
			+ " where upper(curso) = upper(:curso)", nativeQuery = true)
	List<DiscenteDTO> findDiscentesPorCurso(String curso);
	
	@Query(value = "select nome, cidade, curso, linha_pesquisa from discentes "
			+ " where upper(linha_pesquisa) = upper(:linhaPesquisa)", nativeQuery = true)
	List<DiscenteDTO> findDiscentesPorLinhaPesquisa(String linhaPesquisa);

}
