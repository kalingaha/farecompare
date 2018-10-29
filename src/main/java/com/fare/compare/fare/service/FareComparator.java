package com.fare.compare.fare.service;

import com.fare.compare.fare.model.ProviderPrice;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * User: Saliya Samarawickrama
 * Date: 10/29/18
 * Project : fare
 */

public interface FareComparator {

    public ProviderPrice comparePrices(List<ProviderPrice> prices);
}