package inv.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Heap5_KClosestStar {
	
	public static void main(String[] args) {
		
	}
	
	public static List<Integer> sort(int k, List<Integer> sortedArrays) {
		List<Integer> result = new ArrayList<>();
		Iterator<Integer> itr = sortedArrays.iterator();
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		
		while(itr.hasNext()) {
			max.add(itr.next());
			if(max.size() == k+1) {
				max.remove();
			}
		}
		return result;
	}

}
