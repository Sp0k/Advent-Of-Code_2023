/*
 *    █████████   █████████
 *   ███░░░░░███ ███░░░░░███        Day 1: Trebuchet (Part 1)
 *  ███     ░░░ ░███    ░░░
 * ░███         ░░█████████         @author Gabriel Savard
 * ░███    █████ ░░░░░░░░███        @version 1.0
 * ░░███  ░░███  ███    ░███        since 2023-12-01
 *  ░░█████████ ░░█████████
 *   ░░░░░░░░░   ░░░░░░░░░
 *
 *  @description: The program takes in a text file containing a number of lines. The program then reads
 *  through each line from the front until it finds a digit and saves it, and then again from the back.
 *  It then adds both digits to a total sum and prints it once it read every line.
 *
 *  @requisites: Utilities.java
 */

public class day1_1 {
    public static void main(String[] args) {
        // File
        String file = Utilities.readFile("files/day_1/input.txt").toLowerCase();
        String[] data = file.split("\n");

        // Main variables
        int sum = 0;
        StringBuilder out;

        // Looking for the integers
        for (String line : data) {
            // Resetting the string
            out = new StringBuilder();

            // First digit
            for (int i = 0; i < line.length(); i++) {
                if ((line.charAt(i) - '0') >= 1 && (line.charAt(i) - '0') <= 9) {
                    // Digit is found
                    out.append(line.charAt(i));
                    break;
                }
            }

            // Second digit
            for (int i = line.length() - 1; i >= 0; i--) {
                if ((line.charAt(i) - '0') >= 1 && (line.charAt(i) - '0') <= 9) {
                    // Digit is found
                    out.append(line.charAt(i));
                    break;
                }
            }

            sum += Integer.parseInt(out.toString());
        }

        // Output
        System.out.printf("The sum is %d!", sum);
    }
}
