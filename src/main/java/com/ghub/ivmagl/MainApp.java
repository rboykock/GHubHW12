package com.ghub.ivmagl;

import com.ghub.ivmagl.components.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("Configuration.xml");
        Car car = ctx.getBean(Car.class);

        System.out.println("Annotation - based configuration: ");
        System.out.println("Engine capacity = " + car.getEngine().getEngineCapacity() +
                "\nWheel tyre name = " + car.getWheels().getTyres().getName() +
                "\nWheel tyre size = " + car.getWheels().getTyres().getSize());
    }
}
