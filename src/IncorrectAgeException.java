public class IncorrectAgeException extends RuntimeException {
    public IncorrectAgeException(String e) {
        super(e + "\nKoniec programu");
    }
}
