/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoProdotti.dto;

import it.sirfin.catalogoProdotti.model.Prodotto;
import java.util.List;

/**
 *
 * @author marco
 */
public class ListaProdottiDto {
     private List<Prodotto> listaProdotti;

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public ListaProdottiDto(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public ListaProdottiDto() {
    }

    @Override
    public String toString() {
        return "ListaProdottiDto{" + "listaProdotti=" + listaProdotti + '}';
    }
    
}
