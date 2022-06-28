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
		return "index";
	}
	
	@GetMapping("/crear/Departamento")
	public String crearUsuario(){
		return "CrearUsuario";
	}
	
	@GetMapping("/terminos")
	public String terminos(){
		return "terminos";
	}
	
	@GetMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value= "/usuarios/iniciarSesion",method=RequestMethod.POST)
	public String crearUsuario(
								  @RequestParam(name = "primerNombre") String primerNombre,
								  @RequestParam(name = "segundoNombre") String segundoNombre, 
								  @RequestParam(name = "primerApellido") String primerApellido,
								  @RequestParam(name = "segundoApellido") String segundoApellido,
								  @RequestParam(name = "correoElectronico") String correoElectronico,
								  @RequestParam(name = "contrasenia") String contrasenia,
								  @RequestParam(name = "idDepartamento") int idDepartamento,
								  @RequestParam(name = "telefono") int telefono,
								  @RequestParam(name = "direccion") String direccion){
		/*int id, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String correoElectronico, String direccion, String rol, int idDepartamento*/
		try {
			Usuario usuario= new Usuario(primerNombre,segundoNombre,primerApellido,segundoApellido,correoElectronico,contrasenia,idDepartamento,telefono,direccion);
			this.serviceUsuario.crear(usuario);
			return "login";
		}catch(Exception e) {
			return "/";
		}
	
	}
	
	
}
