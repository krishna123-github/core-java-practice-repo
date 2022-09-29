package Java8;

import Java8.domain.Person;
import java.util.Arrays;
import java.util.List;

/**
 * AnyMatch(): this one is a simple but very useful function. It takes a
 * predicate (just as filter does); but is different in that this is a terminal
 * operator that returns True as soon as a match is found or False if no match
 * is found.
 *
 * @author krishna
 */
public class StreamPersonList_AnyMatch {

    List<Person> personList = Arrays.asList(new Person("krishna", "krishna@gmail.com", true, 22),
            new Person("Jiten", "jiten@gmail.com", false, 32),
            new Person("Dhrub", "dhrub@gmail.com", true, 17),
            new Person("Pooja", "Pooja@gmail.com", true, 15));

    public static void main(String[] args) {
        StreamPersonList_AnyMatch obj = new StreamPersonList_AnyMatch();
        System.out.println(obj.checkWithoutStreamAPI());
        System.out.println(obj.checkWithStreamAPI_Anymatch());
    }

    private Boolean checkWithoutStreamAPI() {
        boolean isAllowed = false;
        for (Person p : personList) {
            if (p.getAge() > 40) {
                isAllowed = true;
                break;
            }
        }

        return isAllowed;
    }

    private Boolean checkWithStreamAPI_Anymatch() {
        return personList.stream()
                .anyMatch(p -> p.getAge() > 40);
       
    }
}
