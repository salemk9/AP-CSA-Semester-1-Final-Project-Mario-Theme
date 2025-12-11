/**
 * VirtualPet interface
 * 
 * This interface defines the basic behaviors that all virtual pet
 * characters must implement. Every pet must be able to:
 * - eat or be fed
 * - play or interact with the user
 * - rest to restore energy
 * - display current stats
 * 
 * Any class implementing this interface agrees to provide
 * concrete versions of these methods.
 */
public interface VirtualPet {

    /**
     * Feeds the pet, restoring health, energy, or other stats.
     */
    void feed();

    /**
     * Plays or interacts with the pet, usually increasing happiness
     * but possibly decreasing energy.
     */
    void play();

    /**
     * Allows the pet to rest and recover energy or health.
     */
    void rest();

    /**
     * Shows the current stats of the pet (health, energy, happiness, or others).
     */
    
}

