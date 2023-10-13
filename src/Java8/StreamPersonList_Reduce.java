package Java8;

import Java8.domain.Person;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Reduce(): The reduce function is the last gem of this post. Widely used in
 * data processing as part of the MapReduce process. Reduce() takes a stream of
 * events and performs a reduction into a single result (think of it as a
 * summary) of all the elements in the stream.
 *
 * @author krishna
 */
public class StreamPersonList_Reduce {

    List<Person> personList = Arrays.asList(
            new Person("krishna", "krishna@gmail.com", true, 22),
            new Person("Jiten", "jiten@gmail.com", false, 32),
            new Person("Dhrub", "dhrub@gmail.com", true, 17),
            new Person("Pooja", "Pooja@gmail.com", true, 15));

    public static void main(String[] args) {
        StreamPersonList_Reduce obj = new StreamPersonList_Reduce();
        obj.useReduceMethod_getMaxAge();
        obj.useReduceMethod_getMaxInt();
        obj.useReduceMethod_getMaxString();
    }

    /**
     * we can get the maximum age of the list of people that we used on previous
     * examples very easily:
     */
    private void useReduceMethod_getMaxAge() {
        System.out.println(" MAX AGE ============");
        System.out.println(personList.stream()
                .map(Person::getAge)
                .reduce((max, age) -> age > max ? age : max));

        System.out.println(personList.stream()
                .map(Person::getAge)
                .reduce(Integer::max));

        System.out.println(personList.stream()
                .map(Person::getAge)
                .max((max, age) -> age > max ? -1 : 1));

        System.out.println(personList.stream()
                .map(Person::getAge)
                .max(Integer :: max));

        System.out.println(personList.stream()
                .max(Comparator.comparing(Person::getAge)));
    }

    /**
     * we can get the maximum integer from the Integer list examples very
     * easily:
     */
    private void useReduceMethod_getMaxInt() {
        Arrays.asList(1, 2, 5, 6, 3).stream()
                .reduce((max, temp) -> temp > max ? temp : max)
                .ifPresent(System.out::println);

        Arrays.asList(1, 2, 5, 6, 3).stream()
                .reduce(Integer::max) // reduce() 
                .ifPresent(System.out::println);

        // Wrong 
        Arrays.asList(1, 2, 5, 6, 3).stream()
                .max(Integer::max) // max(Comparator)
                .ifPresent(System.out::println);
        // Wrong 
        Arrays.asList(1, 2, 5, 6, 3).stream()
                .max((max, temp) -> temp > max ? -1 : 1)
                .ifPresent(System.out::println);
    }

    /**
     * we can get the maximum integer from the Integer list examples very
     * easily:
     */
    private void useReduceMethod_getMaxString() {
        System.out.println("===========using max");
        Arrays.asList("Rahul", "prakash", "Krishna", "pradeep", "Amit").stream()
                .max((max, temp) -> max.compareTo(temp))
                .ifPresent(System.out::println);

        System.out.println("===========using reduce");
        Arrays.asList("Rahul", "prakash", "Krishna", "pradeep", "Amit").stream()
                .reduce((max, temp) -> max.compareTo(temp) > 1 ? max : temp)
                .ifPresent(System.out::println);

        System.out.println("Asc: if all starts with capial/small letter then only it will do proper shorting================");
        Arrays.asList("Rahul", "Prakash", "Krishna", "Pradeep", "Amit").stream()
                .sorted((x1, x2) -> x1.compareTo(x2)) // can use sort like this
                .forEach(System.out::println);
        System.out.println("Asc: if all are not starts with capial/small letter then not do proper sorting===============");
        Arrays.asList("Rahul", "prakash", "krishna", "Pradeep", "Amit").stream()
                .sorted()
                .forEach(System.out::println);
    }
}
