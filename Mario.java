/**
 *  * Mario class - a virtual pet based on the Mario character from the
 * Super Mario Bros universe. Mario can climb flagpoles, enter pipes,
 * attack Goombas, gain coins, and perform other actions that affect
 * his health, energy, and happiness.
 *
 * Implements the VirtualPet interface.
 */

import java.util.Random;

public class Mario {

    // -------------------------
    // Instance Variables
    // -------------------------

    private String name;
    int health;         //
    int energy;
    int happiness;
    private int coins;

    private Random rand = new Random(); // for random events

    // -------------------------
    // Static Variables
    // -------------------------

    /** Tracks total coins collected by ALL Mario instances */
    private static int totalCoinsCollected = 0;

    // -------------------------
    // Constructor
    // -------------------------

    /**
     * Constructs a new Mario pet with default stats.
     * @param name The name of the Mario character.
     */
    public Mario(String name) {
        this.name = name;
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
        this.coins = 0;
    }

    // -------------------------
    // Getters
    // -------------------------

    public String getName() {
        return this.name;
    }

    /**
     * @return total coins collected across all Mario instances
     */
    public static int getTotalCoinsCollected() {
        return totalCoinsCollected;
    }

    // -------------------------
    // Required Interface Methods
    // -------------------------

    /**
     * Feeding Mario gives him a Super Mushroom!
     * Increases health but may reduce happiness if he's not hungry.
     */
    public void feed() {
        System.out.println(name + " eats a Super Mushroom!");

        this.health += 15;
        this.energy += 5;

        if (health > 100) this.health = 100;

        randomEvent();
    }

    /**
     * Playing with Mario involves jumping around!
     * This increases happiness but costs energy.
     */
    public void play() {
        System.out.println(name + " jumps around happily!");

        this.happiness += 10;
        this.energy -= 15;

        if (happiness > 100) this.happiness = 100;
        if (energy < 0) this.energy = 0;

        randomEvent();
    }

    /**
     * Resting restores Mario’s energy.
     */
    public void rest() {
        System.out.println(name + " takes a nap in a warp pipe...");

        this.energy += 25;
        if (energy > 100) energy = 100;

        randomEvent();
    }

    /**
     * Displays Mario's stats.
     */
    public void showStats() {
        System.out.println("----- Mario Stats -----");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Energy: " + energy);
        System.out.println("Happiness: " + happiness);
        System.out.println("Coins (Personal): " + coins);
        System.out.println("Coins (Global): " + Mario.getTotalCoinsCollected());
        System.out.println("------------------------");
    }

    // -------------------------
    // Mario-Specific Behaviors
    // -------------------------

    /**
     * Mario gains a coin! Adds to both his personal coin count
     * and the global total coin count shared by all Marios.
     */
    public void gainCoin() {
        System.out.println(name + " collected a coin!");

        this.coins++;
        Mario.totalCoinsCollected++;      // static variable update

        this.happiness += 5;

        if (happiness > 100) happiness = 100;

        randomEvent();
    }

    /**
     * Mario climbs a flagpole, which costs energy but boosts happiness.
     */
    public void climbFlagpole() {
        System.out.println(name + " climbed the flagpole!");

        this.energy -= 20;
        this.happiness += 15;

        if (energy < 0) energy = 0;
        if (happiness > 100) happiness = 100;

        randomEvent();
    }

    /**
     * Mario enters a pipe — the destination is random!
     */
    public void enterPipe() {
        System.out.println(name + " entered a warp pipe...");

        int event = rand.nextInt(3);

        if (event == 0) {
            System.out.println("He found a secret room full of coins!");
            this.coins += 10;
            Mario.totalCoinsCollected += 10;
            this.happiness += 10;
        } else if (event == 1) {
            System.out.println("He ended up in an underground level!");
            this.energy -= 10;
        } else {
            System.out.println("He warped to the flagpole area!");
            this.happiness += 5;
        }

        clampStats();
        randomEvent();
    }

    /**
     * Mario attacks a Goomba — might hurt Mario if it goes badly.
     */
    public void attackGoomba() {
        System.out.println(name + " attacks a Goomba!");

        int chance = rand.nextInt(100);

        if (chance < 70) {
            System.out.println("Success! The Goomba was squashed.");
            this.happiness += 8;
            this.energy -= 10;
        } else {
            System.out.println("Oh no! The Goomba hit back!");
            this.health -= 20;
            this.energy -= 15;
        }

        clampStats();
        randomEvent();
    }

    // -------------------------
    // Helper Methods
    // -------------------------

    /**
     * Ensures stats stay between 0 and 100.
     */
    private void clampStats() {
        if (health < 0) health = 0;
        if (health > 100) health = 100;

        if (energy < 0) energy = 0;
        if (energy > 100) energy = 100;

        if (happiness < 0) happiness = 0;
        if (happiness > 100) happiness = 100;
    }

    /**
     * Random event that may happen after each action.
     */
    private void randomEvent() {
        int roll = rand.nextInt(10);

        if (roll == 0) {
            System.out.println("⭐ Lucky! Mario found a Power Star!");
            this.happiness += 20;
        } 
        else if (roll == 1) {
            System.out.println("💥 Oh no! Mario tripped over a Koopa shell.");
            this.health -= 10;
        }

        clampStats();
    }
}
