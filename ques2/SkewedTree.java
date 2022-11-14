package com.greatlearning.ques2;

import java.util.ArrayList;
import java.util.Collections;

public class SkewedTree {
	ArrayList<Integer> arr = new ArrayList<Integer>();
	Node skewRot = null;
	Node temp = null;
	Node sRoot = null;

	public class Node {
		int data;
		public Node left;
		public Node right;

	}

	public Node newNode(int data) {
		Node tempNode = new Node();
		tempNode.data = data;
		tempNode.left = null;
		tempNode.right = null;

		return tempNode;
	}

	public void innorderTraversal(Node root) {
		if (root == null) {
			return;
		}

		innorderTraversal(root.left);
		arr.add(root.data);
		innorderTraversal(root.right);

	}

	public void rightSkewed(Node root) {

		innorderTraversal(root);

		Collections.sort(arr);
		arr.forEach((node) -> {

			if (skewRot == null) {
				skewRot = newNode(node);
				temp = skewRot;
			} else {
				temp.right = newNode(node);
				temp = temp.right;

			}
		});

		System.out.println("Skew root is " + skewRot.data);

		skewedDisplay(skewRot);

	}

	public void skewedDisplay(Node root) {

		if (root == null) {
			return;
		}

		System.out.print(root.data + " ");
		skewedDisplay(root.right);

	}

}
