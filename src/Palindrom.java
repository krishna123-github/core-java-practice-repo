
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author krishna
 */
public class Palindrom {

    public static void main(String[] args) {
        String str = "radar1";

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if (str.equals(sb.toString())) {
            System.out.println("palindrom");
        } else {
            System.out.println("Not");
        }
    }

    private void upperCase(String str) {
        //System.out.printf(str, args)
        for (int i = 0; i < str.length(); i++) {
            System.out.println("");
        }
    }

    private void demo() {
        Employee a1 = new Employee("7", 43500);

       // Employee a2 = new Employee("1", 2000);
        Employee a3 = new Employee("2", 20000);
        Employee a4 = new Employee("3", 30000);
        Employee a5 = new Employee("4", 22000);
        Employee a6 = new Employee("5", 32000);
        Employee a7 = new Employee("6", 15000);

        List<Employee> empList = new ArrayList<>();

        empList.add(a1);
       // empList.add(a2);
        empList.add(a3);
        empList.add(a4);
        empList.add(a5);
        empList.add(a6);
        empList.add(a7);
        
        List<Employee> el =  empList.stream()
                .map(e -> new Employee (e.getId(),  (e.getSalary() < 20000 ?  (e.getSalary() + 7000) : e.getSalary())))
                .collect(Collectors.toList());
        
         el.stream()
                 .map(Employee :: getSalary)
                 .reduce(Integer :: min)
                 .ifPresent(System.out :: print);

    }

}

class Employee {

    String id;
    Integer salary;

    public Employee(String id, Integer salary) {
        this.id = id;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    
    

}
