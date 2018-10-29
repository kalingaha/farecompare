package com.fare.compare.fare.rest;

import com.fare.compare.fare.model.Fare;
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

    @GetMapping("/getfare")
    Fare getFare(@RequestParam(name = "start") String start, @RequestParam(name = "end") String end){
        return new Fare();
    }

}