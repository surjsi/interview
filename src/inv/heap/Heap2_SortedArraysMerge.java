package inv.heap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

class Arr{
	public Integer indx;
	public Integer value;
	public Arr(Integer indx, Integer value) {
		this.indx = indx;
		this.value = value;
	}
}
public class Heap2_SortedArraysMerge {

	public static void main(String[] args) {
		
	}
	
	public static List<Integer> sort(List<List<Integer>> sortedArrays) {
		List<Integer> result = new ArrayList<>();
		List<Iterator<Integer>> itr = new ArrayList<>();
		for(int i = 0; i < sortedArrays.size(); i++) {
			itr.add(sortedArrays.get(i).iterator());
		}
		
		PriorityQueue<Arr> pq = new PriorityQueue<>(itr.size(), (o1, o2) -> Integer.compare(o1.value, o2.value));
		for(int i = 0; i < sortedArrays.size() && itr.get(i).hasNext(); i++) {
			pq.add(new Arr(i, itr.get(i).next()));
		}
		while(!pq.isEmpty()) {
			Arr a = pq.remove();
			result.add(a.value);
			if(itr.get(a.indx).hasNext()) {
				pq.add(new Arr(a.indx, itr.get(a.indx).next()));
			}
		}
		return result;
	}
}
