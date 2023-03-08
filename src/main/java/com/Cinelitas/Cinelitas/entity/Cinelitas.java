/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

 
@Entity
@Table(name="Cinelita")
public class Cinelitas implements Serializable {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCinelita;
    
    private String nombre_pelicula;
    private int costo;
    private String fecha;
    private int capacidad;
    private int num_sala;
   
    
    @ManyToOne
    @JoinColumn(name = "idCinelita")
    private Cinelitas cinelitas;
    
    public long getIdCinelitas() {
        return idCinelitas;
    }

    public void setIdCinelitas(long idCinelitas) {
        this.idCinelitas = idCinelitas;
    }

    public String getnombre_pelicula() {
        return nombre_pelicula;
    }

    public void setnombre_pelicula(String nombre_pelicula) {
        this.nombre_pelicula = nombre_pelicula;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getnum_sala() {
        return num_sala;
    }

    public void setnum_sala(int num_sala) {
        this.num_sala = num_sala;
    }
    
   
}
