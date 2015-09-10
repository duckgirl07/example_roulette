# example_roulette
Program to refactor that plays a game of roulette

##### Team Members:
Bridget Dou, Kevin Wang, David Zhou

----
### Question Answers
#####1. In what ways is the refactored code simpler?

The refactored code got rid of the if statements, and moves two methods inside the Bet class abstractly, to be implemented in the specific subclasses, so that less code is repeated.

#####2. In what ways is the refactored code more complex?

There are more classes now. Three classes were added extending the original Bet.class. However, as the project scales (for example, were we to add the three roulette games suggested in the project), these changes would definitely become more worth it.

#####3. What trade-offs did you make when refactoring your old code?

When calling the method betIsMade, which was moved into the Bet class, we now have to pass in the Wheel created earlier in the game; however, overall there is less repeated code.

#####4. Which code do you prefer and why?

The refactored code is preferable, because less code is repeated, and it is now more robust and will allow more bet subclasses to be added in a fairly easy way.