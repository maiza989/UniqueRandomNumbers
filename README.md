# UniqueRandomNumbers


### Analysis

      
    In general, you cannot mulitply loop together, since their bounds might depend on one another. In this case since there is no dependency, the runtime can be multiplied.
     The innermost loop always takes time O(n). When the second loop run, it runs for O(n) on each iteration doing O(n) work to run the inter most loop. This takes time O(n^2).
     Lastly, when the outer loop runs, it does O(n2) work per iteration. It also runs for O(log n) iterations, since it runs equal to the number of times you have to divide n by two   you reach 1. Consequently, the total work is O(n^2 log n).
     Our main method has a for loop as well so in total it will be O(n^3 log n)
