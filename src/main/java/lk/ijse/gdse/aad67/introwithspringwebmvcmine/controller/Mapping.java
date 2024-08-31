package lk.ijse.gdse.aad67.introwithspringwebmvcmine.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("map")
public class Mapping {
    @GetMapping("hello??")
    public String hello() {
        return "Hello Mapping";
    }

    @GetMapping("test/**")
    public String helloTest() {
        return "Hello MappingTest";
    }
}
