package com.octo.entity;

public class Card {
    public String code;
    public String label;
    public String cardType;
    public String cardNumber;

    public void cancelCard() {
        System.out.println("Card canceled");
    }
}
