/**
 * Resumen.
 * Objeto                   : SpringBootMicroserviceCardApplication.java
 * Descripción              : Clase para iniciar el microservicio.
 * Fecha de Creación        : 04/08/2022.
 * Proyecto de Creación     : Bootcamp-30.
 * Autor                    : Oscar Candela.
 * ---------------------------------------------------------------------------------------------------------------------------
 * Modificaciones
 * Motivo                   Fecha             Nombre                  Descripción
 * ---------------------------------------------------------------------------------------------------------------------------
 * Bootcamp-30              17/08/2022        Oscar Candela           Realizar la creación de un método nuevo.
 */

package com.nttdata.bootcamp.bank.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Clase para iniciar el microservicio.
 */
@SpringBootApplication
public class SpringBootMicroserviceCardApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringBootMicroserviceCardApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringBootMicroserviceCardApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("Init Card 8195");

    }

}
