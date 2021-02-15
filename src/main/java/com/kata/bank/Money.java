package com.kata.bank;

import java.math.BigDecimal;

public class Money {
    private BigDecimal amount;

    public Money(int amount) {
        this(new BigDecimal(amount));
    }

    public Money(BigDecimal amount) {
        this.amount = amount;
    }

    public Money add(Money other) {
        return new Money(this.amount.add(other.amount));
    }

    public Money negate() {
        return new Money(this.amount.negate());
    }

    public String toString() {
        return this.amount.toString();
    }
}
