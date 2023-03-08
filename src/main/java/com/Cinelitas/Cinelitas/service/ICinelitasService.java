/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Cinelitas.Cinelitas.service;

/**
 *
 * @author keylo
 */
public interface ICinelitasService {
     public List<Cinelitas> getAllEvento();
    public Cinelitas getCinelitasById (long id);
    public void saveCinelitas(Cinelitas cinelitas);
    public void delete (long id);
}
