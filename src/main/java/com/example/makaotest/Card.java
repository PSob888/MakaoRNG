package com.example.makaotest;

import java.util.Objects;

public class Card {
    private String symbol;//s-serce, w-wino, d-diament, z-zoladz
    private String number;//od 2 do 14, jopek-11, krolowa-12, krol-13, as-14

    public Card(String symbol, String number) {
        this.symbol = symbol;
        this.number = number;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getNumber() {
        return number;
    }

    public boolean isEqual(Card c){
        if(Objects.equals(c.getNumber(), this.number) && Objects.equals(c.getSymbol(), this.symbol))
            return true;
        return false;
    }

    public boolean isDiffrent(Card c){
        if(!Objects.equals(c.getNumber(), this.number) || !Objects.equals(c.getSymbol(), this.symbol))
            return true;
        return false;
    }

    public boolean isSimilar(Card c){
        if(Objects.equals(c.getNumber(), this.number) || Objects.equals(c.getSymbol(), this.symbol))
            return true;
        return false;
    }
}
