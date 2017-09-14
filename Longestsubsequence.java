import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Longestsubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] S  = {1,5,2};
	}
	
	public List<List<Integer>> subsets(int[] S) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        //System.out.println(res);
        
        Arrays.sort(S);
        for(int i : S) {
            List<List<Integer>> tmp = new ArrayList<>();
            for(List<Integer> sub : res) {
                List<Integer> a = new ArrayList<>(sub);
                a.add(i);
                tmp.add(a);
            }
            res.addAll(tmp);
        }
        return res;
    }

}
