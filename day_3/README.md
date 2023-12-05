# Day 3: Gear Ratios
This year's third day was a slp in the face after day 2 in my opinion. I was not
expecting the difficulty after yesterday. That being said, I did enjoy doing the 
challenge a lot. Today took me a lot of time because of my homework and I ended up
taking more than 24 hours to finish the challenges. I also ended up using an awful
lot of training set to debug and figure my code out, they are all available but
most were found on <em>Reddit</em>. I have linked the thread at the bottom of this
README.

After landing on <em>Snow Island</em> and playing games with the elf, we finally
reach our destination. The elf took us to a gondola lift, except the lift is broken.
An engineer elf explains that the lift's engine is missing a piece and asks for our
help to fix it. She will give us a schematic of the engine and we will have to find
the missing piece. Once we figure out which piece is missing, the engineer installs
it. But the lift is still not working, this time, we need to check all the gear
crank to find which one need to be replaced.

``` text
467..114..
...*......
..35..633.
......#...
617*......
.....+.58.
..592.....
......755.
...$.*....
.664.598..
```
These challenges make us read-through a text file looking like the one above in order
to find numbers and symbols (that aren't dots). The goal was to find valid numbers
and add them together to get the sum which would tell us about the missing piece or
the piece needed to be replaced.

### Part 1
In this first part, we only had to focus on finding the valid numbers in the
schematic and adding them together to get a total sum. To do so, I separated the 
file into lines and then read through it looking to find numbers. Each number would
be turned into a new part object which would hold the value of the number and its
coordinates in the data and length. Then I would go through an array list holding
all the part objects and check if they were valid numbers. In order for a number
to be valid, it has to have a character that is not a number or dot around it.
``` text
.....
.***.
.*9*.
.***.
.....
```

Each position with a * is a position where having a character makes the number valid.
Any position with a dot doesn't.

My answer for this part is 82818007.

### Part 2
For this second part, I used a very similar solution, but I also had an array list
of gears which held the coordinates for each * character. The idea in this part is
for a gear to be valid, it need to be surrounded by no less and no more than two 
numbers. For example:
``` text
467.......
...*......
..35....*.
.......355
12........
12*24.....
```
The * at the top left is valid, but the other two aren't. To tell if the gears are
valid, I compare their coordinates with the coordinates of every number.

My answer for this part is 82818007.

## Final thoughts
Like I said at the beginning, today's challenge was harder than I expected after the 
challenge form yesterday. And on top of the difficulty, I had some big school
projects to do so it was hard to complete the problem on time. I will clearly need to
focus on my exam this week and next week so I will probably slow down in my updates
until the 15th but then will rush with the updates and code. I will still work on
the challenges, I just can't promise how much I'll update until the 15th.

Anyway, I enjoyed this challenge today, I wanted to thank 
<a href="https://github.com/SuchithSridhar">my friend Suchith</a> in helping me
know if my answer looked normal and I also want to thank reddit user 
<a href="https://www.reddit.com/user/i_have_no_biscuits/">u/i_have_no_biscuits</a>
and everyone that participated in his 
<a href="https://www.reddit.com/r/adventofcode/comments/189q9wv/2023_day_3_another_sample_grid_to_use/"> thread</a>
that created training sets that helped me a lot with debugging my code.