package org.Loose_Coupling_Challenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/Loose_Coupling_Challenge/Loose_Coupling.xml");
        UserManager manager = (UserManager) context.getBean("Manager1");
        manager.getUserDetails();

        manager =  (UserManager) context.getBean("Manager2");
        manager.getUserDetails();

        manager =  (UserManager) context.getBean("Manager3");
        manager.getUserDetails();


    }
}
