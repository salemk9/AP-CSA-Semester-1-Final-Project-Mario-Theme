public class TesterMain {
    public static void main(String[] args) {
        // Create a Wario object with initial attributes
        Wario wario = new Wario(80, 200, 30, "Medium", "Neutral", 50, 70, "Wario");

        // Display initial status
        System.out.println("Initial Status:");
        wario.displayStatus();

        // Test the feed() method
        System.out.println("\nTesting feed() method:");
        wario.feed();

        // Test the play() method
        System.out.println("\nTesting play() method:");
        wario.play();

        // Test the releaseSteam() method
        System.out.println("\nTesting releaseSteam() method:");
        wario.releaseSteam();

        // Test the rest() method
        System.out.println("\nTesting rest() method:");
        wario.rest();

        // Test the setters and getters
        System.out.println("\nTesting setters and getters:");
        wario.setHealth(90);
        wario.setWealth(150);
        wario.setMusk(20);
        wario.setSize("Large");
        wario.setMood("Happy");

        System.out.println("Updated Health: " + wario.getHealth());
        System.out.println("Updated Wealth: " + wario.getWealth());
        System.out.println("Updated Musk: " + wario.getMusk());
        System.out.println("Updated Size: " + wario.getSize());
        System.out.println("Updated Mood: " + wario.getMood());

        // Display final status
        System.out.println("\nFinal Status:");
        wario.displayStatus();
    }
}
