package com.orm.dao;

import com.orm.Model.Employee2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDao {
    @Autowired
    HibernateTemplate template;
    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
    //method to save employee
    @Transactional
    public void saveEmployee(Employee2 e){
        template.save(e);
    }
    //method to update employee
    @Transactional
    public void updateEmployee(Employee2 e){
        template.update(e);
    }
    //method to delete employee
    @Transactional
    public void deleteEmployee(int id){
     Employee2 employee2=template.get(Employee2.class,id);
        template.delete(employee2);


    }
    //method to return one employee of given id
    public Employee2 getById(int id){
        Employee2 e=(Employee2)template.get(Employee2.class,id);
        return e;
    }
    //method to return all employees
    public List<Employee2> getEmployees(){
        List<Employee2> list=new ArrayList<Employee2>();
        list=template.loadAll(Employee2.class);
        return list;
    }
}
