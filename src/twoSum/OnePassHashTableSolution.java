package twoSum;

import java.util.HashMap;
import java.util.Map;

class OnePassHashTableSolution 
{
    public int[] twoSum(int[] nums, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <nums.length; i++)
        {
            int answer = target - nums[i];
            // Look back to check if current element's complement already exists in the table
            if(map.containsKey(answer))
            {
            	// // If it exists, we have found a solution and return immediately.
                return new int[] {map.get(answer), i};
            }
            // While we iterate and inserting elements into the table, 
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("There is no two number that could add up to target");
    }
}
