package com.example.Controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

    @GetMapping("/error")
    public String handleError(){
        return "Custom error message: Resource not found";
    }

    public String getErrorPath() {
        return "/error";
    }
}
