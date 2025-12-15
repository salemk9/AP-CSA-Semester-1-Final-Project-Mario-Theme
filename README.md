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

## Team Roles

- Salem Kiar: Project Manager - Keeps track of deadlines, Coordinates sprints, Leads scrum meetings
- Sam Ho: Programming Lead - Ensures code quality & consistency, Manages merge requests, Oversees logic and architecture
- Quan Nguyen: Quality Assurance Tester - Tests features, Creates test cases (in the main method), Reports bugs and edge cases
- Sam Ho: Technical Writer - Maintains README and documentation, Creates class diagram, Ensures Javadoc is complete and correct

## Known Bugs / Future Improvements

- Currently, some character classes (Luigi, Mario, and Bowser) do not display updated stats after each action, while the Wario class does. A future improvement would be to standardize this behavior across all character classes, ensuring either all of them display updated stats consistently or none of them do.
- The output of the main method prints out the menu of the behaviors too quickly after a behavior is chosen, preventing users from seeing what their chosen behavior did to their animal or what happened due to the behavior. A future improvment would be to create some delay when printing the information out so the user can first see what their chosen behavior did and then see the menu of behaviors a few seconds after.

---



