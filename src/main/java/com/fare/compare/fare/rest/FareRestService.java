package com.fare.compare.fare.rest;

import com.fare.compare.fare.external.ExternalFareRateClient;
import com.fare.compare.fare.model.ProviderPrice;
import com.fare.compare.fare.service.FareComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Saliya Samarawickrama
 * Date: 10/29/18
 * Project : fare
 */
@RestController
@RequestMapping("/api/v1/fare")
public class FareRestService {


    @Autowired
    FareComparator comparator;
    @Autowired
    ExternalFareRateClient client;

    @GetMapping("/getfare")
    ProviderPrice getFare(@RequestParam(name = "start") String start, @RequestParam(name = "end") String end) {

        return comparator.comparePrices(client.getProviderPriceList(start, end));
    }

}