package com.fag.monitoramento_criptomoeda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class CryptoCurrencyService {

    @Autowired
    private RestTemplate restTemplate;

    public Map<String, Object> getCryptoCurrencyPrice(String cryptoId) {
        String url = "https://api.coingecko.com/api/v3/simple/price?ids=" + cryptoId + "&vs_currencies=brl";
        return restTemplate.getForObject(url, Map.class);
    }

    public Map<String, Object> getCryptoCurrencyHistory(String cryptoId) {
        String url = "https://api.coingecko.com/api/v3/coins/" + cryptoId + "/market_chart?vs_currency=brl&days=30";
        return restTemplate.getForObject(url, Map.class);
    }
}
