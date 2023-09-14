package edu.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello/world")
    @ResponseBody
    public String helloWorld() {
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String helloName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/distance/{num}")
    @ResponseBody
    public String distanceFromTwelve(@PathVariable int num) {
        int distanceFromTwelve = Math.abs(12 - num);
        return String.format("The distance from 12 is %d", distanceFromTwelve);
    }

    @GetMapping("/distance/{num1}/{num2}")
    @ResponseBody
    public String distanceBetweenNumbers(@PathVariable int num1, @PathVariable int num2) {
        int distance = Math.abs(num1 - num2);
        return String.format("%s is %s digits away from %s", num1, distance, num2);
    }

}
