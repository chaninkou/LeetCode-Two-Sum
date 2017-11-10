package twoSum;

import java.util.HashMap;
import java.util.Map;

class TwoPassHashTableSolution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        // we add each element's value and its index to the table
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i],i);
        }
        for(int i = 0; i <nums.length; i++)
        {
            int answer = target - nums[i];
            if(map.containsKey(answer) && map.get(answer) != i)
            {
                return new int[] {i, map.get(answer)};
            }
        }
        throw new IllegalArgumentException("There is no two number that could add up to target");
    }
}
