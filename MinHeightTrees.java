import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MinHeightTrees {

	public static void main(String[] args) {
		int[][] edges = new int[][] {{0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}};
		List<Integer> a = findMinHeightTrees(6,edges);
		System.out.println(a);
	}
	
     public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
    	 if(n == 1) return Collections.singletonList(0);
    	 
    	 List<Set<Integer>> adj = new ArrayList<>();
    	 
    	 for(int i = 0;i<n;i++){
    		 adj.add(new HashSet<>());
    	 }
    	 
    	 for(int[] a:edges){
    		adj.get(a[0]).add(a[1]);
    		adj.get(a[1]).add(a[0]);
    	}
    	 
    	List<Integer> leaves = new ArrayList<>(); 
    	 
    	for(int i = 0; i < n;i++){
    		if(adj.get(i).size() == 1) leaves.add(i);
    	}
    	
    	while(n>2){
    		n-=leaves.size();
    		List<Integer> newleaves = new ArrayList();
    		for(int i : leaves){
    			int j = adj.get(i).iterator().next();
    			
    			
    			adj.get(j).remove(i);
    			if(adj.get(j).size() == 1) newleaves.add(j);
    		}
    		
    		leaves = newleaves;
         }
    		 
   return leaves;
    	
    }
    	
   }
    	
	



