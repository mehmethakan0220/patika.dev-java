package BoksTurnuvasi;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter();
        Fighter f2 = new Fighter();

        Match match = new Match(f1,f2);
        match.run();
    }
}
