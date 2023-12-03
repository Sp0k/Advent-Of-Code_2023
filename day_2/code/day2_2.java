/*
 *    █████████   █████████
 *   ███░░░░░███ ███░░░░░███        Day 2: Cube Conundrum (Part 2)
 *  ███     ░░░ ░███    ░░░
 * ░███         ░░█████████         @author Gabriel Savard
 * ░███    █████ ░░░░░░░░███        @version 1.0
 * ░░███  ░░███  ███    ░███        since 2023-12-02
 *  ░░█████████ ░░█████████
 *   ░░░░░░░░░   ░░░░░░░░░
 *
 *  @description: This program reads through a file containing each game and its sets. It will then
 *  iterate through the sets of each game comparing the values in order to find the biggest value
 *  for each color cubes in the game. It then multiply the values and add the result total.
 *
 *  @requisites: Utilities.java
 */

public class day2_2 {
    public static void main(String[] args) {
        // File
        String file = Utilities.readFile("files/day_2/input.txt");
        String[] lines = file.split("\n");

        // Main variables
        int sum = 0;

        // Iterating through the games
        for (String game : lines) {
            // Loop variables
            int[] values = {0, 0, 0};

            // Splitting the game data
            String[] gameData = game.split(": ");
            String[] sets = gameData[1].split("; ");

            // Iterating through the game's sets
            for (String set : sets) {
                String[] setData = set.split(", ");

                for (String data : setData) {
                    String[] splitData = data.split(" ");

                    // Comparing the values to the sets to find the minimum values for the game
                    // to be valid
                    switch (splitData[1]) {
                        case "red" -> {
                            if (Integer.parseInt(splitData[0]) > values[0]) {
                                values[0] = Integer.parseInt(splitData[0]);
                            }
                        }
                        case "green" -> {
                            if (Integer.parseInt(splitData[0]) > values[1]) {
                                values[1] = Integer.parseInt(splitData[0]);
                            }
                        }
                        case "blue" -> {
                            if (Integer.parseInt(splitData[0]) > values[2]) {
                                values[2] = Integer.parseInt(splitData[0]);
                            }
                        }
                    }
                }
            }
            // Add the sum of the values to the total
            sum += (values[0] * values[1] * values[2]);
        }

        // Output
        System.out.printf("The sum is %d!\n", sum);
    }
}
