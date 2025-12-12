/**
 * Represents the character Wario with various attributes such as health, wealth, musk, size, mood, energy, and happiness.
 */
public class Wario implements VirtualPet {
    
    private int health;
    private int wealth;
    private int musk;
    private String size;
    private String mood;
    private int energy;
    private int happiness;
    private String name;

    /**
     * Constructs a Wario object with the specified attributes.
     * 
     * @param hp       the health of Wario
     * @param wealth   the wealth of Wario
     * @param stink    the musk level of Wario
     * @param size     the size of Wario
     * @param mood     the mood of Wario
     * @param energy   the energy level of Wario
     * @param happiness the happiness level of Wario
     * @param name     the name of Wario
     */
    public Wario(int hp, int wealth, int stink, String size, String mood, int energy, int happiness, String name) {
        this.health = hp;
        this.wealth = wealth;
        this.musk = stink;
        this.size = size;
        this.mood = mood;
        this.energy = energy;
        this.happiness = happiness;
        this.name = name;
    }

    /**
    * Displays the current status of Wario.
    */
    public void showStats() {
        System.out.println("Wario's Health: " + health);
        System.out.println("Wario's Coins: " + wealth);
        System.out.println("Wario's Stinkiness: " + musk);
        System.out.println("Wario's Size: " + size);
        System.out.println("Wario's Mood: " + mood);
        System.out.println("Wario's Energy: " + energy);
        System.out.println("Wario's Happiness: " + happiness);
    }

    /**
     * Wario eats a Super Mushroom, increasing health and energy.
     * If health exceeds 100, it is capped at 100.
     * Random events may occur after feeding.
     */
    public void feed() {
        System.out.println(name + " eats a Super Mushroom!");
        this.health += 15;
        this.energy += 5;

        if (this.health > 100) {
            this.health = 100;
        }

        randomEvent(); // Trigger a random event after feeding
        System.out.println("Wario's Health: " + health + ", Energy: " + energy);
    }

    /**
     * Wario plays and jumps around, increasing happiness but reducing energy.
     * If energy drops below 0, it is capped at 0.
     */
    public void play() {
        System.out.println(name + " jumps around happily!");
        this.happiness += 10;
        this.energy -= 10;

        if (this.energy < 0) {
            this.energy = 0;
        }

        System.out.println("Wario's Happiness: " + happiness + ", Energy: " + energy);
    }

    /**
     * Wario takes a rest, recovering health and energy.
     * Health increases by 20 (capped at 100).
     * Energy increases by 30 (capped at 100).
     * Mood becomes "Relaxed".
     */
    public void rest() {
        this.health = Math.min(this.health + 20, 100); // Increase health by 20, cap at 100
        this.energy = Math.min(this.energy + 30, 100); // Increase energy by 30, cap at 100
        this.mood = "Relaxed"; // Update mood to "Relaxed"
        System.out.println("Wario took a rest! Health: " + this.health + ", Energy: " + this.energy + ", Mood: " + this.mood);
    }

    /**
     * Triggers a random event after feeding.
     * This is a placeholder for additional functionality.
     */
    private void randomEvent() {
        System.out.println("A random event occurs after feeding!");
        // Add additional random event logic here if needed
    }

    /**
     * Wario releases steam, losing 10% of his current health.
     * His musk clears up and becomes "Clean", and his size becomes "Small".
     */
    public void releaseSteam() {
        int healthLoss = (int) (this.health * 0.1); // Calculate 10% of current health
        this.health = Math.max(this.health - healthLoss, 0); // Ensure health does not go below 0
        this.musk = 0; // Musk clears up
        this.size = "Small";
        this.mood = "Clean";
        System.out.println("Wario released steam! Lost " + healthLoss + " health. Health is now: " + this.health + ". Musk: " + this.musk + ". Size: " + this.size + ". Mood: " + this.mood);
    }

    
    // Getters and Setters
    /**
     * Gets the health of Wario.
     * 
     * @return the health of Wario
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the health of Wario.
     * 
     * @param health the new health value
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Gets the wealth of Wario.
     * 
     * @return the wealth of Wario
     */
    public int getWealth() {
        return wealth;
    }

    /**
     * Sets the wealth of Wario.
     * 
     * @param wealth the new wealth value
     */
    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    /**
     * Gets the musk level of Wario.
     * 
     * @return the musk level of Wario
     */
    public int getMusk() {
        return musk;
    }

    /**
     * Sets the musk level of Wario.
     * 
     * @param musk the new musk level
     */
    public void setMusk(int musk) {
        this.musk = musk;
    }

    /**
     * Gets the size of Wario.
     * 
     * @return the size of Wario
     */
    public String getSize() {
        return size;
    }

    /**
     * Sets the size of Wario.
     * 
     * @param size the new size value
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Gets the mood of Wario.
     * 
     * @return the mood of Wario
     */
    public String getMood() {
        return mood;
    }

    /**
     * Sets the mood of Wario.
     * 
     * @param mood the new mood value
     */
    public void setMood(String mood) {
        this.mood = mood;
    }
}

