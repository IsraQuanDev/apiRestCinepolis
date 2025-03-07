package com.mx.apiRestCinepolis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.apiRestCinepolis.model.Peliculas; 
import com.mx.apiRestCinepolis.service.PeliculasServImp; 
 

@RestController
@RequestMapping(path="PeliculasWebService")
@CrossOrigin 
public class PeliculasWebService {
	
				
			@Autowired 
			PeliculasServImp peliculaImp; 
			
			// http://localhost:9000/PeliculasWebService/listar
			
			@GetMapping("listar")
			public List<Peliculas> listar(){
				
				return peliculaImp.listar();
				
			}
			
			
}
