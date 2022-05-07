package com.demo;

import com.domain.Employee;

import java.util.LinkedList;
import java.util.List;

public class MainTest {
    List<Employee> list = new LinkedList<>();
    public static void main(String[] args) {
        System.out.println("The Testing show");
        Employee emp1= new Employee("UYT123", 29);
        Employee emp2 = new Employee("OPI290", 48);
        MainTest test = new MainTest();
        test.makelist(emp1);
        test.makelist(emp2);
    }

    public List<Employee> makelist(Employee emp) {
        list.add(emp);
        list.forEach(System.out::println);
        return list;
    }
}
