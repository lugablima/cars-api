package com.cars.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarDTO;

@RestController
@RequestMapping("/api/cars")
public class CarController {
    
    @PostMapping
    public void create(@RequestBody CarDTO body) {
        System.out.println("Modelo: " + body.modelo());
        System.out.println("Fabricante: " + body.fabricante());
        System.out.println("Data de fabricação: " + body.dataFabricacao());
        System.out.println("Valor: " + body.valor());
        System.out.println("Ano do modelo: " + body.anoModelo());
    }
}
