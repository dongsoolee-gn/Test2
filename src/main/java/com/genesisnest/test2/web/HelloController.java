package com.genesisnest.test2.web;

import com.genesisnest.test2.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello. testnewfddfsd1";
    }


    @GetMapping("/hello/dto")
    public HelloResponseDto HelloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);

    }
}
