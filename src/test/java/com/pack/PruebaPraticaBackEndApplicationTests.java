package com.pack;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.springframework.boot.test.context.SpringBootTest;

import com.pack.dao.Dao_Genero;
import com.pack.entitys.Entity_Genero;
import com.pack.services.Services_PruebaPraticaBackEnd;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class PruebaPraticaBackEndApplicationTests {

	@Test
	void contextLoads() {
	}
	
	   @Mock
	    private Dao_Genero generoRepository;

	    @InjectMocks
	    private Services_PruebaPraticaBackEnd generoService;

	    @Test
	    void findAllGeneros_shouldReturnAllGenerosFromRepository() {
	        List<Entity_Genero> expectedGeneros = new ArrayList<>();
	        expectedGeneros.add(new Entity_Genero());

	        when(generoRepository.findAll()).thenReturn(expectedGeneros);

	        CompletableFuture<List<Entity_Genero>> actualGeneros = generoService.findAllGeneros();

	        // Assert
	        assertEquals(expectedGeneros, actualGeneros.join());
	    }
	

}
