
public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "ACBEA";
		String s2 = "ADCA";

	}
	
	public String lcsr(String a , String b){
		
		int al = a.length();
		int bl = b.length();
		
		if(a.substring(0,1) == b.substring(0,1)){
			return 1 + lcsr(a.substring(1,al),b.substring(1,bl));
		}
		
		else{
			return a;
		}
	
	}

}
