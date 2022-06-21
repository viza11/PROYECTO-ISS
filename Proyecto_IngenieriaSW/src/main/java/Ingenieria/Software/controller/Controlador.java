package Ingenieria.Software.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Ingenieria.Software.model.Departamento;
import Ingenieria.Software.model.Usuario;
import Ingenieria.Software.service.ServiceDepartamento;
import Ingenieria.Software.service.ServiceUsuario;

@Controller
public class Controlador {
	@Autowired
	ServiceUsuario serviceUsuario;
	
	@Autowired
	ServiceDepartamento serviceDepartamento;
	
	@GetMapping("/")
	public String registrarCompania(){
		return "Index";
	}
	
	@GetMapping("/crear/Departamento")
	public String crearUsuario(){
		return "CrearUsuario";
	}
	
	@RequestMapping(value= "/usuarios/crearUsuarios",method=RequestMethod.POST)
	public String crearUsuario(
								  
								  @RequestParam(name = "primerNombre") String primerNombre,
								  @RequestParam(name = "segundoNombre") String segundoNombre, 
								  @RequestParam(name = "primerApellido") String primerApellido,
								  @RequestParam(name = "segundoApellido") String segundoApellido,
								  @RequestParam(name = "correoElectronico") String correoElectronico,
								  @RequestParam(name = "direccion") String direccion,
								  @RequestParam(name = "idDepartamento") int idDepartamento){
		/*int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String correoElectronico, String direccion, String rol, int idDepartamento*/
		Usuario usuario= new Usuario(primerNombre,segundoNombre,primerApellido,segundoApellido,correoElectronico,direccion,idDepartamento);
		this.serviceUsuario.crear(usuario);
		return "index";
	}
	
	
}
