package com.superheroes.pruebafinal.service;

import java.util.List;

import com.superheroes.pruebafinal.DTO.SuperHeroe;

public interface ISuperHeroesService {

	/**
	 * Consultar todos los superHeroes
	 * @return List<SuperHeroe> listado de superHeroes
	 */
	public List<SuperHeroe> listarSuperHeroes();
	
	/**
	 * Listar un unico superHeroe por ID 
	 * @param idSuperHeroe
	 * @return SuperHeroe superHeroe encontrado
	 */
	public SuperHeroe buscarSuperHeroesId(Integer idSuperHeroe);
	
	/**
	 * Consultar todos los superHeroes que contienen en su nombre el valor de un parametro
	 * @param nombre
	 * @return List<SuperHeroe> listado de superHeroes que coinciden con el nombre pasado
	 */
	public List<SuperHeroe> buscarSuperHeroesNombre(String nombreSuperHeroe);
	
	/**
	 * Consultar los superHeroes por estado
	 * @param estado
	 * @return List<SuperHeroe> listado de superHeroes por estado
	 */
	public List<SuperHeroe> buscarSuperHeroesEstado(String estadoSuperHeroe);
	
	/**
	 * Crear un superHeroe
	 * @param superheroes
	 */
	public void guardarSuperHeroe(SuperHeroe superHeroe);	

	/**
	 * Modificar un superHeroe
	 * @param superheroes
	 * @return SuperHeroe modificado
	 */
	public void modificarSuperHeroe(SuperHeroe superHeroe);	

	/**
	 * Modificar el estado de un superHeroe
	 * @param idSuperHeroe
	 * @param nombreSuperHeroe
	 * @param estadoSuperHeroe
	 * @param poderSuperHeroe
	 */
	public void modificarSuperHeroe(Integer id, String nombre, String estado, String poder);	
	
	/**
	 * Eliminar un superHeroe
	 * @param idSuperHeroe
	 */
	public void eliminarSuperHeroes(Integer idSuperHeroe);
	

		
}
