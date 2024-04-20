package com.SpringFramework;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) 
    {
         ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringConfig.xml");
         StudentBean s=   (StudentBean) ctx.getBean("id2");
         System.out.println(s);
    	
    	
    }
}