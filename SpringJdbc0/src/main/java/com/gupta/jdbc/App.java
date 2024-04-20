package com.gupta.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gupta.jdbc.Entities.Student;
import com.gupta.jdbc.dao.StudentDao;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("My program started ................." );
        // spring JDBC -> JDBC Template
        
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
       
         StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
         Student student = new Student();
         student.setId(124);
         student.setName("Srijeeta");
         student.setCity("Kolkata");
        
               
//         Student student = new Student();
//         student.setId(2860);
//         student.setName("Shresth Mathur");
//         student.setCity("Jharkhand");
//  
//         Student student = new Student();
//         student.setId(127);
//         student.setName("Suporna");
//         student.setCity("Kolkata");
         
         int result = studentDao.insert(student);
         
         System.out.println(" Record Inserted"+result);
         
////         Student student = new Student();
////         student.setId(111);
////         student.setName("Abhishek Gupta");
////         student.setCity("Delhi");
////         
////         int result = studentDao.change(student);
////         
////         System.out.println("Student Updated"+ result);
//         
//         
//         // Delete opn
//      int result =   studentDao.delete(112);
//      System.out.println("Deleted Record"+ result);
    }
}




