package org.example.lesson1.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
    private Car car;

    @Autowired
    public Human(Car car) {
        this.car = car;
    }
}
