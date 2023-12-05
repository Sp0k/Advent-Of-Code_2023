/*
 *    █████████   █████████
 *   ███░░░░░███ ███░░░░░███        Part
 *  ███     ░░░ ░███    ░░░
 * ░███         ░░█████████         @author Gabriel Savard
 * ░███    █████ ░░░░░░░░███        @version 1.0
 * ░░███  ░░███  ███    ░███        since 2023-12-03
 *  ░░█████████ ░░█████████
 *   ░░░░░░░░░   ░░░░░░░░░
 *
 *  @description: This class holds the information needed for the parts used in Day 3.
 */

public class Part {
    // Class attributes
    private int value;
    private int x;
    private int y;
    private int length;
    private boolean valid;

    // Constructor
    public Part(int value, int x, int y, int length) {
        this.value = value;
        this.x = x;
        this.y = y;
        this.length = length;
        valid = false;
    }

    // Setters
    public void setValidity() {valid = true;}

    // Getters
    public int getValue() {return value;}
    public int getX() {return x;}
    public int getY() {return y;}
    public int getLength() {return length;}
    public boolean isValid() {return valid;}
}
