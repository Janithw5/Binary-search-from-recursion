# Binary-search-from-recursion
a simple binary search algorithm implemented from recursion which outputs how many steps does it take to find a certain number between 1 and 100 
suppose that the number which provide is 33, then it should count 7 steps.

Step no     number guessed   result     range of possible values
0                                                 1-100
1              50           too high              1-49
2              25           too low               26-49
3              37           too high              26-36 
4              31           too low               32-36
5              34           too high              32-33
6              32           too low               33-33
7              33           correct
