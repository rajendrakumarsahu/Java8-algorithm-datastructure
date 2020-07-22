package com.dataStructure.example;

public class ArrayRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int a[] = {1,2,3,4,5,6,7};
		int noRotation = 3;
		ArrayRotate arrayRotate = new ArrayRotate();
		
		arrayRotate.rotate(a,noRotation,n);
		arrayRotate.diplayArray(a);
		

	}

	private void diplayArray(int[] a) {
		for(int i:a) {
			System.out.println(i);
		}
		
	}

	private void rotate(int[] a, int noRotation, int n) {
		
		for(int i=0;i<noRotation;i++) {
			leftRotate(a,n);
		}
	}

	private void leftRotate(int[] a, int n) {
		int temp = 0;
		
		temp = a[0];
		for(int i=0;i<a.length-1;i++) {
			a[i] = a[i+1];
		}
		a[a.length-1] = temp;
		
	}

}
