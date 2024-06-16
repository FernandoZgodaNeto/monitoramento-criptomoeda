package com.fag.monitoramento_criptomoeda.controller;

import com.fag.monitoramento_criptomoeda.service.CryptoCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CryptoCurrencyController {
    
    @Autowired
    private CryptoCurrencyService cryptoCurrencyService;

    @GetMapping("/price/{id}")
    public Map<String, Object> getCryptoCurrencyPrice(@PathVariable String id) {
        return cryptoCurrencyService.getCryptoCurrencyPrice(id);
    }
}