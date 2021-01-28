package org.mdtis.SpringAutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context1 = new ClassPathXmlApplicationContext("context.xml");
 	   
        Employee employee = (Employee) context1.getBean("emp");       
        System.out.println(employee);
}
}