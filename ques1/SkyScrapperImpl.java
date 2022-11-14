package com.greatlearning.driver.ques1;

import java.util.Collections;
import java.util.PriorityQueue;

public class SkyScrapperImpl {
	int temp[];
	int max;

	public void skyScrap(int[] arr, int n) {

		max = n;
		temp = new int[n];
		System.out.println("Order of construction as follows..");

		PriorityQueue<Integer> Q = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			System.out.println("Day : " + (i + 1));

			temp[i] = arr[i];
			Q.add(temp[i]);

			while (!Q.isEmpty() && Q.peek() == max) {
				System.out.print(Q.poll() + " ");
				max--;
			}

			System.out.println();
		}

	}
}
