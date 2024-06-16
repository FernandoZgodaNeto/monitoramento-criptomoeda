package com.fag.monitoramento_criptomoeda.controller;

import com.fag.monitoramento_criptomoeda.service.CryptoCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;

@Controller
public class WebController {

    @Autowired
    private CryptoCurrencyService cryptoCurrencyService;

    @GetMapping("/")
    public String index(Model model) {
        String defaultCryptoId = "bitcoin";
        return getPrice(defaultCryptoId, model);
    }

    @PostMapping("/price")
    public String getPrice(@RequestParam("cryptoId") String cryptoId, Model model) {
        Map<String, Object> priceData = cryptoCurrencyService.getCryptoCurrencyPrice(cryptoId);
        Map<String, Object> cryptoData = (Map<String, Object>) priceData.get(cryptoId);
        double priceInBrl = cryptoData != null ? ((Number) cryptoData.get("brl")).doubleValue() : 0.0;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String formattedPriceInBrl = currencyFormat.format(priceInBrl);

        model.addAttribute("cryptoId", cryptoId);
        model.addAttribute("priceInBrl", formattedPriceInBrl);

        return "index";
    }

    @GetMapping("/api/price")
    @ResponseBody
    public String getPriceAPI(@RequestParam("cryptoId") String cryptoId) {
        Map<String, Object> priceData = cryptoCurrencyService.getCryptoCurrencyPrice(cryptoId);
        Map<String, Object> cryptoData = (Map<String, Object>) priceData.get(cryptoId);
        double priceInBrl = cryptoData != null ? ((Number) cryptoData.get("brl")).doubleValue() : 0.0;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return currencyFormat.format(priceInBrl);
    }

    @GetMapping("/api/history")
    @ResponseBody
    public Map<String, Object> getHistoryAPI(@RequestParam("cryptoId") String cryptoId) {
        return cryptoCurrencyService.getCryptoCurrencyHistory(cryptoId);
    }
}
