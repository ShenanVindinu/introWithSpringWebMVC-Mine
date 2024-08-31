package lk.ijse.gdse.aad67.introwithspringwebmvcmine.controller;


import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/{name}/{value}")
    public String helloPost(@PathVariable("name") String name, @PathVariable("value") int value) {
        return "Path Variable is" + name + " and " + value;
    }
}
