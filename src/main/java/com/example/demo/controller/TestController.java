package com.example.demo.controller;

import com.example.demo.service.WelcomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {


    @GetMapping("/api/{name}")
    @ResponseBody
    public String welcome(){

        return "pandi";
    }

    @GetMapping("/custom/{name}")
    @ResponseBody
    public ResponseEntity customWelcome(@PathVariable String name){

        Map<String,String> map = new HashMap<>();
        map.put("id","123");
        map.put("name","pravanjan");
        map.put("role","Developer");

        return ResponseEntity
                .ok()
                .eTag(name)
                .body(new WelcomeService().parseJsondata());
    }

    @GetMapping("/parse/json")
    @ResponseBody
    public String parsejson(){
      new WelcomeService().parseJsondata();
      return null;
    }

}
