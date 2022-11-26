package org.example.lesson1.zoo;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }
}
