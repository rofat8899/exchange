package com.rofat.exchange.service;

import com.google.gson.Gson;
import com.rofat.exchange.model.exchange;
import com.rofat.exchange.rest.RestClient;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

@Service
public class exchangeServiceImp {
    private final exchange exchangeData;
    MathContext m = new MathContext(1);
    MathContext m1 = new MathContext(4);
    exchangeServiceImp(){
      this.exchangeData = getAllExChange();
    }

    public exchange getAllExChange() {
        RestClient restClient = new RestClient();
        String json = restClient.get("");
        //System.out.println(data);

        return new Gson().fromJson(json, exchange.class);
    }

    public BigDecimal getExchangeToUsd(BigDecimal val) {
        BigDecimal bd = val.multiply(exchangeData.getUsd().getRate());
        bd = bd.setScale(2, RoundingMode.DOWN);
        return bd;
    }

    public BigDecimal getExchangeToEur(BigDecimal val) {
        return val.multiply(exchangeData.getEur().getRate());
    }

    public BigDecimal getExchangeToAud(BigDecimal val) {
        return val.multiply(exchangeData.getAud().getRate());
    }

    public BigDecimal getExchangeUsdtoRiel(BigDecimal val) {
        BigDecimal bd = (val.multiply(exchangeData.getUsd().getInverseRate()));
        bd = bd.setScale(2, RoundingMode.DOWN);
        return bd;
    }
}
