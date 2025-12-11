import java.util.Random;

/**
 * Luigi class — models a virtual character with health, energy, happiness,
 * and scaredness. Includes actions that modify these stats and trigger
 * random world events.
 * 
 * Author: Sam Ho
 * Collaborators: Copilot
 */
public class luigi implements VirtualPet {

    // Instance variables representing Luigi's current status
    private String name;
    int health;
    int energy;
    int happiness;
    private int scaredLevel;

    // Random number generator for unpredictable events
    private Random rand = new Random();

    /**
     * Constructor: initializes Luigi with default maximum stats.
     */
    public luigi(String name) {
        this.name = name;
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
        this.scaredLevel = 10;
    }

    /**
     * randomEvent: Occasionally triggers after actions. 
     * May boost or reduce stats (e.g., meeting Mario or being hit by a Goomba).
     * Helps simulate a dynamic game world.
     */
    private void randomEvent() {
        int roll = rand.nextInt(10);

        if (roll == 0) {
            System.out.println(this.name +  "ran into Mario and they shared a happy reunion!");
            this.happiness += 20;
        }
        else if (roll == 1){
            System.out.println("A Goomba sprang out and tripped " + this.name + ", leaving him ouch-y and glum.");
            this.health -= 20;
            this.happiness -= 15;
        }
        
        clampStats();
    }

    /**
     * clampStats: Keeps all stats in the valid range 0–100.
     * Prevents invalid values from affecting gameplay.
     */
    private void clampStats() {
        if (this.health < 0) this.health = 0;
        if (this.health > 100) this.health = 100;
        if (this.energy < 0) this.energy = 0;
        if (this.energy > 100) this.energy = 100;
        if (this.happiness < 0) this.happiness = 0;
        if (this.happiness > 100) this.happiness = 100;
        if (this.scaredLevel < 0) this.scaredLevel = 0;
        if (this.scaredLevel > 100) this.scaredLevel = 100;
    }

    // ----------------------- Getter Methods -----------------------
    // Provide access to private stats while maintaining encapsulation.

    public int getEnergy() {
        return this.energy;
    }

    public int getScaredLevel() {
        return this.scaredLevel;
    }

    public int getHealth() {
        return this.health;
    }

    public int getHappiness() {
        return this.happiness;
    }

    // ----------------------- Action Methods -----------------------
    // Each method models something Luigi can do in the game,
    // modifying his stats and sometimes triggering random events.

    /**
     * feed: Eating a mushroom restores health and energy.
     */
    public void feed() {
        System.out.println(name + " eats a Super Mushroom!");

        this.health += 15;
        this.energy += 5;

        if (health > 100) this.health = 100;

        randomEvent();
    }

    /**
     * play: Increases happiness but reduces energy.
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
     * rest: Recovers energy and may trigger a random event.
     */
    public void rest() {
        System.out.println(name + " takes a nap in a warp pipe...");

        this.energy += 25;
        if (energy > 100) energy = 100;

        randomEvent();
    }

    /**
     * findMushroom: Increases health and prints a themed message.
     */
    public void findMushroom() {
        this.health += 20;
        clampStats();
        System.out.println(this.name + " plucks a glowing mushroom with a cheerful \"wa-hoo!\" and feels his health bounce up like a cartoon heart.");
        randomEvent();
    }

    /**
     * exploreMansion: A spooky action that raises scared level
     * and decreases both happiness and energy.
     */
    public void exploreMansion() {
        this.scaredLevel += 15;
        this.happiness -= 10;
        this.energy -= 20;
        clampStats();
        System.out.println("Tiptoeing through the creaky mansion, " + this.name + " felt scared and unhappy.");
        randomEvent();
    }

    /**
     * questionBlock: Has a 50/50 chance of producing a mushroom
     * or summoning a Boo. Small energy cost included.
     */
    public void questionBlock() {
        System.out.println(this.name + " leaps up and slams the question block with a hopeful grin.");
        int event = rand.nextInt(2); // 0 = mushroom (good), 1 = Boo (bad)
        if (event == 0) {
            this.health += 15;
            System.out.println("A mushroom pops out with a comical 'boing!' — " + this.name + " feels a little more lively.");
        } else {
            // Boo appears
            this.scaredLevel += 30; // dramatic increase
            this.happiness -= 25;
            System.out.println("A Boo pops out with a hollow 'ooo!' — " + this.name.toLowerCase() + " felt scared and unhappy.");
        }

        this.energy -= 5;
        clampStats();
    }

    /**
     * attackBoo: Luigi uses his vacuum to defeat a Boo.
     * Lowers scaredness but consumes energy.
     */
    public void attackBoo() {
        System.out.println(this.name + " whips out the vacuum and lets out a heroic 'Suuuuck!' to pull the Boo in.");
        this.scaredLevel -= 25;
        this.energy -= 20;
        clampStats();
        System.out.println(this.name + " sucked the Boo into the vacuum and felt braver but a little tired.");
        randomEvent();
    }

    /**
     * showStats: Displays all current stats in a single readable line.
     */
    public void showStats() {
        System.out.println(this.name + "'s stats — Health: " + this.health + 
        ", Energy: " + this.energy + ", Happiness: " + this.happiness + ", Scared Level: " + this.scaredLevel + ".");
    }
}
