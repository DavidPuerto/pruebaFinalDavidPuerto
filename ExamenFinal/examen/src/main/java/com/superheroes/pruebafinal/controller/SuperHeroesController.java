package com.superheroes.pruebafinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.superheroes.pruebafinal.DTO.SuperHeroe;
import com.superheroes.pruebafinal.service.ISuperHeroesService;

@RestController
public class SuperHeroesController {

	@Autowired
	private ISuperHeroesService superheroesService;

	/**
	 * Consultar todos los superHeroes
	 * @return List<SuperHeroe> listado de superHeroes
	 */
	@GetMapping(value = "/super-heroes", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SuperHeroe> listadoSuperHeroes() {
		return superheroesService.listarSuperHeroes();
	}

	/**
	 * Listar un unico superHeroe por ID 
	 * @param idSuperHeroe
	 * @return SuperHeroe superHeroe encontrado
	 */
	@GetMapping(value = "/super-heroes/{idSuperHeroe}", produces = MediaType.APPLICATION_JSON_VALUE)
	public SuperHeroe obtenerSuperHeroe(@PathVariable(value = "idSuperHeroe") Integer idSuperHeroe) {
		return superheroesService.buscarSuperHeroesId(idSuperHeroe);
	}

	/**
	 * Consultar todos los superHeroes que contienen en su nombre el valor de un parametro
	 * @param nombre
	 * @return List<SuperHeroe> listado de superHeroes que coinciden con el nombre pasado
	 */
	@GetMapping(value = "/super-heroes/nombre/{nombre}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SuperHeroe> obtenerSuperHeroesNombre(@PathVariable(value = "nombre") String nombre) {
		return superheroesService.buscarSuperHeroesNombre(nombre);
	}

	/**
	 * Consultar los superHeroes por estado
	 * @param estado
	 * @return List<SuperHeroe> listado de superHeroes por estado
	 */
	@GetMapping(value = "/super-heroes/estado/{estado}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<SuperHeroe> obtenerSuperHeroesEstado(@PathVariable(value = "estado") String estado) {
		return superheroesService.buscarSuperHeroesEstado(estado);
	}
	
	/**
	 * Crear un superHeroe
	 * @param superheroes
	 */
	@PostMapping(value = "/super-heroes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.CREATED)
	public void crearSuperHeroes(@RequestBody SuperHeroe superheroes) {
		superheroesService.guardarSuperHeroe(superheroes);
	}
	
	/**
	 * Modificar un superHeroe
	 * @param superheroes
	 * @return SuperHeroe modificado
	 */
	@PatchMapping(value = "/super-heroes", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public SuperHeroe modificarSuperHeroes(@RequestBody SuperHeroe superHeroe) {
		superheroesService.modificarSuperHeroe(superHeroe);

		return superHeroe;
	}
	
	/**
	 * Modificar el estado de un superHeroe
	 * @param idSuperHeroe
	 * @param nombreSuperHeroe
	 * @param estadoSuperHeroe
	 * @param poderSuperHeroe
	 */
	@PatchMapping(value = "/super-heroes/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void modificarSuperHeroes(@PathVariable(value = "id") Integer idSuperHeroe,
			 @RequestParam(value = "nombre", required = false) String nombreSuperHeroe,
			 @RequestParam(value = "estado", required = false) String estadoSuperHeroe,
			 @RequestParam(value = "poder", required = false) String poderSuperHeroe) {
		
		superheroesService.modificarSuperHeroe(idSuperHeroe, nombreSuperHeroe, estadoSuperHeroe, poderSuperHeroe);
	}
	
	/**
	 * Eliminar un superHeroe
	 * @param idSuperHeroe
	 */
	@DeleteMapping(value = "/super-heroes/{idSuperHeroe}", consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void eliminarSuperHeroe(@PathVariable(value = "idSuperHeroe") Integer idSuperHeroe) {
		superheroesService.eliminarSuperHeroes(idSuperHeroe);

	}

}
