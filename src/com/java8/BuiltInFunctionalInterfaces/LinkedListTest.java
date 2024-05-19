package com.java8.BuiltInFunctionalInterfaces;

class LinkedListTest {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Function to print middle of linked list */
	void printMiddle() {
		Node fistNode = head;
		Node secondNode = head;
		if (head != null) {
			while (fistNode != null && secondNode.next != null) {
				fistNode = secondNode.next.next;
				fistNode = fistNode.next;
			}
			System.out.println("The middle element is [" + fistNode.data + "] \n");
		}
	}

//	public static void main(String[] args) {
//		LinkedList llist = new LinkedList();
//		for (int i = 5; i > 0; --i) {
//			Node fistNode = head;
//			Node secondNode = head;
//			if (head != null) {
//				while (fast_ptr != null && fast_ptr.next != null) {
//					secondNode = fast_ptr.next.next;
//					slow_ptr = slow_ptr.next;
//				}
//				System.out.println("The middle element is [" + slow_ptr.data + "] \n");
//			}
//		}
//	}
}
// This code is contributed by Rajat Mishra
