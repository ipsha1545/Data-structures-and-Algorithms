import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

	public static void main(String[] args) {
		System.out.println("Hii");
		// TODO Auto-generated method stub
        int[] S = {-1, 0, 1, 2,-5,3,4};
        List<List<Integer>> res = threeSum(S,8);
        System.out.println(res);
        
	}
	
	public int[] twoSum(int[] num, int target) {
	    int[] indice = new int[2];
	    if (num == null || num.length < 2) return indice;
	    int left = 0, right = num.length - 1;
	    while (left < right) {
	        int v = num[left] + num[right];
	        if (v == target) {
	            indice[0] = left + 1;
	            indice[1] = right + 1;
	            break;
	        } else if (v > target) {
	            right --;
	        } else {
	            left ++;
	        }
	    }
	    return indice;
	}
	//res.add(Arrays.asList(num[left], num[right], num[mid]));
	
	public static List<List<Integer>> threeSum(int[] num, int target){
		
		List<List<Integer>> res = new ArrayList<>();
		if(num == null || num.length < 3) return res;
		
		int i;
		//-4,-1,-1,0,1,2
		
		Arrays.sort(num);
		
		for(i = 0; i < num.length-3;i++){
			if(i == 0 || num[i] > num[i-1]){
				int start = i+1;
				int end = num.length-1;
				
				while(start < end){
					
					if(num[i] + num[start] + num[end] == 0){
						res.add(Arrays.asList(num[i], num[start], num[end]));
					}
					
					if(num[i] + num[start] + num[end] < 0){
						int currStart = start;
						while(num[start] == num[currStart] && start < end){
							start++;
						}
					}
					
					else{
						int currEnd = end;
						while(num[end] == num[currEnd] && start < end){
							end--;
						}
					}
					
				}
				
				
			}
			
		}
		
		return res;
		
	}
	
	

}
