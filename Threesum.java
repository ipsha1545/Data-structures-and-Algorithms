import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Threesum {

	public static void main(String[] args) {
		int[] p = {-1,0,1,2,3,-5};
		List<List<Integer>> res = threesum(p);
		System.out.println(res);

	}
	
	public static List<List<Integer>> threesum(int[] arr){
		List<List<Integer>> res = new ArrayList<>();
		
		int i;
		
		Arrays.sort(arr);
		
		for(i = 0 ; i < arr.length-2;i++){
			if(i == 0 || arr[i] > arr[i-1]){
				int start = i+1;
				int end = arr.length-1;
				
				while(start < end){
					if(arr[i] + arr[start] + arr[end] == 0){
						res.add(Arrays.asList(arr[i],arr[start],arr[end]));
					}
					
					if(arr[i] + arr[start] + arr[end] < 0){
						int currStart = start;
						
						while(arr[start] == arr[currStart] && start < end){
							start++;
						}
					}
					
					else{
						int currEnd = end;
						
						while(arr[end] == arr[currEnd] && start < end){
							end--;
						}
						
					}
					
				}
				
			}
			
		}
		
		return res;
		
	}

}
