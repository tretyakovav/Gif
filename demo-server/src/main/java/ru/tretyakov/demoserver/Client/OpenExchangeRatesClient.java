package ru.tretyakov.demoserver.Client;


import ru.tretyakov.demoserver.Model.ExchangeRates;

public interface OpenExchangeRatesClient {
    ExchangeRates getLatestRates(String appId);
    ExchangeRates getHistoricalRates(String date, String appId);
}
