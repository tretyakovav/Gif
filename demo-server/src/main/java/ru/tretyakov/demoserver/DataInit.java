package ru.tretyakov.demoserver;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.tretyakov.demoserver.Service.ServiceInterface.ExchangeRatesService;

import javax.annotation.PostConstruct;

@Component
public class DataInit {
    private ExchangeRatesService exchangeRatesService;

    @Autowired
    public DataInit(ExchangeRatesService exchangeRatesService) {
        this.exchangeRatesService = exchangeRatesService;
    }
    @PostConstruct
    public void firstDayInit(){
        exchangeRatesService.refreshRates();
    }
}
