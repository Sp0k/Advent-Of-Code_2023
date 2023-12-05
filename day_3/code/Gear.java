/*
 *    █████████   █████████
 *   ███░░░░░███ ███░░░░░███        Gear
 *  ███     ░░░ ░███    ░░░
 * ░███         ░░█████████         @author Gabriel Savard
 * ░███    █████ ░░░░░░░░███        @version 1.0
 * ░░███  ░░███  ███    ░███        since 2023-12-03
 *  ░░█████████ ░░█████████
 *   ░░░░░░░░░   ░░░░░░░░░
 *
 *  @description: This class holds the information necessary for day 3 part 2 to find valid gears
 */

public class Gear {
    // Class attributes
    private int x;
    private int y;

    // Constructor
    public Gear(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {return x;}
    public int getY() {return y;}
}
