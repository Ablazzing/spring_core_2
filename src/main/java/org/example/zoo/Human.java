package org.example.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Human {
    private Car car;

    @Autowired
    public Human(Car car) {
        this.car = car;
    }
}
