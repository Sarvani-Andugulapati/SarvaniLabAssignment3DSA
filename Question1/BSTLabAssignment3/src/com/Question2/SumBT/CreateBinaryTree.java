package com.Question2.SumBT;

public class CreateBinaryTree {
  class Node{
	 int key;
	 Node left;
	 Node right;
  public Node newNode(int data) {
	Node temp = new Node();
	temp.key = data;
	temp.left = null;
	temp.right = null;
	
	return temp;
 }
}
