package twoSum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args)
	{
		// input for nums and target
	    int [] nums = {3,2,4};
		int target = 10;
		System.out.println("Input: " + Arrays.toString(nums));
		System.out.println("Target: " + target + "\n");
		
//		// Getting the bruteForce solution
//		BruteForceSolution object = new BruteForceSolution();
//		int[] solution = object.twoSum(nums, target);
//		
//		//Printing out the solution
//		System.out.println("BruteForce");
//		
//		// Getting the TwoPassHashTableSolution solution
//		TwoPassHashTableSolution object2 = new TwoPassHashTableSolution();
//		int[] solution2 = object2.twoSum(nums, target);
//		
//		//Printing out the solution
//		System.out.println("\nTwo-Pass HashTable");
//		
//		// Getting the OnePassHashTableSolution solution
//		OnePassHashTableSolution object3 = new OnePassHashTableSolution();
//		int[] solution3 = object3.twoSum(nums, target);
//		
//		//Printing out the solution
//		System.out.println("\nOne-Pass HashTable");
		
		FindTwoSumFunction solution = new FindTwoSumFunction();
		
		System.out.println("Solution: " + Arrays.toString(solution.twoSum(nums, target)));
		
		if(!Arrays.toString(solution.twoSum(nums, target)).equals("[0, 0]")){
			System.out.println("Actual value: " + nums[solution.twoSum(nums, target)[0]] + " + " + nums[solution.twoSum(nums, target)[1]] + " = " + target);
		}
	}
}
