import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class ReconstructItenerary {
	
	static Map<String, PriorityQueue<String>> mymap = new HashMap();
	
	static List<String> result = new LinkedList();

	public static void main(String[] args) {
		//String[][] tickets = {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
		String[][] tickets = {{"MUC","LHR"},{"JFK","MUC"},{"SFO","SJC"},{"LHR","SFO"}};
		findItinerary(tickets);
	}
	
public static List<String> findItinerary(String[][] tickets) {
for(String[] ticket:tickets){
		mymap.computeIfAbsent(ticket[0], k->new PriorityQueue()).add(ticket[1]);
		System.out.println("mymap");
		System.out.println(mymap);
		
	}
    visit("JFK");
    System.out.println(result);
	return result;
        
 }

public static void visit(String airport){
	while(mymap.containsKey(airport) && !mymap.get(airport).isEmpty()){
		visit(mymap.get(airport).poll());
    }
	result.add(0,airport);
	
}

static void visit1(String airport) {
    while(mymap.containsKey(airport) && !mymap.get(airport).isEmpty())
    	//System.out.println(airport + " " + targets.get(airport));
        visit1(mymap.get(airport).poll());
    result.add(0, airport);
    System.out.println(result);
}
	
}
