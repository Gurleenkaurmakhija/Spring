package com.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository repository;

    //methods
    public Greeting getGreeting(String firstName, String lastName) {
        String message;

        if (firstName != null && lastName != null) {
            message = "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            message = "Hello " + firstName;
        } else if (lastName != null) {
            message = "Hello " + lastName;
        } else {
            message = "Hello World";
        }

        return repository.save(message);
    }

    public Greeting findById(int id) {
        return repository.findById(id);
    }

    public List<Greeting> findAll() {
        return repository.findAll();
    }

    public Greeting update(int id, String message) {
        return repository.update(id, message);
    }

    public void delete(int id) {
        repository.delete(id);
    }
}
