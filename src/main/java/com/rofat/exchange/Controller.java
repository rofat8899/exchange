package com.rofat.exchange;

import com.rofat.exchange.model.exchange;
import com.rofat.exchange.service.exchangeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class Controller {
    @Autowired
    private exchangeServiceImp exchangeService ;
    @GetMapping()
    public exchange getAllExchange(){
        return exchangeService.getAllExChange();
    }

    @GetMapping("/riel-to-usd/{value}")
    public BigDecimal getExchangeToUsd(@PathVariable("value") BigDecimal val)
    {
        return exchangeService.getExchangeToUsd(val);
    }
    @GetMapping("/usd-to-riel/{value}")
    public BigDecimal getExchangeUsdToRiel(@PathVariable("value") BigDecimal val)
    {
        return exchangeService.getExchangeUsdtoRiel(val);
    }
    @GetMapping("/riel-to-eur/{value}")
    public BigDecimal getExchangeToEur(@PathVariable("value") BigDecimal val)
    {
        return exchangeService.getExchangeToEur(val);
    }
    @GetMapping("/riel-to-aud/{value}")
    public BigDecimal getExchangeToAud(@PathVariable("value") BigDecimal val)
    {
        return exchangeService.getExchangeToAud(val);
    }
}
