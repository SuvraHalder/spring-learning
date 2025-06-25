package org.Component_Value_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("org/Component_Value_Annotations/Component.xml");
        Employee employee = context.getBean("employee",Employee.class);

        System.out.println(employee.toString());

    }
}
