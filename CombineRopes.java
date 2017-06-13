import java.util.*;

public class CombineRopes{
	public static void main(String args[]){
		int ar[] = {4,3,2,6};
		System.out.println(combineRopes(ar));
	}

	public static int combineRopes(int ar[]){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int cost = 0;
		for(int i = 0 ; i < ar.length ; i++) pq.add(ar[i]);
		while(pq.size() > 1){
			int a = pq.poll(); int b = pq.poll();
			int sum = a + b;
			pq.add(sum);
			cost += sum;
		}
		//cost += pq.poll();
		return cost;
	}
}
