package com.fare.compare.fare.model;

/**
 * User: Saliya Samarawickrama
 * Date: 10/29/18
 * Project : fare
 */
public class ProviderPrice {

    private String provider;
    private Long price;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}