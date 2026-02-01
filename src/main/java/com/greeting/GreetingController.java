package com.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService service;

    /* GET request */
    @GetMapping
    public Greeting greeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return service.getGreeting(firstName, lastName);
    }

    @GetMapping("/{id}")
    public Greeting getById(@PathVariable int id) {
        return service.findById(id);
    }

    @GetMapping("/all")
    public List<Greeting> getAll() {
        return service.findAll();
    }

    /* PUT request */
    @PutMapping("/{id}")
    public Greeting update(
            @PathVariable int id,
            @RequestParam String message) {
        return service.update(id, message);
    }

    /* DELETE request */
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Greeting deleted successfully";
    }
}
