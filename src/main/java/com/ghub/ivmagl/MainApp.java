package com.ghub.ivmagl;

import com.ghub.ivmagl.components.Car;
import com.ghub.ivmagl.configuratin.AppConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        Car car = ctx.getBean(Car.class);

        System.out.println("Java - based configuration: ");
        System.out.println("Engine capacity = " + car.getEngine().getEngineCapacity() +
                "\nWheel tyre name = " + car.getWheels().getTyres().getName() +
                "\nWheel tyre size = " + car.getWheels().getTyres().getSize());
    }
}
