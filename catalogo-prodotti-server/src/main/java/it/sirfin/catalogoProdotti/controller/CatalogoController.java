/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoProdotti.controller;

import it.sirfin.catalogoProdotti.dto.ListaProdottiDto;
import it.sirfin.catalogoProdotti.dto.leggiCatalogoCompleto;
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

  @RequestMapping("/leggiCatalogoCompleto")
    @ResponseBody
    public ListaProdottiDto  leggiCatalogoCompleto() {
        return new ListaProdottiDto(catalogoService.leggiCatalogoCompleto());
    }

    @RequestMapping("/inserisciArticolo")
    @ResponseBody
    public ListaProdottiDto inserisciArticolo(@RequestBody ListaProdottiDto dto) {
        // estraggo il contatto dal DTO
        Prodotto p = dto.getProdotto;
        // inserisco il contatto su DB e ottengo il DB aggiornato
        List<Prodotto> lista = catalogoService.inserisciArticolo(p);
        // creo un nuovo DTO per la risposta
        ListaProdottiDto risp = new ListaProdottiDto(lista);
        // ritorno il DTO
        return risp;
    }

    @RequestMapping("/cancellaProdotto")
    @ResponseBody
    public ListaProdottiDto cancellaProdotto(@RequestBody ListaProdottiDto dto) {
        return new ListaProdottiDto(catalogoService.cancellaProdotto(dto.getProdotto()));
    }

    @RequestMapping("/svuotaCatalogo")
    @ResponseBody
    public ListaProdottiDto svuotaCatalogo() {
        return new ListaProdottiDto(catalogoService.svuotaCatalogo());
    }

}
