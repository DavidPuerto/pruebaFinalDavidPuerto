package com.superheroes.pruebafinal.repository;

import java.util.List;

import com.superheroes.pruebafinal.DTO.SuperHeroe;

public interface SuperHeroesRepository {

	public interface SuperHeroesService {

		void guardarSuperHeroes(SuperHeroe superHeroes);
	
		List<SuperHeroe> listarSuperHeroes();
	
		SuperHeroe buscarSuperHeroes(Integer idSuperHeroes);
		
		public List<SuperHeroe> buscarSuperHeroesestado(String estado);
	
		void eliminarSuperHeroes(Integer idSuperHeroes);
	

		}
	
}