package inv.heap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Heap4_SortAlmostSorted {

	public static void main(String[] args) {
		
	}
	
	public static List<Integer> sort(int k, List<Integer> sortedArrays) {
		List<Integer> result = new ArrayList<>();
		Iterator<Integer> itr = sortedArrays.iterator();
		PriorityQueue<Integer> pq = new PriorityQueue<>(k, (o1, o2) -> Integer.compare(o1, o2));
		for(int i = 0; i< k && itr.hasNext(); i++) {
			pq.add(itr.next());
		}
		while(itr.hasNext()) {
			pq.add(itr.next());
			result.add(pq.remove());
		}
		Stream str = null;
		result.addAll(Stream.generate(pq::remove).limit(pq.size()).collect(Collectors.toList()));
		return result;
	}
}
