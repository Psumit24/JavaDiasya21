package collectionsclassdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//import java.util.function.BiFunction;

public class ArrayMax {
	public static void main(String[] args) {
		ArrayList<String> stateCodes = new ArrayList<String>();
		stateCodes.add("MH");
		stateCodes.add("MP");
		stateCodes.add("RJ");
		stateCodes.add("UK");
		stateCodes.add("TN");
		stateCodes.add("AP");
		stateCodes.add("UP");
		System.out.println("code>>"+stateCodes);
		ArrayList<String> states = new ArrayList<String>();
		states.add("Maharashtra");
		states.add("Madhya Pradesh");
		states.add("Rajasthan");
		states.add("Uttarakhand");
		states.add("Tamil Nadu");
		states.add("Andhra Pradesh");
		states.add("Uttar Pradesh");
		System.out.println("States>>"+states);
		@SuppressWarnings("rawtypes")
		HashMap<ArrayList, ArrayList> india = new HashMap<>();
		india.put(stateCodes, states);
		System.out.println(india);
		Set<?> keys =india.entrySet();
		Iterator<?> itr =keys.iterator();
		while (itr.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry= (Map.Entry) itr.next();
			
			ArrayList<?> al = (ArrayList<?>) entry.getKey();
			ArrayList<?> ax = (ArrayList<?>) entry.getValue();
			for (int i = 0; i < al.size(); i++) {
				System.out.println(al.get(i)+"="+ax.get(i));
				
			}
		}
	}
}
