# Day 1: Trebuchet
This year's challenge started off nicely in my opinion. It wasn't so hard I
wanted to give up right away, but it wasn't too easy where I did not feel
challenged. I definitely knew what I needed to do today, I just think that I
would've had an easier time doing it if I took the time to trace through my code.
I also want to thank <a href="https://github.com/SuchithSridhar">Suchith</a> who
helped me make my code more efficient by only looking for the first and last
digits or words for each line. I decided to program today's challenge in Java.

## The challenge
Today's challenge was reading through a text file and finding numbers that the
elves would use as calibration values for the trebuchet they just put us in. The
goal was to read through each line and find the first and last digit through
hidden amongst random characters. Those two digits made up a number which could
then be added to the total sum, which is what the challenge was looking for.

### Part 1
The first part focused on finding the actual digits in amongst the characters.
So approach was simple, for each line(string) of the file, start by comparing each 
character until I find a digit that I add to a string. Then do it again from the
end of the string and add that digit to my output string. Once I had found both,
I would parse the output string into an integer which I would then add to my sum.

This part did not take too long to figure out, my biggest difficulty was finding
how to compare a character to an integer in Java. But once that was figured out,
I had everything ready.

Below is how I compared my characters to their integer.

``` java
if ((line.charAt(i) - '0') >= 1 && (line.charAt(i) - '0') <= 9) {
    ...
}
```

My final answer for this part of the challenge was 56049.
<br><br>

### Part 2
The second part did prove to be a little more challenging than I thought. This
time, we were also looking for the digits written out as words (i.e. one, two, 
etc...). My solution worked in the same way, except each time my for loop looped,
I would start by taking a bigger sub-string and seeing if it contains one of the
words in it before looking for a digit in the last position of the string. The
code to looking for the word is not too complicated. All I did was make a
separate method which checks if the words, stored in an array, are contained
inside the str passed.

``` java
public static int wordSearch(String str) {
    // Digits as words
    final String WORDS = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    
    // Looking for the word
    for (int i = 0; i < WORDS.length; i++) {
        // Word found
        if (str.contains(WORDS[i])
            return (i + 1);
    }
    
    // No word found
    return -1;
}
```

This is the only major difference in my code between the two parts. This and what
I added in the main loop to call this method and check for the words.

My answer for this part was 54530.
<br>

## Final thoughts
I think today's challenge was a really great one to start and get back into these
challenges. My first experience with the <em>Advent of Code</em> was with last
year's edition for which one of my university's prof organized a competition and
made a leaderboard for all three section of her class in which herself and the two
other prof teaching the course participated along with the students. And that
experience left me looking forward to this year's edition, and I am so happy it
finally arrived. I'm starting to prefer this advent calendar over the chocolate
ones. ;)