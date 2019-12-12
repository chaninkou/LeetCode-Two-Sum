package twoSum;

import java.util.HashMap;
import java.util.Map;

public class FindTwoSumFunction {
	public int[] twoSum(int[] nums, int target){
		// This hold two elements, one is the start index, and the other is end index
		int[] result = new int[2];
		
		// Using hashmap
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++){
			// The thing we trying to find the target - current element
			int answer = target - nums[i];
			
			// If the map contains the answer, then return right away
			if(map.containsKey(answer)){
				// Return the index when the element was stored
				result[0] = map.get(answer);
				
				// Getting the index of the element when it contains the answer
				result[1] = i;
				
				return result;
			}
			
			// Store the key as the element and i as the index
			map.put(nums[i], i);
			
		}
		
		return result;
	}
}
