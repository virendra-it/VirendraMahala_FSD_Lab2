package org.greatlearning.lab2.testcase1;
import java.util.Scanner;

public class PayMoney {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		int size = sc.nextInt();
		System.out.println("enter the values of array");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		System.out.println("enter the the total no. of target that needs to be achieved");
		int targetNo;
		targetNo = sc.nextInt();
		while (targetNo != 0) 
		{
			// targetNo--;
			int flag = 0;
			int target;
			System.out.println("enter the value of target");
			target = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < size; i++) 
			{
				sum += arr[i];
				if (sum >= target) 
				{
					System.out.println("target achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}

			}
			if (flag == 0)
				System.out.println("Given target is not achieved");
			targetNo--;
		}

	}
 
}
