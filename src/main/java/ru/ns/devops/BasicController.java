package ru.ns.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping("/hello")
    public String getHello() {
        return "HELLO";
    }

    @GetMapping("/divide")
    public double divide(@RequestParam("a") double a, @RequestParam("b") double b) {
        return a / b;
    }

    @GetMapping("/sum")
    public double sum(@RequestParam("a") double a, @RequestParam("b") double b) {
        return a + b;
    }
}
