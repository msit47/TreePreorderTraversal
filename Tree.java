package Pract_test;

import java.util.ArrayList;
import java.util.Stack;

//creation of nodes
class Node
{
	int data;
	Node left;
	Node right;
	Node(int item)
	{
		this.data=item;
	}
	
}
//creation of binary tree which has nodes
class BineryTree{
	Node root;
	BineryTree()
	{
		root=null;
	}
}
public class Tree{
	public static void main(String[]args)
	{
		BineryTree tree=new BineryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		ArrayList<Integer> al=new ArrayList<Integer>();
		//call inorder traversal method
		al=preorderTraversal(tree.root);
		for(int l : al)
		{
			System.out.println(l);
		}
		
	}

	private static  ArrayList<Integer> preorderTraversal(Node root) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> returnlist=new ArrayList<Integer>();
		if(root==null)
		{
			return returnlist;
		}
		
		Stack<Node> st=new Stack<Node>();
		st.push(root);
		while(!st.isEmpty())
		{
			Node n=st.pop();
			returnlist.add(n.data);
			if(n.right!=null)
			st.push(root.right);
			if(n.left!=null)
				st.push(root.left);
			
			
			
		}
		
		
		return returnlist;
		
	}
}



