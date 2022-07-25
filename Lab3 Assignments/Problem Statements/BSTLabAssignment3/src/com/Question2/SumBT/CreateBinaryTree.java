package com.Question2.SumBT;

public class CreateBinaryTree {
	Node root;
	CreateBinaryTree(){
		root = null;
	}
	CreateBinaryTree(Node root,int key){
		root = newNode(key);
	}
  class Node{
	 int key;
	 Node left;
	 Node right;
  }
  public Node newNode(int data) {
	Node temp = new Node();
	temp.key = data;
	temp.left = null;
	temp.right = null;
	
	return temp;
 }
  Node insert(Node root,int key) {
	  root = insertRec(root,key);
	  return root;
  }
   Node insertRec(Node root, int key) {
	   if(root == null) {
		   root = newNode(key);
		   return root;
	   }
	   if(key<root.key){
		   root.left = insertRec(root.left, key);
	   }else {
		   if(key>root.key) {
			   root.right = insertRec(root.right,key);
		   }
	   }
	   return root;
   }
   }
