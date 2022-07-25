package com.Question2.SumBT;

import com.Question2.SumBT.CreateBinaryTree.Node;
import java.util.*;
public class FindPairofNodes {

	public static void main(String[] args) {
		Node root = null;
		CreateBinaryTree bt = new CreateBinaryTree();
		FindPairofNodes fp = new FindPairofNodes();
		root =  bt.insert(root,40);
		root =  bt.insert(root,20);
		root =  bt.insert(root,60);
		root =  bt.insert(root,10);
		root =  bt.insert(root,30);
		root =  bt.insert(root,50);
		root =  bt.insert(root,70);
		
		int sum = 60;
		fp.findPair(root,sum);
	}

	 void findPair(Node root, int sum) {
		Set<Integer> set = new HashSet<Integer>();
		if(!FindPairUntil(root,sum,set)) {
			System.out.println("The Pairs do not exist:\n");
		}
	}
	private boolean FindPairUntil(Node root, int sum, Set<Integer> set) {
		if(root == null)
		return false;
		if(FindPairUntil(root.left,sum,set))
			return true;
		if(set.contains(sum-root.key)) {
			System.out.println("The Pair to sum are:"+" "+root.key+","+" "+(sum-root.key));
			return true;
		}else {
			set.add(root.key);
	}
		return FindPairUntil(root.right,sum,set);
	}
}
