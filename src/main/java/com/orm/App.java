package com.orm;

import com.orm.Model.Employee2;
import com.orm.dao.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao employeeDao= ctx.getBean("d",EmployeeDao.class);

        Employee2 employee2=new Employee2(122,"jkfjkd",63783);
       employeeDao.saveEmployee(employee2);
      // employeeDao.deleteEmployee(13);
        List<Employee2> users = employeeDao.getEmployees();
       System.out.println(users);
        //System.out.println(employeeDao.getById(13));
    }
}
