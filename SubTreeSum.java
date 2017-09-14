import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubTreeSum {
	
	static List<Integer> result = new ArrayList<Integer>();
	
public static void main(String[] args) {
		TreeNode a = new TreeNode(5);
		TreeNode b = new TreeNode(7);
		TreeNode c = new TreeNode(8);
		TreeNode d = new TreeNode(-8);
		TreeNode e = new TreeNode(2);
		
		a.left = b;
		a.right = c;
		a.right.left = d;
		a.right.right = e;
		
		List<Integer> myres = new ArrayList<Integer>();
		
		int[] me = findFrequentTreeSum(a);
		
	    for(int i = 0;i<me.length;i++){
	    	System.out.println(me[i]);
	    }
		
}
	
	public static int[] findFrequentTreeSum(TreeNode root) {
        
        int m = individualsum(root);
        int[] a  = map(result);
        return a;
        
   }
	
   public static int[]  map(List<Integer> a){
	   int count = 0;
	   int max = 0;
	   Map<Integer,Integer> mymap = new HashMap<Integer,Integer>();
	   
	   
	   for(int i : a){
		   if(mymap.containsKey(i)){
			   mymap.put(i, mymap.get(i) + 1);
		   }
		   else{
			   mymap.put(i, 1);
		   }
		   
		   max = Math.max(max, mymap.get(i));
	   }
	   
	   int[] finalresult = new int[mymap.size()];
	   
	   for(int i : mymap.keySet()){
		 if(mymap.get(i) == max){
			 finalresult[i] = i;
		 }
		 
	   }
	   
	   return finalresult;
   }
        
    public static int individualsum(TreeNode root){
		
		int finalsum = 0;
		
		if(root == null) return 0;
		
		if(root.left == null && root .right == null) return root.val;
		
		else{
			
			int suml = 0;
			int sumr = 0;
			int sum = 0;
			
			suml = individualsum(root.left);
			result.add(suml);
			
			sumr = individualsum(root.right);
			
			result.add(sumr);
			sum = suml + sumr + root.val;
			
			result.add(sum);
			
			finalsum = sum;
		}
		
		return finalsum;
		
		
	}

}

class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
