/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8;

import Java8.domain.InternetAddress;
import Java8.domain.Person;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author krishna
 */
public class StreamPersonListToList {

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("krishna", "krishna@gmail.com", true, 22),
                new Person("Jiten", "jiten@gmail.com", false, 32),
                new Person("Dhrub", "dhrub@gmail.com", true, 19));

        System.out.println("1===> people is simple a list of Person, with a name and email address");
        List<InternetAddress> listOfEmail = new ArrayList<>();
        for (Person p : personList) {
            listOfEmail.add(new InternetAddress(p.getEmailAddress()));
        }
        System.out.println(listOfEmail);

        System.out.println("OR = via stream api");
        List l = personList.stream()
                .map(Person::getEmailAddress)
                .map(InternetAddress::new)
                .collect(Collectors.toList());
        System.out.println(l);

        System.out.println("OR = via stream api");
        List l2 = personList.stream()
                .map(x -> x.getEmailAddress())
                .map(x -> new InternetAddress(x))
                .collect(Collectors.toList());
        System.out.println(l2);

        System.out.println("2===> Get email from persona where newsletter is opted in");
        List<InternetAddress> l3 = new ArrayList<>();
        for (Person p : personList) {
            if (p.isNewsletterOptedIn()) {
                l3.add(new InternetAddress(p.getEmailAddress()));
            }
        }
        System.out.println(l3);

        System.out.println("OR = via stream api");
        List l4 = personList.stream()
                .filter(x -> x.isNewsletterOptedIn())
                .map(Person::getEmailAddress)
                .map(InternetAddress::new)
                .collect(Collectors.toList());
        System.out.println(l4);

        System.out.println("3===> Get email from persona where newsletter is opted in and age is greatter then 20");
        List l5 = personList.stream()
                .filter(x -> x.isNewsletterOptedIn())
                .filter(x -> x.getAge() > 20)
                .map(Person :: getEmailAddress)
                .map(InternetAddress :: new)
                .collect(Collectors.toList());
        System.out.println(l5);
    }
}
