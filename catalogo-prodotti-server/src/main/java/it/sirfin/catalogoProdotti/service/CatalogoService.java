/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoProdotti.service;

import it.sirfin.catalogoProdotti.model.Prodotto;
import java.util.List;

/**
 *
 * @author marco
 */
public interface CatalogoService {
    
     List<Prodotto> leggiCatalogoCompleto();

    List<Prodotto> inserisciArticolo(Prodotto p);

    List<Prodotto> cancellaCatalogo(Prodotto p);
    
    List<Prodotto> svuotaCatalogo();
    
}
