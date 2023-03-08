/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.service;



/**
 *
 * @author keylo
 */

@Service
public class CinelitasService implements ICinelitasService {
    @Autowired
    private EventoRepository eventoRepository;
      
    @Override
    public List<Evento> getAllEvento() {
       return(List<Evento>)eventoRepository.findAll();
    }

    @Override
    public Evento getEventoById(long id) {
      return eventoRepository.findById(id).orElse(null);
    }

    @Override
    public void saveEvento(Evento evento) {
        eventoRepository.save(evento);
    }

   
    @Override
    public void delete(long id) {
     eventoRepository.deleteById(id);
    }
    
}
