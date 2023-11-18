public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Programmer(),
                new Dancer(),
                new Singer()
        };
        for (int i = 0; i < people.length; i++) {
            walkPerson(people[i]);
        }
    }

    public static void walkPerson(Person person){
        person.walk();
    }
}
