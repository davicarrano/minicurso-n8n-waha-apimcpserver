package com.example.demo.discentes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.discentes.domain.Discente;
import com.example.demo.discentes.dto.DiscenteDTO;
import com.example.demo.discentes.dto.DiscenteForm;





@RestController
@RequestMapping("/discentes")
public class DiscenteController {
	
	@Autowired
	private DiscenteService discentesService;
	
	@GetMapping("/todos")
	public List<DiscenteDTO> getServidoresAtivos() {
		return discentesService.buscarTodosDiscentes();
	}

	
	@GetMapping("/porcidade/{cidade}")
	public List<DiscenteDTO> getDiscentesPorCidade(@PathVariable String cidade) {
		return discentesService.buscarDiscentesPorCidade(cidade);
	}

	@GetMapping("/porcurso/{curso}")
	public List<DiscenteDTO> getDiscentesPorCurso(@PathVariable String curso) {
		return discentesService.buscarDiscentesPorCurso(curso);
	}

	@GetMapping("/porlinhapesquisa/{linhapesquisa}")
	public List<DiscenteDTO> getDiscentesPorLinhaPesquisa(@PathVariable String linhapesquisa) {
		return discentesService.buscarDiscentesPorLinhaPesquisa(linhapesquisa);
	}

	@PostMapping()
	public Discente criaDiscentes(@RequestBody DiscenteForm form) {
		return discentesService.criarDiscentes(form);
	}
	
	@DeleteMapping()
	public String excluirDiscentes(@RequestBody DiscenteForm form) {
		return discentesService.excluirDiscentes(form);
	}	
	
}
