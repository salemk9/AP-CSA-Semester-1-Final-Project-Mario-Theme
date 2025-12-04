public class Wario {
    
    private int health;
    private int wealth;
    private int musk;
    private String size;
    private String mood;
    
    public Wario(int hp, int wealth, int stink, String size, String mood){
        this.health = hp;
        this.wealth = wealth;
        this.musk = stink;
        this.size = size;
        this.mood = mood;
    }

    public void displayStatus(){
        System.out.println("Wario's Health: " + health);
        System.out.println("Wario's Wealth: " + wealth);
        System.out.println("Wario's Stinkiness: " + musk);
        System.out.println("Wario's Size: " + size);
        System.out.println("Wario's Mood: " + mood);
    }

}