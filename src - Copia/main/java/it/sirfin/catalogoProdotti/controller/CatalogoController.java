/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoProdotti.controller;

import it.sirfin.catalogoProdotti.dto.ListaProdottiDto;
import it.sirfin.catalogoProdotti.model.Prodotto;
import it.sirfin.catalogoProdotti.service.CatalogoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marco
 */
@CrossOrigin("*")
@RestController
public class CatalogoController {
    @Autowired
    CatalogoService catalogoService;
    
     @RequestMapping("/leggi-catalogo")
    @ResponseBody
    
        public ListaProdottiDto inserisciContatto(@RequestBody leggiCatalogoCompleto dto) {
        // estraggo il contatto dal DTO
        Prodotto c = dto.getContatto();
        // inserisco il contatto su DB e ottengo il DB aggiornato
        List<Prodotto> lista = CatalogoService.inserisciContatto(c);
        // creo un nuovo DTO per la risposta
        ListaProdottiDto risp = new ListaProdottiDto(lista);
        // ritorno il DTO
        return risp;
    }
    
    
}
