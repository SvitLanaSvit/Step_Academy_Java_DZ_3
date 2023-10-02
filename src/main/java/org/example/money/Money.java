package org.example.money;

import java.text.DecimalFormat;

public class Money {
    private int dollars;
    private int cents;

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }
    public void addMoney(int additionalDollars, int additionalCents){
        dollars += additionalDollars;
        cents += additionalCents;
        normalizeCents();
    }

    public void subtractMoney(int subtractedDollars, int subtractedCents){
        dollars -= subtractedDollars;
        cents -= subtractedCents;
        normalizeCents();
    }

    private void normalizeCents() {
        if (cents < 0) {
            int borrow = Math.abs(cents) / 100 + 1;
            dollars -= borrow;
            cents += borrow * 100;
        } else if (cents >= 100) {
            dollars += cents / 100;
            cents %= 100;
        }
    }

    @Override
    public String toString() {
        return "$" + dollars + "." + cents;
    }
}
