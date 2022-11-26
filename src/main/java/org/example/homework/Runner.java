package org.example.homework;

import org.example.homework.buyer.Absolut;
import org.example.homework.buyer.Aist;
import org.example.homework.config.MyConfig;
import org.example.homework.consumer.Petrovich;
import org.example.homework.consumer.Reshar;
import org.example.homework.storage.Employee;
import org.example.homework.storage.Storage;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Absolut absolut = context.getBean(Absolut.class);
        Aist aist = context.getBean(Aist.class);
        Petrovich petrovich = context.getBean(Petrovich.class);
        Reshar reshar = context.getBean(Reshar.class);

        absolut.addProduct();
        absolut.addProduct();
        absolut.addProduct();
        aist.addProduct();
        aist.addProduct();
        aist.addProduct();
        aist.addProduct();
        aist.addProduct();

        petrovich.takeProducts();
        reshar.takeProducts();
        System.out.println(petrovich);
        System.out.println(reshar);

    }
}
