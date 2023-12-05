/*
 *    █████████   █████████
 *   ███░░░░░███ ███░░░░░███        Day 3: Gear Ratio (Part 2)
 *  ███     ░░░ ░███    ░░░
 * ░███         ░░█████████         @author Gabriel Savard
 * ░███    █████ ░░░░░░░░███        @version 1.0
 * ░░███  ░░███  ███    ░███        since 2023-12-03
 *  ░░█████████ ░░█████████
 *   ░░░░░░░░░   ░░░░░░░░░
 *
 *  @description: This program takes in a file and separates by line. It then looks for all the numbers and the *
 *  characters in order to locate valid gears and add the sum of the numbers surrounding the valid gear(only 2 numbers)
 *
 *  @requisites: Utilities.java, Part.java, Gear.java
 */

import java.util.ArrayList;

public class day3_2 {
    public static void main(String[] args) {
        // File
        String file = Utilities.readFile("files/day_3/input.txt");
        String[] data = file.split("\n");

        // Main variables
        int sum = 0;
        int start = 0;
        String num = "";
        ArrayList<Part> parts = new ArrayList<>();
        ArrayList<Gear> gears = new ArrayList<>();

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

        // Saving all the gears
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length(); j++) {
                if (data[i].charAt(j) == '*') {
                    gears.add(new Gear(j, i));
                }
            }
        }

        // Comparing the gears' coordinates with the parts'
        for (Gear g : gears) {
            // Loop variables
            int[] twoNum = new int[2];
            int count = 0;

            // Coordinates
            int begin = g.getX() - 1;
            int end = g.getX() + 1;
            int row1 = g.getY() - 1;
            int row2 = g.getY() + 1;

            // Looking how many numbers are around the gear
            for (Part p : parts) {
                int coordinates = p.getX() + p.getLength() - 1;
                if (p.getY() >= row1 && p.getY() <= row2 &&
                        ((p.getX() >= begin && p.getX() <= end) || (coordinates >= begin && coordinates <= end))) {
                    if (count < 2)
                        twoNum[count] = p.getValue();
                    count++;
               }
            }

            // If only 2 numbers surround the gear, add the sum of the two numbers
            if (count == 2)
                sum += (twoNum[0] * twoNum[1]);
        }

        // Output
        System.out.printf("The total is %d!\n", sum);
    }
}
