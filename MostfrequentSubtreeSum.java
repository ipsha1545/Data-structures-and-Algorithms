import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.*;

public class MostfrequentSubtreeSum {

	public static void main(String[] args) {
		String s = "tree";
		
		MostfrequentSubtreeSum s1 = new MostfrequentSubtreeSum();
		
        System.out.println(s1.frequencySort(s));
	}
	
	//Most frequent subtree sum
	
	
	public String frequencySort(String s) {
	    if (s == null) {
	        return null;
	    }
	    Map<Character, Integer> map = new HashMap();
	    char[] charArray = s.toCharArray();
	    int max = 0;
	    for (Character c : charArray) {
	        if (!map.containsKey(c)) {
	            map.put(c, 0);
	        }
	        map.put(c, map.get(c) + 1);
	        max = Math.max(max, map.get(c));
	        System.out.println("map" + map);
	    }

	    List<Character>[] array = buildArray(map, max);

	    return buildString(array);
	}

	private List<Character>[] buildArray(Map<Character, Integer> map, int maxCount) {
	    List<Character>[] array = new List[maxCount + 1];
	    for (Character c : map.keySet()) {
	        int count = map.get(c);
	        if (array[count] == null) {
	            array[count] = new ArrayList();
	        }
	        array[count].add(c);
	        System.out.println("List" + array[count]);
	    }
	    return array;
	}

	private String buildString(List<Character>[] array) {
	    StringBuilder sb = new StringBuilder();
	    System.out.println("array.length" + array.length);
	    for (int i = array.length - 1; i > 0; i--) {
	        List<Character> list = array[i];
	        System.out.println("array[i]" + array[i]);
	        if (list != null) {
	            for (Character c : list) {
	                for (int j = 0; j < i; j++) {
	                    sb.append(c);
	                }
	            }
	        }
	    }
	    return sb.toString();
	}

}
