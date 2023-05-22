package com.beneti.springtutorial.controllers;

import com.beneti.springtutorial.operators.SimpleMath;
import com.beneti.springtutorial.utils.NumberConverter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private SimpleMath math = new SimpleMath();

    @GetMapping("/sum/{n1}/{n2}")
    public Double sum(@PathVariable("n1") String n1, @PathVariable("n2") String n2) throws Exception {
        if(!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return math.sum(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
    }

    @GetMapping("/sub/{n1}/{n2}")
    public Double subtraction(@PathVariable("n1") String n1, @PathVariable("n2") String n2) throws Exception {
        if(!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return math.subtraction(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
    }

    @GetMapping("/multi/{n1}/{n2}")
    public Double multiplication(@PathVariable("n1") String n1, @PathVariable("n2") String n2) throws Exception {
        if(!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return math.multiplication(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
    }

    @GetMapping("/div/{n1}/{n2}")
    public Double division(@PathVariable("n1") String n1, @PathVariable("n2") String n2) throws Exception {
        if(!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return math.division(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
    }

    @GetMapping("/mean/{n1}/{n2}")
    public Double mean(@PathVariable("n1") String n1, @PathVariable("n2") String n2) throws Exception {
        if(!NumberConverter.isNumeric(n1) || !NumberConverter.isNumeric(n2)) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return math.mean(NumberConverter.convertToDouble(n1), NumberConverter.convertToDouble(n2));
    }

    @GetMapping("/square/{number}")
    public Double squareRoot(@PathVariable("number") String number) throws Exception {
        if(!NumberConverter.isNumeric(number)) {
            throw new UnsupportedOperationException("Please set a numeric value!");
        }
        return math.squareRoot(NumberConverter.convertToDouble(number));
    }

}
