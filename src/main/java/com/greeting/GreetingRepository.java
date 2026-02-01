package com.greeting;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class GreetingRepository {

    private Map<Integer, Greeting> map = new HashMap<>();
    private int counter = 1;

    // UC 4
    public Greeting save(String message) {
        Greeting greeting = new Greeting(counter++, message);
        map.put(greeting.getId(), greeting);
        return greeting;
    }

    // UC 5
    public Greeting findById(int id) {
        return map.get(id);
    }

    // UC 6
    public List<Greeting> findAll() {
        return new ArrayList<>(map.values());
    }

    // UC 7
    public Greeting update(int id, String message) {
        Greeting g = map.get(id);
        if (g != null) {
            g.setMessage(message);
        }
        return g;
    }

    // UC 8
    public void delete(int id) {
        map.remove(id);
    }
}
