/**
 * Resumen.
 * Objeto                   : CardDaoInte.java
 * Descripción              : Clase de interface dao para obtener los datos de la base de datos.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 * Bootcamp-30              17/08/2022        Oscar Candela           Realizar la creación de un método nuevo.
 */

package com.nttdata.bootcamp.bank.springboot.dao.inte;

import com.nttdata.bootcamp.bank.springboot.document.Card;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Clase de interface dao para obtener los datos de la base de datos.
 */
public interface CardDaoInte extends MongoRepository<Card, String> {
    List<Card> readByCodeCard(String code);

}
