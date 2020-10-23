package com.cybertek;

import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("java",Course.class);

        Course course2 = container.getBean("java",Course.class);

        System.out.println("Potting to same object: " + (course1==course2));

        System.out.println("Memory location of the course1 : " + course1);
        System.out.println("Memory location of the course2 : " + course2);
    }
}
