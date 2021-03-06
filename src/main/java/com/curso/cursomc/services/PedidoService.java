package com.curso.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.cursomc.domain.Pedido;
import com.curso.cursomc.repositories.PedidoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	public PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		
		
		return obj.orElseThrow(() -> new com.curso.cursomc.services.exceptions.ObjectNotFoundException(
		          "Objeto não encontrado \"" + id + "\" Tipo: \"" + Pedido.class.getName() + "\""));
	}

}
