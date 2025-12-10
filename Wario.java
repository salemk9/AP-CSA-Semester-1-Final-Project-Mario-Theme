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
        System.out.println("Wario's Coins: " + wealth);
        System.out.println("Wario's Stinkiness: " + musk);
        System.out.println("Wario's Size: " + size);
        System.out.println("Wario's Mood: " + mood);
    }

    // Unique action methods.
    /**
     * Mugs someone, increasing Wario's wealth randomly by increments of 5, capping out at 100.
     * Changes Wario's mood to "Outstanding".
     */
    public void mugSomeone() {
        int randomIncrement = (int) (Math.random() * 5 + 1) * 5; // Random increment of 5, 10, 15, ..., 25
        this.wealth = Math.min(this.wealth + randomIncrement, 100); // Cap wealth at 100
        this.mood = "Outstanding";
        System.out.println("Wario mugged someone! Wealth is now: " + this.wealth + ". Mood: " + this.mood);
    }

    /**
     * Eats garlic, increasing Wario's musk level by 25.
     * Changes Wario's mood to "Stinky" and size to "Large".
     */
        public void eatGarlic() {
            this.musk += 25;
            this.mood = "Stinky";
            this.size = "Large";
            System.out.println("Wario ate garlic! Musk level is now: " + this.musk + ". Mood: " + this.mood + ". Size: " + this.size);
        }
    
        /**
         * Wario uncharacteristically donates his wealth to charity!
         * Wario will lose exactly 50 coins from his overall balance.
         * Wario's mood becomes "Unhappy".
         */
        public void donateCharity() {
            int coinsLost = Math.min(50, this.wealth); // Ensure Wario doesn't lose more coins than he has
            this.wealth -= coinsLost; // Subtract the coins lost from Wario's wealth
            this.mood = "Unhappy";
            System.out.println("Wario donated to charity! Lost " + coinsLost + " coins. Coins remaining: " + this.wealth + ". Mood: " + this.mood);
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

}
