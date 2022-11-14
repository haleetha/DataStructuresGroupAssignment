package com.greatlearning.driver.ques1;

import java.util.Scanner;

public class SkyScrapperMain {

	public static void main(String[] args) {
		SkyScrapperImpl ob = new SkyScrapperImpl();
		Scanner sc = new Scanner(System.in);
		int n;
		int arr[];

		System.out.println("Enter the number of floors in the building");
		n = sc.nextInt();
		arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the floor size given on day : " + (i + 1));
			arr[i] = sc.nextInt();
		}

		ob.skyScrap(arr, n);

		sc.close();

	}

}
