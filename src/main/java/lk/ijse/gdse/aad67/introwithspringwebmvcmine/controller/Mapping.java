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
        return "Path Variable is " + name + " and " + value;
    }

    @PostMapping("{id:S\\d{4}}")
    public String helloPostRegex(@PathVariable("id") String id) {
        return "Pattern Accepted and Path Variable is " + id;
    }

    @PostMapping(params = {"name", "age"})
    public String helloMappingPart5(@RequestParam("name") String name, @RequestParam("age") int age) {
        return "Mapping Part 5 " + name + " and " + age;
    }

    @PostMapping(headers = {"X-city","Content-Type"})
    public String helloMappingPart6(@RequestHeader("X-city") String myCustomHeader, @RequestHeader("Content-Type") String content) {
        return "Mapping Part 6 " + myCustomHeader + " and " + content;
    }
}
