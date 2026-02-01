package com.hello;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    /* GET request */
    @GetMapping
    public String hello() {
        return "Hello from BridgeLabz";
    }

    /*Using query parameter */
    @GetMapping("/query")
    public String helloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    /*Using path variable */
    @GetMapping("/param/{name}")
    public String helloPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

    /* POST request */
    @PostMapping("/post")
    public String helloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " +
                user.getLastName() + " from BridgeLabz";
    }

    /*  PUT request */
    @PutMapping("/put/{firstName}")
    public String helloPut(
            @PathVariable String firstName,
            @RequestParam String lastName) {

        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
