package com.example.SpringEsercizio18.Controllers;

import com.example.SpringEsercizio18.Services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1")
public class BasicController {

    @Autowired
    BasicService serviceBase;

    @GetMapping(path = "/hello")
    public String hi() {
        return "Hello World!";
    }

    @GetMapping(path = "/")
    public String sumCustom() {
        return serviceBase.sumTwoNumbers();
    }

    @GetMapping(path = "/what")
    public String returnType(){
        return serviceBase.returnSomething();
    }
}