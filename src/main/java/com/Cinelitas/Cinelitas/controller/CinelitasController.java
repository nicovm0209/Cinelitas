/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Cinelitas.Cinelitas.controller;

/**
 *
 * @author keylo
 */
@Controller
public class CinelitasController {
   @Autowired
    private ICinelitasService cinelitasService;

   

    @GetMapping("/cinelitas")
    public String index(Model model) {
        List<Pelicula> listaPelicula = peliculaService.getAllPelicula();
        model.addAttribute("Titulo", "Tabla Peliculas");
        model.addAttribute("pelicula", listaPelicula);
        return "peliculas";
    }

    @GetMapping("/peliculaN")
    public String crearPelicula(Model model) {
        List<Pelicula> listaPelicula = peliculaService.listCountry();
        model.addAttribute("pelicula", new Pelicula()); //envia el objeto, 
        model.addAttribute("peliculas", listaPeliculas);  //refencia la entidad persona
        return "crear";
    }
    
    @PostMapping("/save")
    public String guardarPelicula(@ModelAttribute Pelicula pelicula){
        peliculaService.savePelicula(pelicula);
        return "redirect:/pelicula";
    }
    
    @GetMapping("/editpelicula/{id}")
    public String editarPelicula(@PathVariable("id") Long idCinelitas, Model model) {
        Pelicula pelicula = peliculaService.getPeliculaById(idCinelita);
        List<Pelicula> listaPelicula = peliculaService.listCountry();
        model.addAttribute("pelicula", pelicula);
        model.addAttribute("pelicula", listapelicula);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        funcionesService.delete(id);
        
         return "redirect:/funcion";
    }
    
}
