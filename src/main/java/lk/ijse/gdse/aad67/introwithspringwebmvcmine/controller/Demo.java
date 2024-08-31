package lk.ijse.gdse.aad67.introwithspringwebmvcmine.controller;

import jakarta.servlet.http.HttpServlet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class Demo extends HttpServlet {

    @GetMapping
    public String healthTest() {
        return "Hello Demo";
    }

}
