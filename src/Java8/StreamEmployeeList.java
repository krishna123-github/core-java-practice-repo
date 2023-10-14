/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8;

import Java8.domain.Department;
import Java8.domain.Employee;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Cover most of stream API operation on employee-department list
 *
 * @author krishna
 */
public class StreamEmployeeList {

    public static void main(String[] args) {
        Department account = new Department("Account", 75);
        Department hr = new Department("HR", 50);
        Department ops = new Department("OP", 25);
        Department tech = new Department("Tech", 150);
        Department mech = new Department("Mech", 60);

        List<Employee> employeeList = Arrays.asList(new Employee("David", 32, "Matara", account),
                new Employee("Brayan", 25, "Galle", hr),
                new Employee("JoAnne", 45, "Negombo", ops),
                new Employee("Jake", 65, "Galle", hr),
                new Employee("Brent", 55, "Matara", hr),
                new Employee("Allice", 23, "Matara", ops),
                new Employee("Austin", 30, "Negombo", tech),
                new Employee("Gerry", 29, "Matara", tech),
                new Employee("Scote", 20, "Negombo", ops),
                new Employee("Branden", 32, "Matara", account),
                new Employee("Iflias", 31, "Galle", hr));

        System.out.println("1 ===> Find all employees who lives in ‘Matara’ city, sort them by their name and print the names of employees.");
        employeeList.stream()
                .filter(e -> e.getCity().equalsIgnoreCase("Matara"))
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(x -> System.out.println(x.getName()));

        System.out.println("OR - sorting using Comparator class with meyhods");
        employeeList.stream()
                .filter(e -> e.getCity().equalsIgnoreCase("Matara"))
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);   // It print whole employee object
//
//        System.out.println("OR - sorting using Default Asc ");
//        employeeList.stream()
//                .filter(e -> e.getCity().equalsIgnoreCase("Matara"))
//                .sorted()
//                .forEach(System.out::println);

        System.out.println("");

        System.out.println("2 ===> Find distinct department names that employees work for.");
        employeeList.stream()
                .map(e -> e.getDepartment().getDepartmentName())
                .distinct()
                .forEach(System.out::println);

        System.out.println("======================");

        System.out.println("3 ===> Find the department names that these employees work for, where the number of employees in the department is over 50.");
        employeeList.stream()
                .map(Employee::getDepartment)
                .filter(d -> d.getNoOfEmployees() > 50)
                .distinct()
                .forEach(x -> System.out.println(x.getDepartmentName()));

        System.out.println("OR -");
        employeeList.stream()
                .map(Employee::getDepartment)
                .filter(d -> d.getNoOfEmployees() > 50)
                .map(Department::getDepartmentName)
                .distinct()
                .forEach(System.out::println);

        System.out.println("");

        System.out.println("4 ===> Create a comma separate string of department names sorted alphabetically.");
        String s = employeeList.stream()
                .map(e -> e.getDepartment().getDepartmentName())
                .distinct()
                .sorted()
                .reduce("", (s1, s2) -> (s1 + "," + s2)); //reduce(Object, BinaryOperator) acceptiing binay operator - converting in list to comma sepearate string
        System.out.println(s);

        System.out.println("");

        System.out.println("5 ===> Are there any employees from HR Department?  by using anymatch(Predicate) function");
        if (employeeList.stream()
                .anyMatch(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("hr"))) {
            System.out.println("Found employee in HR departments");
        }
        System.out.println("OR === count of HR dep employee ====");
        long l = employeeList.stream()
                .filter(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("hr"))
                .count();
        System.out.println(l);

        System.out.println("6 ==> Print all employee’s name who are working for account department.");
        employeeList.stream()
                .filter(e -> e.getDepartment().getDepartmentName().equalsIgnoreCase("account"))
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("7 ===> What is the highest number of of employees in all departments?");
        employeeList.stream()
                .map(e -> e.getDepartment().getNoOfEmployees())
                .reduce(Integer::max) // reduce(BinnaryOperator) Max, Min ke liye reduce ka use kr sakte h 
                .ifPresent(System.out::println);
        System.out.println("OR");
        employeeList.stream()
                .map(e -> e.getDepartment().getNoOfEmployees())
                .reduce((d1, d2) -> d1 > d2 ? d1 : d2)
                .ifPresent(System.out::println);

        System.out.println("8 ===> Find the department which has the highest number of employees.");
        employeeList.stream()
                .map(Employee::getDepartment)
                .reduce((d1, d2) -> d1.getNoOfEmployees() > d2.getNoOfEmployees() ? d1 : d2)
                .ifPresent(d -> System.out.println(d.getDepartmentName()));

        System.out.println("OR - same thing by max method");

        employeeList.stream()
                .map(Employee::getDepartment)
                .max(Comparator.comparing(Department::getNoOfEmployees))
                .ifPresent(d -> System.out.println(d.getDepartmentName()));

        System.out.println("9 ===> Find the total number of employees in all the departments.");
        employeeList.stream()
                .map(e -> e.getDepartment().getNoOfEmployees())
                .reduce(Integer::sum)   /// single value get karne ke liye reduce lgate h 
                .ifPresent(System.out::println);

        System.out.println("10 ===>findAny- Find any employee which is in hr departments.");
        employeeList.stream()
                .filter(x -> x.getDepartment().getDepartmentName().equalsIgnoreCase("hr"))
                .findAny()
                .ifPresent(x -> System.out.println(x.getName()));

        System.out.println("10 ===>findAny- Find first employee which is in hr departments.");
        employeeList.stream()
                .filter(x -> x.getDepartment().getDepartmentName().equalsIgnoreCase("hr"))
                .findFirst()
                .ifPresent(x -> System.out.println(x.getName()));

    }
}
