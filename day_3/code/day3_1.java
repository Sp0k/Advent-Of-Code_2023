/*
 *    █████████   █████████
 *   ███░░░░░███ ███░░░░░███        Day 3: Gear Ratio (Part 1)
 *  ███     ░░░ ░███    ░░░
 * ░███         ░░█████████         @author Gabriel Savard
 * ░███    █████ ░░░░░░░░███        @version 1.0
 * ░░███  ░░███  ███    ░███        since 2023-12-03
 *  ░░█████████ ░░█████████
 *   ░░░░░░░░░   ░░░░░░░░░
 *
 *  @description: This program reads in a file and separates it by line. Then it looks for numbers in the data
 *  and tries to see if the numbers are valid. If they are, it adds the number to the sum and displays the sum
 *  at the end.
 *
 *  @requisites: Utilities.java, Part.java
 */

import java.util.ArrayList;

public class day3_1 {
    public static void main(String[] args) {
        // File
        String file = Utilities.readFile("files/day_3/input.txt");
        String[] data = file.split("\n");

        // Main variables
        int sum = 0;
        int start = 0;
        String num = "";
        ArrayList<Part> parts = new ArrayList<>();

        // Saving each number in the parts' list
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length(); j++) {
                // Building the num
                if (data[i].charAt(j) != '.' && (data[i].charAt(j) - '0' >= 0 && data[i].charAt(j) - '0' <= 9)) {
                    if (num.isEmpty()) start = j;
                    num += data[i].charAt(j);
                } else {
                    // Adding the number to the list
                    if (!num.isEmpty()) {
                        parts.add(new Part(Integer.parseInt(num), start, i, num.length()));
                        num = "";
                    }
                }
            }
            // Making sure no number is missed
            if (!num.isEmpty()) {
                parts.add(new Part(Integer.parseInt(num), start, i, num.length()));
                num = "";
            }
        }

        // Verifying the validity of the numbers
        for (Part p : parts) {
            // Getting the coordinates
            int row = 0;
            if (p.getY() != 0) row = p.getY() - 1;
            int col = 0;
            if (p.getX() != 0) col = p.getX() - 1;

            // Checking the space around number for validating characters
            for (int i = row; i < data.length && i <= (p.getY() + 1); i++) {
                for (int j = col; j < data[i].length() && j < (col + p.getLength() + 2); j++) {
                    if (data[i].charAt(j) != '.' && !(data[i].charAt(j) - '0' >= 0 && data[i].charAt(j) - '0' <= 9)) {
                        p.setValidity();
                        break;
                    }
                }
            }
            // Adding the number if it is valid
            if (p.isValid()) sum += p.getValue();
        }

        // Output
        System.out.printf("The total is %d!\n", sum);
    }
}
