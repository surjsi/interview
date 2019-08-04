package inv.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class Heap1_KLongestString {

	public static void main(String[] arg) {
		 List<String> str = Arrays.asList("123456","1234", "1234567","123", "1234568","12345");
		 System.out.println(topKLongest(3, str));
	}
	
	public static List<String> topKLongest(int k, List<String> iter) {
		PriorityQueue<String> minHeap = new PriorityQueue<>(k, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		Iterator<String> itr = iter.iterator(); 
		while(itr.hasNext()) {
			minHeap.add(itr.next());
			if(minHeap.size() > k) {
				minHeap.poll();
			}
		}
		return new ArrayList<String>(minHeap);
	}
}
