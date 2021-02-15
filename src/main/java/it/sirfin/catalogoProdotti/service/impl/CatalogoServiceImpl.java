/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoProdotti.service.impl;

import it.sirfin.catalogoProdotti.model.Prodotto;
import it.sirfin.catalogoProdotti.repository.CatalogoRepository;
import it.sirfin.catalogoProdotti.service.CatalogoService;
import java.util.List;

/**
 *
 * @author marco
 */
public class CatalogoServiceImpl implements CatalogoService{

    @Override
    public List<Prodotto> leggiCatalogoCompleto() {
        return CatalogoRepository.findAll();
    }

    @Override
    public List<Prodotto> inserisciArticolo(Prodotto p) {
       CatalogoRepository.save(c);
        return leggiCatalogoCompleto();
    }

    @Override
    public List<Prodotto> cancellaCatalogo(Prodotto p) {
        
    }

    @Override
    public List<Prodotto> svuotaCatalogo() {
        
    }
    
}
