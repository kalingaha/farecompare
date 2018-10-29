package com.fare.compare.fare.external;

import com.fare.compare.fare.model.ProviderPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Author  : nalaka 
 * Project : fare 
 * Date    : 10/29/18
 */
public interface ExternalFareRateClient {


    ProviderPrice[] getProviderPriceList(String start,String end);

}

