import java.util.Random;

public class luigi {
    private String name;
    int health;
    int energy;
    int happiness;
    private int scaredLevel;
    private Random rand = new Random(); // for random events

    // constructor
    public luigi(String name) {
        this.name = name;
        this.health = 100;
        this.energy = 100;
        this.happiness = 100;
        this.scaredLevel = 10;
    }

    // Random event helper: world events that may occur after actions
    //  - Luigi meets Mario (happiness up)
    //  - Luigi gets hit by a Goomba (health and happiness down)
    private void randomEvent() {
        int roll = rand.nextInt(100); // 0-99
        // 30% chance that a random world event happens after an action
        if (roll < 30) {
            int which = rand.nextInt(2); // 0 = Mario, 1 = Goomba
            if (which == 0) {
                this.happiness += 20;
                System.out.println(this.name + " ran into Mario and they shared a happy reunion!");
            } else {
                this.health -= 20;
                this.happiness -= 15;
                System.out.println("A Goomba sprang out and tripped " + this.name.toLowerCase() + ", leaving him ouch-y and glum.");
            }
            clampStats();
        }
    }

    // Helper: clamp all stats to the 0-100 range
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

    // getter methods
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

    // Behavior: findMushroom - increases health and prints status
    public void findMushroom() {
        this.health += 20;
        clampStats();
        System.out.println(this.name + " plucks a glowing mushroom with a cheerful \"wa-hoo!\" and feels his health bounce up like a cartoon heart.");
    }

    // Behavior: exploreMansion - increases scared level, decreases happiness and energy
    public void exploreMansion() {
        this.scaredLevel += 15;
        this.happiness -= 10;
        this.energy -= 20;
        clampStats();
        System.out.println("Tiptoeing through the creaky mansion, " + this.name + " felt scared and unhappy.");
    }

    // Behavior: questionBlock - chance to get a mushroom or a Boo appears
    public void questionBlock() {
        System.out.println(this.name + " leaps up and slams the question block with a hopeful grin.");
        int event = randomEvent(); // 0 = mushroom (good), 1 = Boo (bad)
        if (event == 0) {
            this.health += 15;
            System.out.println("A mushroom pops out with a comical 'boing!' — " + this.name + " feels a little more lively.");
        } else {
            // Boo appears
            this.scaredLevel += 30; // dramatic increase
            this.happiness -= 25;
            System.out.println("A Boo pops out with a hollow 'ooo!' — " + this.name.toLowerCase() + " felt scared and unhappy.");
        }
        // small energy cost
        this.energy -= 5;
        clampStats();
    }

    // Behavior: sleep - decreases scared level and increases energy
    public void sleep() {
        this.scaredLevel -= 10;
        this.energy += 40;
        clampStats();
        System.out.println(this.name + " curls up and drifts into a peaceful sleep, and " + this.name.toLowerCase() + " feels calmer.");
    }

    // Behavior: attackBoo - Luuses his vacuum to suck a Boo, reducing scared level and energy
    public void attackBoo() {
        System.out.println(this.name + " whips out the vacuum and lets out a heroic 'Suuuuck!' to pull the Boo in.");
        this.scaredLevel -= 25;
        this.energy -= 20;
        clampStats();
        System.out.println(this.name + " sucked the Boo into the vacuum and felt braver but a little tired.");
    }

    // Reveal Luigi's current stats in a single line
    public void showStats() {
        System.out.println(this.name + "'s stats — Health: " + this.health + 
        ", Energy: " + this.energy + ", Happiness: " + this.happiness + ", Scared Level: " + this.scaredLevel + ".");
    }
    // end of class
}