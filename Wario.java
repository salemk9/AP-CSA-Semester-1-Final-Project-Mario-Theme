/**
 * Represents the character Wario with various attributes such as health, wealth, musk, size, and mood.
 */
public class Wario {
    
    private int health;
    private int wealth;
    private int musk;
    private String size;
    private String mood;

    /**
     * Constructs a Wario object with the specified attributes.
     * 
     * @param hp    the health of Wario
     * @param wealth the wealth of Wario
     * @param stink the musk level of Wario
     * @param size  the size of Wario
     * @param mood  the mood of Wario
     */
    public Wario(int hp, int wealth, int stink, String size, String mood) {
        this.health = hp;
        this.wealth = wealth;
        this.musk = stink;
        this.size = size;
        this.mood = mood;
    }

    /**
     * Displays the current status of Wario.
     */
    public void displayStatus() {
        System.out.println("Wario's Health: " + health);
        System.out.println("Wario's Wealth: " + wealth);
        System.out.println("Wario's Stinkiness: " + musk);
        System.out.println("Wario's Size: " + size);
        System.out.println("Wario's Mood: " + mood);
    }

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
