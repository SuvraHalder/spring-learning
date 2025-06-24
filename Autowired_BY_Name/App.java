package org.Autowired_BY_Name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("org/Autowired_BY_Name/AutoWire.xml");
        CAR mycar = (CAR) context.getBean("myCar");

        mycar.displayDeatails();



    }


}
