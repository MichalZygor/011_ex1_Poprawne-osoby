public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String pesel;

    public Person(String firstName, String lastName, int age, String pesel) {
        checkPreconditionsNames(firstName, "Imię");
        checkPreconditionsNames(lastName, "Nazwisko");
        checkPreconditionsAge(age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    private void checkPreconditionsNames(String name, String description) {
        if (name == null || name.length() < 2)
            throw new NameUndefinedException(description + " jest nieprawidłowe: " + name);
    }

    private void checkPreconditionsAge(int age) {
        if (age < 1) throw new IncorrectAgeException("Podany wiek jest nieprawidłowy: " + age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkPreconditionsNames(firstName, "Imię");
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        checkPreconditionsNames(firstName, "Nazwisko");
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        checkPreconditionsAge(age);
        this.age = age;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                '}';
    }
}
