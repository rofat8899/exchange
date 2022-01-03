package com.rofat.exchange.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class currency {
    private String code;
    private String alphaCode;
    private String numericCode;
    private String name;
    private BigDecimal rate;
    private String date;
    private BigDecimal inverseRate;

    @Override
    public String toString() {
        return "currency{" +
                "code='" + code + '\'' +
                ", alphaCode='" + alphaCode + '\'' +
                ", numericCode='" + numericCode + '\'' +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", date='" + date + '\'' +
                ", inverseRate=" + inverseRate +
                '}';
    }
}
