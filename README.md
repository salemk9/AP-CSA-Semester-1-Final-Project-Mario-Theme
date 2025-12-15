# Mario Pet Project

## Project Description

This Java project is a Super Mario Bros-themed virtual pet program that allows users to choose from four characters: Mario, Bowser, Wario, or Luigi. Each pet has core stats such as energy, happiness, and health, along with unique attributes. Users can interact with their chosen character through unique behaviors that can dynamically affect their pet's stats. 

## Run Instructions

How to run:

When the program begins, the user is prompted to choose one of four characters—Mario, Luigi, Bowser, or Wario—by entering the number that corresponds to their selection. After choosing a pet, the program displays all available behaviors and actions the character can perform. The user then selects an action, and the program updates the pet’s stats accordingly; these actions can improve or harm the pet’s well-being, and poor stat management may even lead to the pet’s death and the end of the program. At any point, the user also has the option to quit.


## Features

- Multiple pet character classes: `luigi`, `mario`, `wario`, `bowser`.
- Choose a pet character and call behaviors to modify core stats. (health, energy, happiness)
- Unique stats that match the character's personality (e.g Luigi's scared level, Bowser's rage level)
- Behaviors include finding mushrooms, exploring mansions, kidnapping Peach, attacking Boos, and climbing the Flagpole that are unique to the characters.
- Stats are clamped between 0 and 100 to ensure code stability.

## Class Diagram


                   <<interface>>
                   VirtualPet
      +----------------------------------+
      | + feed() : void                  |
      | + play() : void                  |
      | + rest() : void                  |
      | + showStats() : void             |
      +----------------------------------+
                ^         ^        ^        ^
                |         |        |        |
                |         |        |        |
             implements implements implements implements
                |         |        |        |
+----------------+   +---------------+  +--------------+   +--------------+
|     Bowser     |   |     Mario     |  |    Luigi     |   |    Wario     |
+----------------+   +---------------+  +--------------+   +--------------+
| - name:String  |   | - name:String |  | - name:String|   | - health:int |
| - health:int   |   | - health:int  |  | - health:int |   | - wealth:int |
| - energy:int   |   | - energy:int  |  | - energy:int |   | - musk:int   |
| - happiness:int|   | - happiness:int| | - happiness:int| | - size:String|
| - rageLevel:int|   | - coins:int   |  | - scaredLvl:int| | - mood:String|
| - rand:Random  |   | - rand:Random |  | - rand:Random |  | - energy:int |
| - bowserCount:int | | - totalCoinsCollected:int (static)| | - happiness:int|
+----------------+   +---------------+  +--------------+   | - name:String |
| + Bowser(name) |   | + Mario(name) |  | + Luigi(name)|   +--------------+
| + feed()       |   | + feed()      |  | + feed()     |   | + feed()     |
| + play()       |   | + play()      |  | + play()     |   | + play()     |
| + rest()       |   | + rest()      |  | + rest()     |   | + rest()     |
| + showStats()  |   | + showStats() |  | + showStats()|   | + showStats()|
| + breatheFire()|   | + gainCoin()  |  | + findMushroom()| | + releaseSteam() |
| + roar()       |   | + climbFlagpole()| | + exploreMansion() | + get/set methods |
| + throwHammers()| | + enterPipe()  |  | + questionBlock()|  +--------------+
| + retreatShell()| | + attackGoomba()| | + attackBoo() |
| + kidnapPeach()|  +---------------+  +--------------+
| - clampStats() |   | - clampStats()|  | - clampStats()|
| - randomEvent()|   | - randomEvent()| | - randomEvent()|
+----------------+   +---------------+  +--------------+

                       +-----------+
                       |   Main    |
                       +-----------+
                       | + main()  |
                       +-----------+
                      /     |      \
                     /      |       \
                    v       v        v
                 uses     uses     uses  
              Bowser    Mario     Luigi
                     \
                      \
                       v
                      uses
                     Wario




## Team Roles

- Salem Kiar: Project Manager - Keeps track of deadlines, Coordinates sprints, Leads scrum meetings
- Sam Ho: Programming Lead - Ensures code quality & consistency, Manages merge requests, Oversees logic and architecture
- Quan Nguyen: Quality Assurance Tester - Tests features, Creates test cases (in the main method), Reports bugs and edge cases
- Sam Ho: Technical Writer - Maintains README and documentation, Creates class diagram, Ensures Javadoc is complete and correct

## Known Bugs / Future Improvements

- Currently, some character classes (Luigi, Mario, and Bowser) do not display updated stats after each action, while the Wario class does. A future improvement would be to standardize this behavior across all character classes, ensuring either all of them display updated stats consistently or none of them do.
- The main method currently prints the behavior menu immediately after an action is selected, which can prevent users from seeing the results of their chosen behavior. A future improvement would be to add a short delay before redisplaying the menu, allowing users time to read the outcome of the action before continuing.

---



