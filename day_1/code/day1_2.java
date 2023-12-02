/*
 *    █████████   █████████
 *   ███░░░░░███ ███░░░░░███        Day 1: Trebuchet (Part 2)
 *  ███     ░░░ ░███    ░░░
 * ░███         ░░█████████         @author Gabriel Savard
 * ░███    █████ ░░░░░░░░███        @version 1.0
 * ░░███  ░░███  ███    ░███        since 2023-12-01
 *  ░░█████████ ░░█████████
 *   ░░░░░░░░░   ░░░░░░░░░
 *
 *  @description: This program reads in a file and goes line by line to find the digits. It starts by
 *  reading from the start, comparing the string to the digits in letters or looking for a digit. Then
 *  again from the back and adds in the number they make together into the sum.
 *
 *  @requisites: Utilities.java
 */

public class day1_2 {
    public static int wordSearch(String str) {
        // Method constants
        final String[] WORDS = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // Looking for the words
        for (int i = 0; i < WORDS.length; i++) {
            // Word found
            if (str.contains(WORDS[i])) {
                return (i + 1);
            }
        }

        // No word found
        return -1;
    }

    public static void main(String[] args) {
        // File
        String file = Utilities.readFile("files/day_1/input.txt").toLowerCase();
        String[] data = file.split("\n");

        // Main variables
        int sum = 0;
        String subStr;
        StringBuilder out;

        // Looking for the integers
        for (String line : data) {
            // Resetting the string
            out = new StringBuilder();

            // First digit
            for (int i = 0; i < line.length(); i++) {
                // Checking for the words first
                subStr = line.substring(0, i);
                if (subStr.length() >= 3) {
                    int tmp = wordSearch(subStr);
                    // Digit is found
                    if (tmp != -1) {
                        out.append(tmp);
                        break;
                    }
                }

                // Checking for digits
                if ((line.charAt(i) - '0') >= 1 && (line.charAt(i) - '0') <= 9) {
                    // Digit is found
                    out.append(line.charAt(i));
                    break;
                }
            }

            // Second digit
            for (int i = line.length() - 1; i >= 0; i--) {
                // Checking for the words first
                subStr = line.substring(i, line.length());
                int tmp = wordSearch(subStr);
                // Digit is found
                if (tmp != -1) {
                    out.append(tmp);
                    break;
                }

                // Checking for digits
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
