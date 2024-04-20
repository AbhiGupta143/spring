package com.SpringFramework;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Springconfig.xml");
        StudentBean s= (StudentBean) ctx.getBean("id1");
        		s.display();
    }
}
 