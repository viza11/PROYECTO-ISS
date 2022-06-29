package Ingenieria.Software.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="categoria")

public class Categoria {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)

	private int idCategoria;
	private String nombre;
	
	
	
	//Constructor por defecto
	public Categoria(){}
	
	
	
	//Constructor
	public Categoria(String nombre) {
		super();
		this.nombre = nombre;
	}
	

	
	
	//getters and setters
	public int getIdCategoria() {
		return idCategoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
