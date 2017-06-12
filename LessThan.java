import java.util.*;

public class LessThan{
	public static void main(String args[]) {
		int ar1[] = {1,2,3,4,7,9};
		int ar2[] = {0,1,2,1,1,4};
		System.out.println(Arrays.toString(lessThan(ar1, ar2)));
	}

	public static int[] lessThan(int ar1[], int ar2[]){
		Arrays.sort(ar2);
		int ans[] = new int[ar1.length];
		for(int i = 0 ; i < ar1.length ; i++){
			ans[i] = binarySearch(ar1[i], ar2);
		}
		return ans;
	}

	public static int binarySearch(int x, int ar[]){
		int left = 0, right = ar.length-1;
		while(left <= right){
			int mid = (left + right)/2;
			if(ar[mid] <= x) left = mid + 1;
			else		 right = mid - 1;
		}
		return left;
	}
}
