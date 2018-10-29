package com.fare.compare.fare.service.impl;

import com.fare.compare.fare.model.ProviderPrice;
import com.fare.compare.fare.service.FareComparator;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * User: Saliya Samarawickrama
 * Date: 10/29/18
 * Project : fare
 */
@Service
public class FareComparatorImpl implements FareComparator {

    public ProviderPrice comparePrices(List<ProviderPrice> prices){
        Collections.sort(prices);
        return prices.get(0);

    }
}