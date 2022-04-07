package com.superheroes.pruebafinal.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.superheroes.pruebafinal.DTO.SuperHeroe;
import com.superheroes.pruebafinal.service.ISuperHeroesService;

@Service
public class SuperHeroesServiceImpl implements ISuperHeroesService {

//No tenemos BBDD
//	private JpaSuperHeroesRepository jpasuperheroesrepository;
	
//	public SuperHeroesServiceImpl(SuperHeroesRepository superheroesRepository) {
//	this.superheroesRepository = superheroesRepository;
//}

	private List<SuperHeroe> LST_SUPER_HEROES;
	
	@PostConstruct
	public void listadoSuperHeroes() {
		LST_SUPER_HEROES = new ArrayList<SuperHeroe>();
		LST_SUPER_HEROES.add(new SuperHeroe(1, "Superman", "V", "Volar"));
		LST_SUPER_HEROES.add(new SuperHeroe(2, "Spiderman", "M", "Telaraña"));
		LST_SUPER_HEROES.add(new SuperHeroe(3, "Aquaman", "V", "Agua"));
	}
	

	/**
	 * Consultar todos los superHeroes
	 * @return List<SuperHeroe> listado de superHeroes
	 */
	public List<SuperHeroe> listarSuperHeroes() {
		return LST_SUPER_HEROES;
	}
	
	/**
	 * Listar un unico superHeroe por ID 
	 * @param idSuperHeroe
	 * @return SuperHeroe superHeroe encontrado
	 */
	public SuperHeroe buscarSuperHeroesId(Integer id) {
		SuperHeroe SuperHeroesEncontrado = null;
		
		for (int i = 0; i < LST_SUPER_HEROES.size(); i++) 
		{
			SuperHeroe superheroes = LST_SUPER_HEROES.get(i);
			if (superheroes.getId() == id) {
				SuperHeroesEncontrado = superheroes;
			}
		}
		return SuperHeroesEncontrado;
	}
	
	
	/**
	 * Consultar todos los superHeroes que contienen en su nombre el valor de un parametro
	 * @param nombre
	 * @return List<SuperHeroe> listado de superHeroes que coinciden con el nombre pasado
	 */
	public List<SuperHeroe> buscarSuperHeroesNombre(String nombreSuperHeroe) {
	
		List<SuperHeroe> superHeroesEncontrados = new ArrayList<SuperHeroe>();

		for (int i = 0; i < LST_SUPER_HEROES.size(); i++) 
		{
			SuperHeroe superHeroe = LST_SUPER_HEROES.get(i);
			
			if (superHeroe.getNombre().contains(nombreSuperHeroe)) {
				superHeroesEncontrados.add(superHeroe);
			}
		}
		return superHeroesEncontrados;
	}

	/**
	 * Consultar los superHeroes por estado
	 * @param estado
	 * @return List<SuperHeroe> listado de superHeroes por estado
	 */
	public List<SuperHeroe> buscarSuperHeroesEstado(String estado) {

		List<SuperHeroe> superHeroesEncontrados = new ArrayList<SuperHeroe>();

		for (int i = 0; i < LST_SUPER_HEROES.size(); i++) 
		{
			SuperHeroe superHeroe = LST_SUPER_HEROES.get(i);
			if (superHeroe.getEstado().toLowerCase().equals(estado.toLowerCase()) ) {
				superHeroesEncontrados.add(superHeroe);
			}
		}
		return superHeroesEncontrados;
	}

	/**
	 * Crear un superHeroe
	 * @param superheroes
	 */
	public void guardarSuperHeroe(SuperHeroe superHeroe) {
			
		if(superHeroe.getId() == null) 
		{
			int idSuperHeroe = 1;
			if(LST_SUPER_HEROES.size() != 0) {
				idSuperHeroe = LST_SUPER_HEROES.get(LST_SUPER_HEROES.size()-1).getId()+1;
			}
			//Guardar
			//Math.random genera un double aleatorio 15298.65 o 1.59 o 5651
			LST_SUPER_HEROES.add(new SuperHeroe(idSuperHeroe, 
					superHeroe.getNombre(), 
					superHeroe.getEstado(), 
					superHeroe.getPoder()));
		}else {
			//Como tiene valor Id tengo que recorre la lisa de superheroes y encontrar el id 
			//para modificar sus datos con los que me pasan
			for(int i=0; i<LST_SUPER_HEROES.size(); i++) 
			{
				if (LST_SUPER_HEROES.get(i).getId() == superHeroe.getId()) 
				{
					//Modifica superheroe
					LST_SUPER_HEROES.get(i).setId(superHeroe.getId());
					LST_SUPER_HEROES.get(i).setNombre(superHeroe.getNombre());
					LST_SUPER_HEROES.get(i).setEstado(superHeroe.getEstado());
					LST_SUPER_HEROES.get(i).setPoder(superHeroe.getPoder());
				}
			}
		}			
	}

	/**
	 * Modificar un superHeroe
	 * @param superheroes
	 * @return SuperHeroe modificado
	 */
	public void modificarSuperHeroe(SuperHeroe superHeroe) {
		for(int i=0; i<LST_SUPER_HEROES.size(); i++)
		{
			if(LST_SUPER_HEROES.get(i).getId() == superHeroe.getId()) {
				LST_SUPER_HEROES.get(i).setId(superHeroe.getId());
				LST_SUPER_HEROES.get(i).setNombre(superHeroe.getNombre());
				LST_SUPER_HEROES.get(i).setEstado(superHeroe.getEstado());
				LST_SUPER_HEROES.get(i).setPoder(superHeroe.getPoder());
			}
		}		
	}
	/**
	 * Modificar el estado de un superHeroe
	 * @param idSuperHeroe
	 * @param nombreSuperHeroe
	 * @param estadoSuperHeroe
	 * @param poderSuperHeroe
	 */
	public void modificarSuperHeroe(Integer id, String nombre, String estado, String poder) {
		for(int i=0; i<LST_SUPER_HEROES.size(); i++)
		{
			if(LST_SUPER_HEROES.get(i).getId() == id) 
			{
				LST_SUPER_HEROES.get(i).setId(id);
				if(nombre != "") {
					LST_SUPER_HEROES.get(i).setNombre(nombre);
				}
				if(estado != "") {
					LST_SUPER_HEROES.get(i).setEstado(estado);
				}
				if(poder != "") {
					LST_SUPER_HEROES.get(i).setPoder(poder);
				}
			}
		}
	}
	
	/**
	 * Eliminar un superHeroe
	 * @param idSuperHeroe
	 */
	public void eliminarSuperHeroes(Integer idSuperHeroe) {
		for(int i=0; i<LST_SUPER_HEROES.size(); i++) 
		{
			if (LST_SUPER_HEROES.get(i).getId() == idSuperHeroe) 
			{
				LST_SUPER_HEROES.remove(i);
			}
		}
	}


}
