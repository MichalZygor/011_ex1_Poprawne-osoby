public class PersonExceptionTest {
    public static void main(String[] args) {
        try {
            Person person = new Person("Jan", null, 25, "1234567890");
            System.out.println(person);
            Person person1 = new Person("Jan", "Kowalski", 25, "1234567890");
            System.out.println(person1);
            person1.setAge(-10);
            System.out.println(person1);
        } catch (NameUndefinedException e) {
            System.err.println(e.getMessage());
        } catch (IncorrectAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}
