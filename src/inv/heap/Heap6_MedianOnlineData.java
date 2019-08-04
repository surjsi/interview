package inv.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Heap6_MedianOnlineData {

public static void main(String[] args) {
		
	}
	
	public static List<Integer> sort(int k, List<Integer> sortedArrays) {
		List<Integer> result = new ArrayList<>();
		Iterator<Integer> itr = sortedArrays.iterator();
		
		PriorityQueue<Integer> min = new PriorityQueue<>();
		
		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		
		while(itr.hasNext()) {
			min.add(itr.next());
			max.add(min.remove());
			if(max.size() > min.size()) {
				min.add(max.remove());
			}
			result.add(
							(int) (min.size() == max.size() ? 
									0.5 * (min.peek()+max.peek()):
									min.peek())
					);
		}
		
		return result;
	}
}
