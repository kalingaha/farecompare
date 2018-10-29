package com.fare.compare.fare.external.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Author  : nalaka 
 * Project : fare 
 * Date    : 10/29/18
 */
@Component
public class ExternalFareRateClientImpl {

    @Autowired
    RestTemplate template;


}

