package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.model.dto.IMC;
import br.com.confidencecambio.javabasico.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

@CrossOrigin
@RequestMapping("/api/")
@RestController
public class IMCController {
    private final CalculadoraService calculadoraService;

    @Autowired
    public IMCController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping(value = "/imc" , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> calcularIMC(@RequestBody IMC imc) {
        var result = calculadoraService.calcular(imc.getAltura(), imc.getPeso());
        return ResponseEntity.ok().body("O seu imc é de " + BigDecimal.valueOf(result).setScale(1, RoundingMode.UP).doubleValue());
    }
}
