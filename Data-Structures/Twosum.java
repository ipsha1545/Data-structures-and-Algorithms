import java.util.HashMap;
import java.util.Map;

public class Twosum {
	Map<Integer,Integer> mymap = new HashMap<Integer,Integer>();
	int[] result = new int[2];
	public static void main(String[] args) {
		int[] myarray = {2,7,11,9,13,19};
		Twosum t = new Twosum();	
		t.twosum(myarray,24);	
		}
	
	
    public int[] twosum(int[] nums,int target){
    	for(int i = 0;i < nums.length;i++){
    		if(mymap.containsKey(target-nums[i])){
    			result[1] = i;
    			result[0] = mymap.get(target-nums[i]);
    			
    			
    		}
    		mymap.put(nums[i],i);
    	}
    	System.out.println(result[0]);
		System.out.println(result[1]);
		return null;
    	
	}

}

