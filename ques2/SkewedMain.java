package com.greatlearning.ques2;

import com.greatlearning.ques2.SkewedTree.Node;

public class SkewedMain {

	public static void main(String[] args) {
		SkewedTree obj = new SkewedTree();

		Node root = obj.newNode(50);
		root.left = obj.newNode(30);
		root.right = obj.newNode(60);
		root.left.left = obj.newNode(10);
		root.right.right = obj.newNode(55);

		obj.rightSkewed(root);

	}

}
