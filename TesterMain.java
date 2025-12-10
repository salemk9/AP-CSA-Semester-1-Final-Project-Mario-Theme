public class TesterMain {
    public static void main(String[] args) {
        Wario wario = new Wario(100, 1500, 10, "Large", "Greedy");
        wario.displayStatus();

        System.out.println("--- Wario takes action ---");
        wario.mugSomeone();
        wario.eatGarlic();
        wario.donateCharity();
        wario.releaseSteam();
        wario.displayStatus();
    }
}
