package com.rofat.exchange.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class exchange {
    private currency usd;
    private currency eur;
    private currency gbp;
    private currency aud;
    @Override
    public String toString() {
        return "exchange{" +
                "usd=" + usd.toString() +
                '}';
    }
}
