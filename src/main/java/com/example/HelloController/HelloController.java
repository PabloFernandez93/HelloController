package com.example.HelloController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")

public class HelloController {

    @GetMapping
    String sayHello() {
        return "Hello!";
    }

    //http://localhost:8080/api/hello/pablo
    @GetMapping("/{name}")
    String greet(@PathVariable String name) {
        return "Hello " + name + "!";
    }

/*
    //http://localhost:8080/api/hello/user?name=pablo
    @GetMapping("/user")
    String greetUser(@RequestParam String name) {
        return "Hello " + name + "!";
    }

 */

    //http://localhost:8080/api/hello/user?name=pablo&lastname=fernandez
    @GetMapping("/user")
    String greetUserWithLastName(@RequestParam String name, @RequestParam String lastname) {
        return "Hello " + name + " " +  lastname + "!";
    }

}
