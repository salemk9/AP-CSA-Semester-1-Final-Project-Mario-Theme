import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Welcome to the Virtual Pet Simulator! ===");
        System.out.println("Choose your character:");
        System.out.println("1. Bowser");
        System.out.println("2. Mario");
        System.out.println("3. Luigi");
        System.out.println("4. Wario");
        System.out.print("Enter choice: ");

        int choice = input.nextInt();
        input.nextLine(); // flush leftover newline

        // -----------------------------
        // BOWSER menu
        // -----------------------------
        if (choice == 1) {
            System.out.print("Name your Bowser: ");
            String name = input.nextLine();
            Bowser pet = new Bowser(name);

            boolean playing = true;

            while (playing) {
                System.out.println("\n--- BOWSER MENU ---");
                System.out.println("1. Feed");
                System.out.println("2. Play");
                System.out.println("3. Rest");
                System.out.println("4. Show Stats");
                System.out.println("5. Breathe Fire");
                System.out.println("6. Roar");
                System.out.println("7. Throw Hammers");
                System.out.println("8. Retreat Into Shell");
                System.out.println("9. Kidnap Peach");
                System.out.println("0. Quit");
                System.out.print("Choose action: ");

                int action = input.nextInt();

                if (action == 1) {
                    pet.feed();
                } else if (action == 2) {
                    pet.play();
                } else if (action == 3) {
                    pet.rest();
                } else if (action == 4) {
                    pet.showStats();
                } else if (action == 5) {
                    pet.breatheFire();
                } else if (action == 6) {
                    pet.roar();
                } else if (action == 7) {
                    pet.throwHammers();
                } else if (action == 8) {
                    pet.retreatShell();
                } else if (action == 9) {
                    pet.kidnapPeach();
                } else if (action == 0) {
                    playing = false;
                } else {
                    System.out.println("Invalid option.");
                }
            }
        }

        // -----------------------------
        // MARIO menu
        // -----------------------------
        else if (choice == 2) {
            System.out.print("Name your Mario: ");
            String name = input.nextLine();
            Mario pet = new Mario(name);

            boolean playing = true;

            while (playing) {
                System.out.println("\n--- MARIO MENU ---");
                System.out.println("1. Feed");
                System.out.println("2. Play");
                System.out.println("3. Rest");
                System.out.println("4. Show Stats");
                System.out.println("5. Gain Coin");
                System.out.println("6. Climb Flagpole");
                System.out.println("7. Enter Pipe");
                System.out.println("8. Attack Goomba");
                System.out.println("0. Quit");
                System.out.print("Choose action: ");

                int action = input.nextInt();

                if (action == 1) {
                    pet.feed();
                } else if (action == 2) {
                    pet.play();
                } else if (action == 3) {
                    pet.rest();
                } else if (action == 4) {
                    pet.showStats();
                } else if (action == 5) {
                    pet.gainCoin();
                } else if (action == 6) {
                    pet.climbFlagpole();
                } else if (action == 7) {
                    pet.enterPipe();
                } else if (action == 8) {
                    pet.attackGoomba();
                } else if (action == 0) {
                    playing = false;
                } else {
                    System.out.println("Invalid option.");
                }
            }
        }

        // -----------------------------
        // LUIGI menu
        // -----------------------------
        else if (choice == 3) {
            System.out.print("Name your Luigi: ");
            String name = input.nextLine();
            luigi pet = new luigi(name);

            boolean playing = true;

            while (playing) {
                System.out.println("\n--- LUIGI MENU ---");
                System.out.println("1. Feed");
                System.out.println("2. Play");
                System.out.println("3. Rest");
                System.out.println("4. Show Stats");
                System.out.println("5. Find Mushroom");
                System.out.println("6. Explore Mansion");
                System.out.println("7. Hit Question Block");
                System.out.println("8. Attack Boo");
                System.out.println("0. Quit");
                System.out.print("Choose action: ");

                int action = input.nextInt();

                if (action == 1) {
                    pet.feed();
                } else if (action == 2) {
                    pet.play();
                } else if (action == 3) {
                    pet.rest();
                } else if (action == 4) {
                    pet.showStats();
                } else if (action == 5) {
                    pet.findMushroom();
                } else if (action == 6) {
                    pet.exploreMansion();
                } else if (action == 7) {
                    pet.questionBlock();
                } else if (action == 8) {
                    pet.attackBoo();
                } else if (action == 0) {
                    playing = false;
                } else {
                    System.out.println("Invalid option.");
                }
            }
        }

        // -----------------------------
        // WARIO menu
        // -----------------------------
        else if (choice == 4) {
            System.out.print("Name your Wario: ");
            String name = input.nextLine();

            Wario pet = new Wario(100, 50, 20, "Large", "Greedy", 80, 70, name);

            boolean playing = true;

            while (playing) {
                System.out.println("\n--- WARIO MENU ---");
                System.out.println("1. Feed");
                System.out.println("2. Play");
                System.out.println("3. Rest");
                System.out.println("4. Show Stats");
                System.out.println("5. Release Steam");
                System.out.println("0. Quit");
                System.out.print("Choose action: ");

                int action = input.nextInt();

                if (action == 1) {
                    pet.feed();
                } else if (action == 2) {
                    pet.play();
                } else if (action == 3) {
                    pet.rest();
                } else if (action == 4) {
                    pet.showStats();
                } else if (action == 5) {
                    pet.releaseSteam();
                } else if (action == 0) {
                    playing = false;
                } else {
                    System.out.println("Invalid option.");
                }
                // Check if the pet has died
                if (pet.getEnergy() == 0 || pet.getHealth() == 0) {
                    System.out.println("Your pet has died. Exiting program.");
                    break; // Exit the loop and terminate the program
                }
            }
        }

        else {
            System.out.println("Invalid choice. Exiting program.");
        }

        input.close();
    }
}