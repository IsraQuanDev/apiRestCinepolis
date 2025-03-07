package com.mx.apiRestCinepolis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
CREATE TABLE Cinepolis (
    ID NUMBER PRIMARY KEY, 
    NOMBRE VARCHAR2(100) NOT NULL,      
    GENERO VARCHAR2(50) NOT NULL,       
    PRECIO NUMBER(10, 2) NOT NULL ); 

INSERT INTO Cinepolis VALUES (1,'Avengers: Endgame', 'Acción', 150.00);
INSERT INTO Cinepolis VALUES (2, 'Frozen II', 'Animación', 120.50);
INSERT INTO Cinepolis VALUES (3,'Joker', 'Drama', 140.75);
INSERT INTO Cinepolis VALUES (4,'Toy Story 4', 'Animación', 110.00);
INSERT INTO Cinepolis VALUES (5,'Parasite', 'Thriller', 130.25);
*/


// modelo -> dao -> service Interface -> service implementacion -> controller -> main

@Entity
@Table(name = "CINEPOLIS")
@Data 
@NoArgsConstructor
@AllArgsConstructor  

public class Peliculas {
	
	@Id
	@Column(name = "ID", columnDefinition = "NUMBER",nullable= false)
	private int idPelicula;
		
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(100)",nullable=false)
	private String nombre;
	
	@Column(name="GENERO", columnDefinition="NVARCHAR2(50)",nullable=false)
	private String genero;
			
	@Column(name="PRECIO", columnDefinition="NUMBER",nullable=false)
	private double precio;

}

