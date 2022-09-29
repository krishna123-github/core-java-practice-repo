package Java8;

import Java8.domain.InternetAddress;
import Java8.domain.Person;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

/**
 * instead of filtering out the people with age less than 18, I would like to
 * create a map that contains both groups so I can send a different newsletter
 * to them. Doing this in imperative way looks like this:
 *
 * @author krishna
 */
public class StreamPersonListToMap {

    private static String ADULT = "adult", UNDERAGE = "underage";

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("krishna", "krishna@gmail.com", true, 22),
                new Person("Jiten", "jiten@gmail.com", false, 32),
                new Person("Dhrub", "dhrub@gmail.com", true, 17),
                new Person("Pooja", "Pooja@gmail.com", true, 15));

        StreamPersonListToMap sp = new StreamPersonListToMap();
        System.out.println(sp.getInternetAddressImperativeMapExampleMap(personList));

        System.out.println(sp.getInternetAddressImperativeMapExampleMapUsingStreamAPI(personList));
    }

    private Map<String, List<InternetAddress>> getInternetAddressImperativeMapExampleMap(List<Person> people) {
        Map<String, List<InternetAddress>> groupsOfPeople = new HashMap<>();

        for (Person p : people) {
            if (p.isNewsletterOptedIn()) {
                if (p.getAge() > 18) {
                    if (groupsOfPeople.containsKey(ADULT)) {
                        groupsOfPeople.get(ADULT).add(new InternetAddress(p.getEmailAddress()));
                    } else {
                        groupsOfPeople.put(ADULT, new ArrayList<>());
                        groupsOfPeople.get(ADULT).add(new InternetAddress(p.getEmailAddress()));
                    }
                } else {
                    if (groupsOfPeople.containsKey(UNDERAGE)) {
                        groupsOfPeople.get(UNDERAGE).add(new InternetAddress(p.getEmailAddress()));
                    } else {
                        groupsOfPeople.put(UNDERAGE, new ArrayList<>());
                        groupsOfPeople.get(UNDERAGE).add(new InternetAddress(p.getEmailAddress()));
                    }
                }

            }
        }
        return groupsOfPeople;
    }

    /**
     * Convert into map using inside Collect method groupingby and mapping function.
     * collect a map by grouping by the age into two categories Adult and Underage, and map those to an InternetAddress using the email Addres
     * @param personList
     * @return 
     */
    private Map<String, List<InternetAddress>> getInternetAddressImperativeMapExampleMapUsingStreamAPI(List<Person> personList) {
        Map<String, List<InternetAddress>> groupsOfPeople = new HashMap<>();
        return personList.stream()
                .filter(x -> x.isNewsletterOptedIn())
                .collect(groupingBy(p -> p.getAge() > 18 ? ADULT : UNDERAGE,
                        mapping(p -> new InternetAddress(p.getEmailAddress()), Collectors.toList())));

//        return people.stream()
//                .filter(Person::isNewsletterOptedIn)
//                .collect(groupingBy(p -> p.getAge() > 18 ? ADULT : UNDERAGE,
//                        mapping(p -> new InternetAddress(p.getEmailAddress()), Collectors.toList())));
    }
    
}
