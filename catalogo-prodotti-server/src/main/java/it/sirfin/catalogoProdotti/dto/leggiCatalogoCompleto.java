/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoProdotti.dto;

import it.sirfin.catalogoProdotti.model.Prodotto;

/**
 *
 * @author marco
 */
public class leggiCatalogoCompleto {
      private Prodotto prodotto;

    @Override
    public String toString() {
        return "RichiestaProdottoDto{" + "prodotto=" + prodotto + '}';
    }

    public Prodotto getProdotto() {
        return prodotto;
    }

    public void setProdotto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public leggiCatalogoCompleto(Prodotto prodotto) {
        this.prodotto = prodotto;
    }

    public leggiCatalogoCompleto() {
    }
}
