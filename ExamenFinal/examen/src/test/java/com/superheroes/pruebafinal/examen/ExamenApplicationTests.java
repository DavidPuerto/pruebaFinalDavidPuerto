//package com.superheroes.pruebafinal.examen;
//
//import java.util.List;
//
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.superheroes.pruebafinal.DTO.SuperHeroe;
//import com.superheroes.pruebafinal.service.impl.SuperHeroesServiceImpl;
//
//@SpringBootTest 
//@ExtendWith(MockitoExtension.class)
//class ExamenApplicationTests {
//
//	@InjectMocks
//	SuperHeroesServiceImpl ISuperHeroesService;
//
//		@Mock
//				
//		private List<SuperHeroe> LST_SUPER_HEROES;{
//		
//			LST_SUPER_HEROES.add(new SuperHeroe(1, "Superman", "V", "Volar"));
//		}
//		

//		@Test
//		//@DisplayName("Test para buscar una pelicula")
//		void test_buscarPelicula() throws Exception {
//			
//			// DEFINICIÓN DE VARIABLES DE ENTRADA Y RESULTADOS
//			Integer peliculaIdParam = Integer.valueOf("1");
//			Pelicula valorEsperado = new Pelicula(1, "2001", "Stanley Kubrik", "Ci-Fi", "1968");
//			Integer valorIncorrecto = Integer.valueOf("9");
//			
//			// COMPORTAMIENTO ESPERADO DEL CUERPO DEL MÉTODO
//			// BDDMockito.given(repository.buscarPelicula(id)).willReturn(valorEsperado);
//			// Mockito.when(repository.buscarPelicula(anyInt())).thenReturn((any(Pelicula.class)));
//			// Mockito.when(repository.buscarPelicula(any(Integer.class))).thenReturn(any());
//			
//			when(repository.buscarPelicula(peliculaIdParam)).thenReturn(valorEsperado);
//			
//			
//			// LLAMADA A MÉTODO A TESTEAR
//			Pelicula peliculaActual = peliculasService.buscarPelicula(peliculaIdParam);
//			
//			
//			// COMPROBACIONES DEL RESULTADO ESPERADO
//			assertNotNull(peliculaActual);
//			assertEquals(peliculaIdParam, peliculaActual.getId());
//			// assertEquals(valorIncorrecto, peliculaActual.getId());
//		}
	//	
//		@Test
//		@DisplayName("Test para cubrir el caso de lanzar una excepción")
//		void test_buscarPelicula_error() throws Exception {
//			
//			// DEFINICIÓN DE VARIABLES DE ENTRADA Y RESULTADOS
//			Integer peliculaIdParam = null;
//			
//			when(repository.buscarPelicula(peliculaIdParam)).thenThrow(new Exception("test"));
//			
//			// LLAMADA A MÉTODO A TESTEAR
//			Pelicula peliculaActual = peliculasService.buscarPelicula(peliculaIdParam);
//			
//			
//			// COMPROBACIONES DEL RESULTADO ESPERADO
//			assertNotNull(peliculaActual);
//			assertEquals("ERROR", peliculaActual.getTitulo());
//		}
	//	
	//	
//		@Test()
//		//@DisplayName("Test para obtener una lista de peliculas")
//		void test_listarPeliculas() throws Exception {
//			
//			// DEFINICIÓN DE VARIABLES DE ENTRADA
//			List<Pelicula> resultadoEsperado = List.of(peliculas.get(1));
//			// List<Pelicula> resultadoEsperado = new ArrayList<>();
//			
//			// COMPORTAMIENTO ESPERADO DEL CUERPO DEL MÉTODO
//			// when(repository.listarPeliculas()).thenReturn(anyList());
//			when(repository.listarPeliculas()).thenReturn(resultadoEsperado);
//			
//			// LLAMADA A MÉTODO A TESTEAR
//			List<Pelicula> peliculasActual = peliculasService.listarPeliculas();
//			
//			// COMPROBACIONES DEL RESULTADO ESPERADO
//			assertNotNull(peliculasActual);
//			// assertEquals(peliculas.size(), Integer.valueOf(1));
//			assertTrue(peliculasActual.size() > 0);
//		}
	//	
	//	
//		@Test
//		void test_guardarPeliculaId() {
//			
//			
//			// DEFINICIÓN DE VARIABLES DE ENTRADA
//			Pelicula peliculaParam = new Pelicula();
//			Integer peliculaIdEsperado = 1;
//			
//			// COMPORTAMIENTO ESPERADO DEL CUERPO DEL MÉTODO
//			when(repository.guardarPeliculaId(peliculaParam)).thenReturn(peliculaIdEsperado);
//			
//			
//			// LLAMADA A MÉTODO A TESTEAR
//			Integer idActual = peliculasService.guardarPeliculaId(peliculaParam);
//			
//			
//			// COMPROBACIONES DEL RESULTADO ESPERADO
//			assertNotNull(idActual);
//			assertTrue(idActual.intValue() > -1);
//			assertEquals(peliculaIdEsperado, idActual);
//			
//			
//		}
	//	
	//}

//	@Test
//	void contextLoads() {
//	}

//}
