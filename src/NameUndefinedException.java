public class NameUndefinedException extends RuntimeException {
    public NameUndefinedException(String e) {
        super(e + "\nKoniec programu");
    }
}
