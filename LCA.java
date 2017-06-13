import java.util.*;

class BinaryNode{
	int value;
	BinaryNode left;
	BinaryNode right;
	BinaryNode(int value){ this.value = value; }
}

public class LCA{
	public static void main(String args[]){
		BinaryNode root = new BinaryNode(100);
		root.left = new BinaryNode(50);
		root.right = new BinaryNode(150);
		root.left.left = new BinaryNode(25);
		root.left.right = new BinaryNode(65);
		root.left.left.left = new BinaryNode(10);
		root.left.left.right = new BinaryNode(40);
		System.out.println(lca(root,10,40));
		System.out.println(lca(root,10,75));
		System.out.println(lca(root,40,75));
		System.out.println(lca(root,40,150));
	}

	public static int lca(BinaryNode root, int a, int b){
		//System.out.println(a+" " + root.value+" " +b);
		if(root == null) return -1;
		if(b < a) { a = a + b; b = a - b; a = a - b; }
		if(root.value > a && root.value < b) return root.value;
		else if(root.value > a && root.value > b)
			return lca(root.left, a ,b);
		else //if(root.value < a && root.value < b)
			return lca(root.right, a, b);
	}
}
