package twoSum;

public class TwoSumSolution {
	public static void main(String[] args)
	{
		// input for nums and target
	    int [] nums = {3,2,4};
		int target = 6;
		
		// Getting the bruteForce solution
		BruteForceSolution object = new BruteForceSolution();
		int[] solution = object.twoSum(nums, target);
		
		//Printing out the solution
		System.out.println("[" + solution[0] + "," + solution[1] + "]");
	}
}
