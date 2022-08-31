/**
 * Resumen.
 * Objeto                   : CardServiceInte.java
 * Descripción              : Clase de interface de servicio para utilizar los métodos de CRUD.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 * Bootcamp-30              05/08/2022        Oscar Candela           Realizar la creación de un método nuevo.
 */

package com.nttdata.bootcamp.bank.springboot.service.inte;

import com.nttdata.bootcamp.bank.springboot.document.Card;

import java.util.List;

/**
 * Clase de interface de servicio para utilizar los métodos de CRUD.
 */
public interface CardServiceInte {

    Card create(final Card card);

    List<Card> readAll();

    List<Card> readByCodeCard(final String codeCard);

    Card updateById(final Card card, final String id);

    void deleteById(final String id);
}