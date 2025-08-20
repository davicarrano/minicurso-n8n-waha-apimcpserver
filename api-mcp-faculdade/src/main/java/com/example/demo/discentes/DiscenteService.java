package com.example.demo.discentes;

import java.util.List;
import java.util.Optional;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.discentes.domain.Discente;
import com.example.demo.discentes.dto.DiscenteDTO;
import com.example.demo.discentes.dto.DiscenteForm;

@Service
public class DiscenteService {
	
	@Autowired
	private DiscenteRepository discentesRepository ;

	@Tool(name="todosDiscentes", description = "Busca informação de todos os discentes")
	public List<DiscenteDTO> buscarTodosDiscentes() {
		
		return discentesRepository.findDiscentes();
	}

	@Tool(name="discentesPorCidade", description = "Busca informação dos discentes a partir da cidade informada")
	public List<DiscenteDTO> buscarDiscentesPorCidade(String cidade) {
		
		return discentesRepository.findDiscentesPorCidade(cidade);
	}

	@Tool(name="discentesPorCurso", description = "Busca informação dos discentes a partir do curso informado")
	public List<DiscenteDTO> buscarDiscentesPorCurso(String curso) {
		
		return discentesRepository.findDiscentesPorCurso(curso);
	}

	@Tool(name="discentesPorLinhaPesquisa", description = "Busca informação dos discentes a partir da linha de pesquisa informada")
	public List<DiscenteDTO> buscarDiscentesPorLinhaPesquisa(String linhaPesquisa) {
		
		return discentesRepository.findDiscentesPorLinhaPesquisa(linhaPesquisa);
	}

	@Tool(name="criarDiscente", description = "Cria um discente na base de dados")
	public Discente criarDiscentes(DiscenteForm form) {
		Discente discente = new Discente(form.getNome(),form.getCidade(), form.getCurso(), form.getLinhaPesquisa());
		discentesRepository.save(discente);
		return discente;
	}
	
	@Tool(name="excluirDiscente", description = "Exclui um discente na base de dados")
	public String excluirDiscentes(DiscenteForm form) {
		Optional<Discente> discenteOptional = discentesRepository.findByNomeAndCidadeAndCurso(form.getNome(),form.getCidade(),form.getCurso(),form.getLinhaPesquisa());
		if (discenteOptional.isPresent()) {			
			discentesRepository.delete(discenteOptional.get());			
			return "Discente "+form.getNome()+ ", da cidade "+form.getCidade()+ ", do curso "+form.getCurso()+" e da linha de pesquisa "+form.getLinhaPesquisa()+ " excluído com sucesso!";		
		}else {
			return "Discente não encontrado!";
		}
	}

	
}
