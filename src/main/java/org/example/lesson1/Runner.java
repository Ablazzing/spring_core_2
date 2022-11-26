package org.example.lesson1;

import org.example.lesson1.config.MyConfig;
import org.example.lesson1.factory.Human;
import org.example.lesson1.factory.Sanych;
import org.example.lesson1.factory.ToyotaFactory;
import org.example.lesson1.factory.ToyotaFactory2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ToyotaFactory factory1 = context.getBean(ToyotaFactory.class);
        System.out.println(factory1);

        Map<String, Human> humanMap = context.getBeansOfType(Human.class);
        System.out.println(humanMap);

        ToyotaFactory2 factory2 = context.getBean(ToyotaFactory2.class);
        System.out.println(factory2);

        Sanych bean = context.getBean(Sanych.class);
//        HashMap<String, Object> context = new HashMap<>();
//        Cat cat = new Cat();
//        context.put("cat", cat);
//        Car car = new Car();
//        context.put("car", car);
//
//        Human human = new Human(context);

//        Zoo zoo = new Zoo(cat, human);
//        Car car2 = new Car();
//        zoo.setCar(car2);
    }
}
