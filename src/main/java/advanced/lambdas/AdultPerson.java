package advanced.lambdas;


import java.util.function.Predicate;

public class AdultPerson implements Predicate<Person> {

    // check if person is adult

    @Override
    public boolean test(Person person) {
        return person.getAge() > 18;
    }
}
