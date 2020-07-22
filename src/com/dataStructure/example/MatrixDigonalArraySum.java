package com.dataStructure.example;

public class MatrixDigonalArraySum {

	
	public static void main(String...strings) {
		int n =3;
		//int[][] a=new int[n][n];  // new array
		int a[][] = { { 11, 2, 4 }, { 4, 5, 6}, { 10, 8, -12 } };
	    int x=0;//primary diagonal sum
	    int y=0;//secondary diagonal sum
	    int sum=0;//total sum
	    for (int i=0;i<n;i++) {
	    	System.out.println(a[i][i]);
	      x += a[i][i];
	    }
	    for (int p=0;p<n;p++) {
	      int k=a.length-p-1;
	      y+=a[p][a.length-p-1];
	      System.out.println(a[p][a.length-p-1]);
	      k+=-1;
	    }
	    sum=x-y;
	    System.out.println(sum);
	    System.out.println(Math.abs(sum));
	    }
	//https://stackoverflow.com/questions/6565862/adding-the-diagonal-values-in-a-2d-array
}
