# Day 2: Cube Conundrum
Today's challenge was, in my opinion, easier than yesterday's. After landing on an
island, we meet an elf that tells us he'll explain the lack of snow on <em>Snow
Island</em>. Until we reach the place where he can explain it, he asks us to
play a game with us. The game is a classic stats game, a bag contains a certain
number of cubes of colors, and he will pick at random cubes and tell you the result
of each set. Once picked, the cubes are put back in the bag.

### Part 1
The challenge was to go through all the games in the input file and look at the
number of cubes of each color picked in each set. I started by separating each
line of my file into two, one side having the game id and the other having the
sets. I then took the sets and separated them even more into each set and again
into each data in the sets. I also have my limits set in an array (red: 12,
green: 13, blue: 14). I then compare the values with the limits and if the value
is bigger, then the game is invalid and I proceed to check the next game. If the
game is valid, I add the game id (i.e. 11 for Game 11) to the total. Once I
iterated through all the lines, I print the total to the console.

My answer for this challenge was 2563.

### Part 2
For this second challenge, the goal was to find the minimum amount of each cube
needed for each game to be valid. I start my code the same way. The only
differences were that my code would check if the current value was bigger than the
one saved already and update the value if needs be. Once I went through each set in
the game, I multiply the minimum value of each color and then add the result to
total. I finish by printing the total.

My answer for this challenge was 70768.

## Final thoughts
I really enjoyed today's challenge. I found it easier than yesterday's and had
the chance to complete them pretty quickly, which felt pretty cool to me. I think
that it's still a good start for the calendar. I think I also see the difference
in my level as last year I only had one semester of Computer Science done and now
with my three, I find it much easier than last year. Hopefully, next year will be
even easier.