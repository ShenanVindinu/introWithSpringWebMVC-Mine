package lk.ijse.gdse.aad67.introwithspringwebmvcmine.controller;

import jakarta.servlet.http.HttpServlet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class Demo {

    @GetMapping
    public String healthTest() {
        return "Hello Demo";
    }

    @GetMapping("other")
    public String healthTest2() {
        return "Hello Demo";
    }

    @PostMapping
    public String healthTestPost() {
        return "Hello Demo Post";
    }

}
