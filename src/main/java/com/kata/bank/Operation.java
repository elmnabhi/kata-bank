package com.kata.bank;

import java.time.LocalDate;

public class Operation {
    public enum Type {DEPOSIT, WITHDRAWAL}

    private Type type;
    private Money amount;
    private LocalDate date;

    public Operation(Type type, Money amount, LocalDate date) {
        this.type = type;
        this.date = date;
        if (type == Type.WITHDRAWAL) {
            this.amount = amount.negate();
        } else {
            this.amount = amount;
        }
    }

    public Type getType() {
        return type;
    }

    public Money getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }

}