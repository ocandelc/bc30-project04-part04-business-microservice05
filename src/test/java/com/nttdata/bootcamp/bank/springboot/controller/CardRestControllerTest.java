package com.nttdata.bootcamp.bank.springboot.controller;

import com.nttdata.bootcamp.bank.springboot.document.Card;
import com.nttdata.bootcamp.bank.springboot.service.inte.CardServiceInte;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

@SpringBootTest
public class CardRestControllerTest {

    @MockBean
    private CardServiceInte cardServiceInte;

    @Test
    void readAllTest() {

        List<Card> fluxOperationPassive = cardServiceInte.readAll();

        Mockito.verify(cardServiceInte).readAll();

     }

}
