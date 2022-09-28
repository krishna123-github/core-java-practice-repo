/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author krishna
 */
public class Employee {
    String name;
    Float salary;
    String dep;
    public Employee(String name, Float salary, String dep) {
        this.name = name;
        this.salary = salary;
        this.dep = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }
    
    public static List<Employee> getEmpList(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Krishna", 70000.01f, "Developer"));
        empList.add(new Employee("Parves", 60000.01f, "Tester"));
        empList.add(new Employee("Basant", 90000.01f, "Manager"));
        empList.add(new Employee("Amit", 30000.01f, "BA"));
        empList.add(new Employee("Rahul", 10000.01f, "Analysist"));
        
        return empList;
    }
     public static List<Employee> getEmpListDuplicateRecords(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Krishna", 70000.01f, "Developer"));
        empList.add(new Employee("Amit", 60000.01f, "Tester"));
        empList.add(new Employee("Krishna", 90000.01f, "Manager"));
        empList.add(new Employee("Amit", 30000.01f, "BA"));
        empList.add(new Employee("Rahul", 10000.01f, "Analysist"));
        
        return empList;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + ", dep=" + dep + '}';
    }
        
}
