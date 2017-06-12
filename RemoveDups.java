import java.util.*;
import java.io.*;

public class RemoveDups{
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ss;
		while( (ss = br.readLine()) != null){
			char[] s = ss.toCharArray();
			boolean flag[] = new boolean[256];
			Arrays.fill(flag, false);
			int tail = 0;
			for(int i = 0 ; i < s.length ; i++){
				while(i < s.length && flag[s[i]]){
					i++;
				}
				if(i >= s.length) break;
				flag[s[i]] = true;
				s[tail++] = s[i];
			}
			if(tail < s.length) s = Arrays.copyOf(s, tail);
				//for(int i = tail ; i < s.length ; i++)
				//	s[i] = ' ';
			System.out.println(String.valueOf(s));
		}
	}
}
