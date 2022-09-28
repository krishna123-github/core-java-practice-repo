/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8;

import Java8.domain.Employee;
import java.util.*;
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

        // 1 Print emp name only.
        empList.stream().forEach(x -> System.out.println(x.getName() + " "));

        // 2. Get name list x.getName() +" "
        List l = empList.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(l);

        // 3. get name list filter by salary grater then 50000
        List l2 = empList.stream().filter(x -> x.getSalary() > 50000).map(Employee::getName).collect(Collectors.toList());
        System.out.println(l2);

        // 4. get Map of employee + dep
        Map m = empList.stream().collect(Collectors.toMap(Employee::getName, Employee::getDep));
        System.out.println(m);

        // 5. Get map employe with therir departments   Amit-->tester, BA
        List<Employee> empList2 = Employee.getEmpListDuplicateRecords();
        Map<String, List<String>> empDepMap = new HashMap<>();
//        empList2.stream().forEach(e -> empDepMap.computeIfAbsent(e.getName(), d -> new ArrayList(e.getDep())));
    }
}
