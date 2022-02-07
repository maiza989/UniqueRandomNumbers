/**
 * A program that generate random numbers without duplication
 * @author Maitham Alghamgham
 * @version 1.4
 * Project Part 2 
 * CS330 - Algorithms 
 * Spring 2022
 */
public class RandomNumbers {
	/**
	 * returns a array of random numbers with no duplicates
	 * @param range the range of possible numbers for ex. if 50 then it can be anywhere from 1-50
	 * @param length the length of the array of random numbers
	 * @return array of random numbers with no duplicates.
	 */
	public static int[] getRandomNumbersWithNoDuplicates(int range, int length){
	    if (length<range){
	        /**
	         * this is where all the random numbers
	         */
	        int[] randomNumbers = new int[length];
	        
	        /**
	         *  loop through all the random numbers to set them
	         */
	        for (int i = 0; i < randomNumbers.length; i++){
	            
	            /**
	             * get the remaining possible numbers
	             */
	            int remainingNumbers = range-i;
	            
	            /**
	             * get a new random number from the remainingNumbers
	             */
	            int newRandSpot = (int) (Math.random()*remainingNumbers);
	            
	            newRandSpot++;
	            
	            /**
	             * loop through all the possible numbers
	             */
	            for (int t = 1; t < range+1; t++){
	                
	                /**
	                 *  check to see if this number has already been taken
	                 */
	                boolean taken = false;
	                for (int number : randomNumbers){
	                    if (t==number){
	                        taken = true;
	                        break;
	                    }
	                }
	                
	                /**
	                 *  if it hasnt been taken then remove one from the spots
	                 */
	                if (!taken){
	                    newRandSpot--;
	                    
	                    /**
	                     * if we have gone though all the spots then set the value
	                     */
	                    if (newRandSpot==0){
	                        randomNumbers[i] = t;
	                    }
	                }
	            }
	        }
	        return randomNumbers;
	    } else {
	        /**
	         *  invalid can't have a length larger then the range of possible numbers OR equal
	         */
	    }
	    return null;
	}
	public static void main(String[] args) {
	
		int[] result = getRandomNumbersWithNoDuplicates(100, 25);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i] + " ");
		}
		System.out.println("\nNumber of element in the array are: " + result.length + "\n");
		System.out.println("|Analysis|\n In general, you cannot mulitply loop together, since their bounds might depend on one another. In this case since there is no dependency, the runtime can be multiplied.\n The innermost loop always takes time O(n). When the second loop run, it runs for O(n) on each iteration doing O(n) work to run the inter most loop. This takes time O(n^2).\n Lastly, when the outer loop runs, it does O(n2) work per iteration. It also runs for O(log n) iterations, since it runs equal to the number of times you have to divide n by two before you reach 1. Consequently, the total work is O(n^2 log n).\n Our main method has a for loop as well so in total it will be O(n^3 log n)");

	}
}
