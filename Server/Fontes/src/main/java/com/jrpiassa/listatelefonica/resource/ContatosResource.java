package com.jrpiassa.listatelefonica.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrpiassa.listatelefonica.model.Contato;

@RestController
@CrossOrigin("${origem-permitida}")
public class ContatosResource {	

	private static final String CONTATOS = "/contatos";

	@GetMapping(CONTATOS)
	public List<Contato> listar() {
		List<Contato> lista = new ArrayList<>();
		Contato contato = new Contato();
		contato.setNome("Jonas");
		contato.setTelefone("9999-9999");
		contato.setData(new Date());
		contato.setCor("blue");
		lista.add(contato);
		return lista;
	}

//	@PostMapping(CONTATOS)
//	public Item adicionar(@RequestBody @Valid Item item) {
//		return repository.save(item);
//	}
//
//	@PutMapping(CONTATOS)
//	public Item alterar(@RequestBody @Valid Item item) {
//		return repository.save(item);
//	}
//
//	@DeleteMapping(CONTATOS)
//	public String deletar(@RequestBody @Valid Item item) {
//		try {
//			repository.delete(item);
//			return "OK!";
//		} catch (Exception e) {
//			return "Erro ao deletar: "+e.toString();
//		}
//
//	}
}
