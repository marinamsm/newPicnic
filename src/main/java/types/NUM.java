package types;

public class NUM extends Type {

    public static final NUM T = new NUM();

    private NUM() {
    }

    @Override
    public String toString() {
        return "num";
    }
}

