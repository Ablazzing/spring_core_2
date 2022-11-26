package org.example.lesson1.factory;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ToString
public class ToyotaFactory {
    private Petrovich petrovich;
    private Mihalych mihalych;
    private Sanych sanych;

    @Autowired
    public ToyotaFactory(Petrovich petrovich, Mihalych mihalych, Sanych sanych) {
        this.petrovich = petrovich;
        this.mihalych = mihalych;
        this.sanych = sanych;
    }

}
