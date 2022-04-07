package com.superheroes.pruebafinal.DTO;


public class SuperHeroe {

	private Integer id;
	private String nombre;
	private String estado;
	private String poder;
	
	public SuperHeroe () {
		super();
	}
	
	public SuperHeroe (Integer id, String nombre, String estado, String poder) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
		this.poder = poder;		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}


}