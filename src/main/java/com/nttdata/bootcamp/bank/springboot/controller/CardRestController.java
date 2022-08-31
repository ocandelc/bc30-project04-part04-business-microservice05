/**
 * Resumen.
 * Objeto                   : CardRestController.java
 * Descripción              : Clase de controladora para invocar los métodos con rest api.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 * Bootcamp-30              05/08/2022        Mario Vásquez           Realizar la creación de un método nuevo.
 */

package com.nttdata.bootcamp.bank.springboot.controller;

import com.nttdata.bootcamp.bank.springboot.document.Card;
import com.nttdata.bootcamp.bank.springboot.service.inte.CardServiceInte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * Clase de controladora para invocar los métodos con rest api.
 */
@RestController
@RequestMapping("/api/business-microservice0501-card/card")
public class CardRestController {

    private static final Logger log = LoggerFactory.getLogger(CardRestController.class);

    @Autowired
    private CardServiceInte cardServiceInte;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Card create(@RequestBody final Card card) {
        log.debug("Begin RestController create Card");
        return cardServiceInte.create(card);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Card> readAll() {
        log.debug("Begin RestController readAll Card");
        return cardServiceInte.readAll();
    }

    @RequestMapping(value = "/readByCodeCard/{codeCard}", method = RequestMethod.GET)
    public List<Card> readByCodeCard(@PathVariable String codeCard) {
        log.debug("Begin RestController readByCodeCard Card");
        return cardServiceInte.readByCodeCard(codeCard);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public Card updateById(@RequestBody final Card card, @PathVariable("id") final String id) {
        log.debug("Begin RestController updateById Card");
        return cardServiceInte.updateById(card, id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable final String id) {
        log.debug("Begin RestController deleteById Card");
        cardServiceInte.deleteById(id);
    }

}