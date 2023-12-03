/*
 *    █████████   █████████
 *   ███░░░░░███ ███░░░░░███        Day 2: Cube Conundrum (Part 1)
 *  ███     ░░░ ░███    ░░░
 * ░███         ░░█████████         @author Gabriel Savard
 * ░███    █████ ░░░░░░░░███        @version 1.0
 * ░░███  ░░███  ███    ░███        since 2023-12-02
 *  ░░█████████ ░░█████████
 *   ░░░░░░░░░   ░░░░░░░░░
 *
 *  @description: This program reads through a file containing each game and its sets. It will then
 *  iterate through the sets of each game comparing the values to the limits array. If the game is valid
 *  it's number is added to the total sum.
 *
 *  @requisites: Utilities.java
 */

public class day2_1 {
    public static void main(String[] args) {
        // File
        String file = Utilities.readFile("files/day_2/input.txt");
        String[] lines = file.split("\n");

        // Main constants
        final int[] LIMITS = {12, 13, 14}; // R G B

        // Main variables
        boolean valid;
        int sum = 0;

        // Checking each game
        for (String game : lines) {
            // Loop variables
            valid = true;

            // Splitting the data
            String[] gameData = game.split(": ");
            String[] sets = gameData[1].split("; ");

            // Iterating through the sets
            for (String set : sets) {
                String[] setData = set.split(", ");

                for (String data : setData) {
                    String[] splitData = data.split(" ");

                    // Checking if the numbers of cubes taken out is bigger than the available
                    // number of cubes
                    switch (splitData[1]) {
                        case "red" -> {
                            if (Integer.parseInt(splitData[0]) > LIMITS[0])
                                valid = false;
                        }
                        case "green" -> {
                            if (Integer.parseInt(splitData[0]) > LIMITS[1])
                                valid = false;
                        }
                        case  "blue" -> {
                            if (Integer.parseInt(splitData[0]) > LIMITS[2])
                                valid = false;
                        }
                    }

                    if (!valid) break;
                }

                if (!valid) break;
            }

            // Checking if the game is valid and can be added to the sum
            if (!valid) continue;

            String gameNum = gameData[0].split(" ")[1];
            sum += Integer.parseInt(gameNum);
        }

        // Output
        System.out.printf("The sum is %d!\n", sum);
    }
}
