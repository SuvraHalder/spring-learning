package org.LibrarySystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APP {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Library_System.xml");
        Library b =(Library) context.getBean("myLibrary");
        System.out.println(b.toString());

    }
}
