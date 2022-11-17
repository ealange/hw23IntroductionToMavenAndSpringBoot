package pro.jd10.lange.hw23introductiontomavenandspringboot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController {
    private final CalculatorController calculatorController;

    @GetMapping("/calculator/plus")
    public String plus(@RequestParam(name = "num1") Integer a,
                       @RequestParam(name = "num2") Integer b) {


    }
}
