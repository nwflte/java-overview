package com.octo.service;

import com.octo.entity.Card;
import com.octo.entity.Credit;

public class EquipmentService {

    public void cancelCard(Card card) {
        System.out.println("Doing some checks and logging...");
        card.cancelCard();
    }

    public void cancelCredit(Credit credit) {
        System.out.println("Doing some checks and logging...");
        credit.cancelCredit();
    }

}
