package twoSum;

import java.util.Arrays;

public class Main {
	public static void main(String[] args)
	{
		// input for nums and target
	    int [] nums = {3,2,4};
		int target = 6;
		System.out.println("List: [" + nums[0] + "," +nums[1] + "," +nums[2] + "]");
		System.out.println("Target: " + target + "\n");
		
//		// Getting the bruteForce solution
//		BruteForceSolution object = new BruteForceSolution();
//		int[] solution = object.twoSum(nums, target);
//		
//		//Printing out the solution
//		System.out.println("BruteForce");
//		System.out.println("[" + solution[0] + "," + solution[1] + "]");
//		
//		// Getting the TwoPassHashTableSolution solution
//		TwoPassHashTableSolution object2 = new TwoPassHashTableSolution();
//		int[] solution2 = object2.twoSum(nums, target);
//		
//		//Printing out the solution
//		System.out.println("\nTwo-Pass HashTable");
//		System.out.println("[" + solution2[0] + "," + solution2[1] + "]");
//		
//		// Getting the OnePassHashTableSolution solution
//		OnePassHashTableSolution object3 = new OnePassHashTableSolution();
//		int[] solution3 = object3.twoSum(nums, target);
//		
//		//Printing out the solution
//		System.out.println("\nOne-Pass HashTable");
//		System.out.println("[" + solution3[0] + "," + solution3[1] + "]");
		
		FindTwoSumFunction solution = new FindTwoSumFunction();
		
		System.out.println("Solution: " + Arrays.toString(solution.twoSum(nums, target)));
	}
}
