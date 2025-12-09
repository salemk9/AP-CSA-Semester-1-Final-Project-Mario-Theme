/**
 * Bowser class - a virtual pet based on the main villain of
 * the Super Mario Bros universe. Bowser can breathe fire, roar,
 * throw hammers, retreat into his shell, and perform powerful actions
 * that impacts his health, energy, and happiness.
 *
 * Implements the VirtualPet interface.
 */

import java.util.Random;

public class Bowser {

    // -------------------------
    // Instance Variables
    // -------------------------

    private String name;
    private int health;
    private int energy;
    private int happiness;
    private int rageLevel; // Bowser-specific stat

    private Random rand = new Random();

    // Static variable example
    private static int bowserCount = 0;

    // -------------------------
    // Constructor
    // -------------------------

    /**
     * Constructs a new Bowser pet with default stats.
     * @param name The name of the Bowser character.
     */
    public Bowser(String name) {
        this.name = name;
        this.health = 120;     // Bowser is stronger than most pets
        this.energy = 80;
        this.happiness = 60;
        this.rageLevel = 0;

        bowserCount++;
    }

    // -------------------------
    // Getters
    // -------------------------

    public String getName() {
        return this.name;
    }

    public static int getBowserCount() {
        return bowserCount;
    }

    // -------------------------
    // Required Interface Methods
    // -------------------------

    /**
     * Feeding Bowser gives him meat, which restores strength.
     */
    
    public void feed() {
        System.out.println(name + " devours a giant roast!");

        this.health += 10;
        this.energy += 15;

        if (health > 150) health = 150; // Bowser's max is higher

        randomEvent();
    }

    /**
     * Playing with Bowser usually means causing destruction.
     * This increases happiness but raises rage and drains energy.
     */
    
    public void play() {
        System.out.println(name + " stomps around joyfully... or angrily?");

        this.happiness += 10;
        this.energy -= 10;
        this.rageLevel += 5;

        clampStats();
        randomEvent();
    }

    /**
     * Bowser rests on his lava throne.
     */
    
    public void rest() {
        System.out.println(name + " relaxes on his lava throne...");

        this.energy += 25;
        this.rageLevel -= 5;

        clampStats();
        randomEvent();
    }

    /**
     * Displays Bowser's stats.
     */
    
    public void showStats() {
        System.out.println("===== Bowser Stats =====");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
        System.out.println("Rage Level: " + rageLevel);
        System.out.println("========================");
    }

    // -------------------------
    // Bowser-Specific Behaviors
    // -------------------------

    /**
     * Bowser breathes fire — a powerful attack that drains energy.
     */
    public void breatheFire() {
        System.out.println(name + " breathes a massive stream of fire!");

        this.energy -= 25;
        this.rageLevel += 10;
        this.happiness += 5;

        clampStats();
        randomEvent();
    }

    /**
     * Bowser roars loudly, intimidating everyone nearby.
     */
    public void roar() {
        System.out.println(name + " lets out a thunderous roar!");

        this.happiness += 8;
        this.energy -= 5;

        randomEvent();
        clampStats();
    }

    /**
     * Bowser throws hammers like in the classic games.
     */
    public void throwHammers() {
        System.out.println(name + " throws a volley of hammers!");

        this.energy -= 20;
        this.rageLevel += 8;

        if (rand.nextInt(100) < 40) {
            System.out.println("A hammer hit Mario square in the face!");
            this.happiness += 15;
        }

        clampStats();
        randomEvent();
    }

    /**
     * Bowser retreats into his shell for defense.
     */
    public void retreatShell() {
        System.out.println(name + " retreats into his spiked shell!");

        this.health += 10;
        this.energy -= 5;
        this.happiness -= 3;

        clampStats();
        randomEvent();
    }

    /**
     * Bowser kidnaps Princess Peach — classic villain move!
     */
    public void kidnapPeach() {
        System.out.println(name + " kidnaps Princess Peach!");

        this.happiness += 20;
        this.energy -= 15;
        this.rageLevel += 15;

        // Chance Mario tries to save her
        if (rand.nextInt(100) < 30) {
            System.out.println("Mario attempts a rescue! Bowser takes damage.");
            this.health -= 20;
        }

        clampStats();
        randomEvent();
    }

    // -------------------------
    // Helper Methods
    // -------------------------

    /**
     * Ensures stats remain within reasonable bounds.
     */
    private void clampStats() {
        if (health < 0) health = 0;
        if (health > 150) health = 150;

        if (energy < 0) energy = 0;
        if (energy > 100) energy = 100;

        if (happiness < 0) happiness = 0;
        if (happiness > 120) happiness = 120;

        if (rageLevel < 0) rageLevel = 0;
        if (rageLevel > 100) rageLevel = 100;
    }

    /**
     * Random surprise events unique to Bowser.
     */
    private void randomEvent() {
        int roll = rand.nextInt(12);

        if (roll = 0) {
                System.out.println("🔥 Bowser found a Fire Flower! His power surges.");
                this.happiness += 10;
                this.rageLevel -= 5;
       }

       if (roll = 1) {
                System.out.println("💥 Bowser accidentally stepped on a Bob-omb!");
                this.health -= 15;
       }

       if (roll = 2) {
                System.out.println("👑 Bowser discovers a new kingdom to conquer!");
                this.happiness += 15;
       }

        if (roll = 3) {
                System.out.println("⚔️ Mario ambushed Bowser!");
                this.health -= 10;
                this.rageLevel += 10;
        }
        

        clampStats();
    }
}

