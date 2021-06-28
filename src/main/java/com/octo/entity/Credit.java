package com.octo.entity;

public class Credit {
    private String code;
    private String label;
    private String creditType;

    public void cancelCredit() {
        System.out.println("Card canceled");
    }
}
