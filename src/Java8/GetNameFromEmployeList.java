/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8;

import Java8.domain.Department;
import Java8.domain.Employee;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Get operation on employee list 1. Print emp name only. 2. Get name list 3.
 * get name list filter by salary grater then 50000
 *
 * @author krishna
 */
public class GetNameFromEmployeList {

    public static void main(String[] args) {
        List<Employee> empList = Employee.getEmpList();

        System.out.println("1 Print emp name only.");
        empList.stream().forEach(x -> System.out.println(x.getName() + " "));

        // 2. Get name list x.getName() +" "
        System.out.println("2. Get name list x.getName() +\" \"");
        List l = empList.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(l);

        System.out.println("3. get name list filter by salary grater then 50000");
        List l2 = empList.stream().filter(x -> x.getSalary() > 50000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(l2);

        System.out.println("4. get Map of (employeeName, dep)");
        Map m = empList.stream().collect(Collectors.toMap(Employee::getName, Employee::getDep));
        System.out.println(m);

        System.out.println("5. Get map employe with their departments   Amit-->tester, BA");
        List<Employee> empList2 = Employee.getEmpListDuplicateRecords();
//        empList2.stream().forEach(e -> empDepMap.computeIfAbsent(e.getName(), d -> new ArrayList(e.getDep())));

        System.out.println("6. Get map Department with their highest salary employess    BA -> Neha");
        Map<String, Optional<Employee>> collect = Employee.getEmpList().stream()
                .collect(Collectors
                        .groupingBy(Employee::getDep,
                                Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getDep))))
                );
        System.out.println(collect);
        System.out.println("OR"); 
        Map<String, Employee> collect3 = Employee.getEmpList().stream()
                .collect(Collectors
                        .groupingBy(Employee::getDep,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)
                        )
                );
        System.out.println(collect3);

        System.out.println("7. Get map Department with their  employess count   BA -> 3");
        Map<String, Long> collect1 = Employee.getEmpList().stream()
                .collect(Collectors
                        .groupingBy(Employee::getDep,  Collectors.counting())
                );
        System.out.println(collect1);

        System.out.println("8. Get map Department with their  employess object list   BA -> List[Neha, moni, amit]");
        Map<String, List<Employee>> collect2 = Employee.getEmpList().stream()
                .collect(Collectors
                        .groupingBy(Employee::getDep,
                                Collectors.toList())
                );
        System.out.println(collect2);

    }
}
