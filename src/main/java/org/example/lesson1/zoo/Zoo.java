package org.example.lesson1.zoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Zoo {
    private Wild animal;
    private Human human;
    @Autowired
    private Car car;

    @Autowired
    public Zoo(Wild animal, Human human) {
        this.animal = animal;
        this.human = human;
    }
}
