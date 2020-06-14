package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("api/hello-world")
@RestController
public class HelloWorldController {

    @GetMapping
    public List<String> getHelloWorld(){
        List<String > lst= new ArrayList<String>();
        lst.add("Hello");
        lst.add("Saahil");
        //return List.of("Hello","World");
        return lst;

    }
}
