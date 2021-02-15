/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.catalogoProdotti.controller;

import it.sirfin.catalogoProdotti.service.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    
}
