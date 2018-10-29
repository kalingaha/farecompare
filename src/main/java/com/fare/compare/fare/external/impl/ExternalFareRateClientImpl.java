package com.fare.compare.fare.external.impl;

import com.fare.compare.fare.external.ExternalFareRateClient;
import com.fare.compare.fare.model.ProviderPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author  : nalaka 
 * Project : fare 
 * Date    : 10/29/18
 */
@Component
public class ExternalFareRateClientImpl implements ExternalFareRateClient{

    @Autowired
    RestTemplate template;


    @Override
    public ProviderPrice[] getProviderPriceList(String start, String end) {
        Map<String,String> params=new HashMap<>();
        params.put("","");
        params.put("","");
        //ResponseEntity<Object[]> entity= template.getForEntity("",ProviderPrice.class,params);
    return null;
    }
}

