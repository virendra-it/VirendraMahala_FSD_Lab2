package org.greatlearning.lab2.testcase2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		MergeSortImplementation mergeSortImplementation= new MergeSortImplementation();
		NotesCount notescount= new NotesCount();
		System.out.println("enter the size of currency denominations");
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int [] notes=new int [size];
		System.out.println("enter the currency denominations value");
		for(int i=0;i<size;i++)
		{
			notes[i]=sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount=sc.nextInt();
		mergeSortImplementation.sort(notes,0, notes.length-1);
		//Arrays.sort(notes);
		
	       
		notescount.notesCount(notes,amount);
	}

}
