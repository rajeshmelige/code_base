package data_structures;

public class MyLinkedList {
	Node head;
	public static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		insert(list,0);
		insert(list,1);
		insert(list,2);
		insert(list,3);
		insert(list,4);
		insert(list,5);
		insert(list,6);
		insert(list,7);
		insert(list,8);
		
		int value = get(list,4);
		System.out.println(value);
		
		printList(list);
	}

	private static int get(MyLinkedList list, int i) {
		Node current = list.head;
		int n = 0;
		
		while(n < i) {
			current = current.next;
			n++;
		}
		return current.data;
	}

	private static void printList(MyLinkedList list) {
		Node last = list.head;
		while(last != null) {
			System.out.println(last.data);
			last = last.next;
		}
	}

	private static void insert(MyLinkedList list, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if(list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}
}
