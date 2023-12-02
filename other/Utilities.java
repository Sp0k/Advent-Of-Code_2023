/*
 *    █████████   █████████
 *   ███░░░░░███ ███░░░░░███        Utilities
 *  ███     ░░░ ░███    ░░░
 * ░███         ░░█████████         @author Gabriel Savard
 * ░███    █████ ░░░░░░░░███        @version 1.0
 * ░░███  ░░███  ███    ░███        since 2023-12-01
 *  ░░█████████ ░░█████████
 *   ░░░░░░░░░   ░░░░░░░░░
 *
 *  @description: A collection of utility method I am using for the challenges
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utilities {
    /*
     * Read file
     *
     * @param filename  The path of the file to read
     * @return lines    A String containing the text in the file.
     */
    public static String readFile(String filename) {
        // Method variables
        File f = new File(filename);
        Scanner reader;
        StringBuilder lines = new StringBuilder();

        // Error checking
        try {
            reader = new Scanner(f);
        } catch (FileNotFoundException e) {
            System.out.println("\nError: file was not found");
            return "";
        }

        // File reading
        while (reader.hasNext())
            lines.append(reader.nextLine()).append("\n");

        reader.close();

        return lines.toString();
    }
}
