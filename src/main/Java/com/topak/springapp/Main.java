package com.topak.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main (String[] args){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applocationContext.xml");
        Автомобиль автомобиль = context.getBean("автомобиль", Автомобиль.class);
        //Двигатель двигатель = context.getBean("двигатель", Двигатель.class);
        //Колесо колесо = context.getBean("колесо", Колесо.class);
        //Кузов кузов = context.getBean("кузов", Кузов.class);
        //Трансмиссия трансмиссия = context.getBean("трансмиссия", Трансмиссия.class);

    System.out.println(автомобиль.toString());
    }
}
