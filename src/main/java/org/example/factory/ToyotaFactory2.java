package org.example.factory;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ToString
public class ToyotaFactory2 {

    private List<Human> human;
    private Sanych sanych;


    @Autowired
    public ToyotaFactory2(List<Human> human, Sanych sanych) {
        this.human = human;
        this.sanych = sanych;
    }
}
