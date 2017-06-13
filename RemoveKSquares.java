import java.util.*;

public class RemoveKSquares{
	public static void main(String arg[]){
		char[] s = "abccc".toCharArray();
		int k = 1;
		System.out.println(removeKSquares(s , k));
	}

	public static int removeKSquares(char[] s, int k){
		int freq[] = new int[26];
		for(int i = 0 ; i < s.length ; i++) freq[s[i]-'a']++;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(26, Collections.reverseOrder());
		for(int i = 0; i < 26 ; i++)
			if(freq[i] != 0) pq.add(freq[i]);
		while(k-- != 0){
			int tmp = pq.poll();
			tmp--;
			pq.add(tmp);
		}
		int ans = 0;
		while(!pq.isEmpty()){
			int tmp = pq.poll();
			tmp *= tmp;
			ans += tmp;
		}
		return ans;
	}
}
