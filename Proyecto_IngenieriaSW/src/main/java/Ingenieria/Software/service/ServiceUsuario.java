package Ingenieria.Software.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Ingenieria.Software.model.Usuario;
import Ingenieria.Software.repository.RepositoryUsuario;

@Service

public class ServiceUsuario {
	
	@Autowired 
	RepositoryUsuario repositoryUsuario;
	
	//Funciones
	 
	public void crear(Usuario usuario) {
		this.repositoryUsuario.save(usuario);
		
	}

}
