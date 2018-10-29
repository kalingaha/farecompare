package com.fare.compare.fare.external.impl;

import com.fare.compare.fare.AppConstants;
import com.fare.compare.fare.external.ExternalFareRateClient;
import com.fare.compare.fare.model.ProviderPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author  : nalaka
 * Project : fare
 * Date    : 10/29/18
 */
@Component
public class ExternalFareRateClientImpl implements ExternalFareRateClient {

    @Autowired
    RestTemplate template;


    @Override
    public List<ProviderPrice> getProviderPriceList(String start, String end) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(AppConstants.API_PATH)
                .queryParam("start", start)
                .queryParam("end", end);
        ResponseEntity<ProviderPrice[]> entity = template.getForEntity(builder.toUriString(), ProviderPrice[].class);
        List<ProviderPrice> prices = new ArrayList(Arrays.asList(entity.getBody()));
        return prices;
    }
}

