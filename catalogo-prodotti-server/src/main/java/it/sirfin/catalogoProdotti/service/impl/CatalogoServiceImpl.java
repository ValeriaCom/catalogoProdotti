/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoProdotti.service.impl;

import it.sirfin.catalogoProdotti.model.Prodotto;
import it.sirfin.catalogoProdotti.repository.CatalogoRepository;
import it.sirfin.catalogoProdotti.service.CatalogoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogoServiceImpl implements CatalogoService{

    @Autowired
    CatalogoRepository catalogoRepository;
    @Override
    public List<Prodotto> leggiCatalogoCompleto() {
        return catalogoRepository.findAll();
    }

    @Override
    public List<Prodotto> inserisciArticolo(Prodotto p) {
        
       catalogoRepository.save(p);
       return leggiCatalogoCompleto();
    }

    @Override
    public List<Prodotto> cancellaProdotto(Prodotto p) {
        
        catalogoRepository.delete(p);
        return leggiCatalogoCompleto();
    }

    @Override
    public List<Prodotto> svuotaCatalogo() {
        
        catalogoRepository.deleteAllInBatch();
              return new ArrayList<>();  
    }
    
}
