/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8;

import Java8.domain.Invoice;
import Java8.domain.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author krishna
 */
public class StreamListToSet {

    public static void main(String[] args) {
        List<Invoice> list = Arrays.asList(new Invoice("011", "krishna", 200.0),
                new Invoice("011", "krishna", 200.0),
                new Invoice("012", "Amit", 300.0));

        Set set = list.stream()
                .collect(Collectors.toSet());
        System.out.println(set);
        
        System.out.println(" OR  -- By using distinct method");
        List l1 = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(l1);
    }
}
