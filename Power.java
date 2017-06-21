public class Power{
	
	public static double power(int x, int y){
		if(y == 0) return 1;
		double tmp = power(x, y/2);
		if(y % 2 == 0) return (double)tmp*tmp;
		else {
			if(y > 0) return x*tmp*tmp;
			else return tmp*tmp/((double)x);
		}
	}

	public static void main(String args[]){
		System.out.println(power(2,-2));
	}
}
