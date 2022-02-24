package com.iisn.collectionSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("xmlCollection.xml");
        StudentCollections pc=(StudentCollections) ac.getBean("collect");
        pc.printInfo();
    }
}