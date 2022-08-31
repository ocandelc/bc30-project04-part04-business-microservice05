/**
 * Resumen.
 * Objeto                   : OperationPassiveServiceInte.java
 * Descripción              : Clase de implementación de servicio para utilizar los métodos de CRUD.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 * Bootcamp-30              05/08/2022        Oscar Candela           Realizar la creación de un método nuevo.
 */

package com.nttdata.bootcamp.bank.springboot.service.impl;

import com.nttdata.bootcamp.bank.springboot.dao.inte.CardDaoInte;
import com.nttdata.bootcamp.bank.springboot.document.Card;
import com.nttdata.bootcamp.bank.springboot.service.inte.CardServiceInte;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Clase de implementación de servicio para utilizar los métodos de CRUD.
 */

@Service
public class CardServiceImpl implements CardServiceInte {

    private static final Logger log = LoggerFactory.getLogger(CardServiceImpl.class);

    @Autowired
    private CardDaoInte cardDaoInte;

    @Override
    public Card create(final Card card) {

        return cardDaoInte.save(card);

    }

    @Override
    public List<Card> readAll() {

        return cardDaoInte.findAll();
    }

    @Override
    public List<Card> readByCodeCard(final String codeCard) {

        return cardDaoInte.readByCodeCard(codeCard);
    }

    @Override
    public Card updateById(final Card card, final String id) {

        return cardDaoInte.save(card);
    }

    @Override
    public void deleteById(final String id) {

        cardDaoInte.deleteById(id);
    }

}