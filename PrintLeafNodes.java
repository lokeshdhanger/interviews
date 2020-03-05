package trees;

import java.util.Stack;

public class PrintLeafNodes {
	
	static Node root;
	
	public static void main(String[] args) {
		
		root=new Node(10);
		root.left=new Node(6);
		root.left.left=new Node(3);
		root.left.right=new Node(8);
		root.right=new Node(15);
		root.right.right=new Node(18);
		
		printLeafNodes(root);
		System.out.println("\n\n");
		printLeafNodesIterative(root);
	}
	
	/**
	 * recursive solution
	 * 
	 * 
	 * time complexity: O(n)
	 * 
	 * @param node
	 */
	public static void printLeafNodes(Node node) {
		if (node==null) {
			return;
		}
		if (node.left==null && node.right==null) {
			System.out.print(node.data+" ");
		}
		printLeafNodes(node.left);
		printLeafNodes(node.right);
	}
	
	

	
	/**
	 * iterative solution
	 * 
	 * @param node
	 */
	public static void printLeafNodesIterative(Node root) {
		if (root==null) {
			return;
		}
		
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			
			if (node.right!=null) {
				stack.add(node.right);
			}
			
			if (node.left!=null) {
				stack.add(node.left);
			}
			
			if (node.left==null && node.right==null) {
				System.out.print(node.data+" ");
			}
		}
	}

}
