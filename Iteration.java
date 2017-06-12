import java.util.*;
import java.io.*;
//test
public class Iteration{
	public static void main(String args[]) throws Exception{
		//int ar[] = {0,0,0,1,1,0,0,1,1,0,1,1,1,1,0,0,0,0,0,0,0,1};
		int ar[] = {1,0,0,0,0,0};
		int min = Integer.MIN_VALUE;
		for(int i = 0 ; i < ar.length ; i++){
			int curlen = 0, start = i, count = 0;
			while(i < ar.length && ar[i] == 0){
				i++; count++;
			}
			if(start == 0 && i == ar.length) {
				min = -1;
				break;
			}
			if(start == 0) curlen = count;
			else if(i == ar.length) curlen = count;
			else if(count % 2 == 1) curlen = (count / 2) + 1;
			else curlen = count/2;
			min = Math.max(curlen, min);
		}
		System.out.println(min);
	}
}
