package stackQueExam;

import java.util.ArrayList;

public class StackList {

	public static void main(String[] args) {
		
		ListStack ls = new ListStack();
		System.out.println(ls.pop());
		ls.push(1);
		ls.push(2);
		ls.push(3);
		ls.push(4);
		ls.push(5);
		ls.allPrint();
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		ls.allPrint();
		System.out.println(ls.peek());
		ls.allPrint();
		ls.clear();
		ls.allPrint();
	}
}

interface ListStackInterface{
	
	int pop();
	int peek();
	void push(int value);
	void clear();
	void allPrint();
}

class ListStack implements ListStackInterface{
	
	ArrayList<Integer> numList = new ArrayList<Integer>();
	
	public ListStack() {
	}
	
	public int pop() {
		int listSize = this.numList.size();
		if(listSize == 0) {
			System.out.println("stack no data");
			return 0;
		}
		else {
			int value = this.numList.get(listSize-1);
			this.numList.remove(listSize-1);
			return value;
		}
	}
	public int peek() {
		int listSize = this.numList.size();
		if(listSize == 0) {
			System.out.println("stack no data");
			return 0;
		}
		else {
			return this.numList.get(listSize-1);
		}
	}
	public void push(int value) {
		this.numList.add(value);
	}
	public void clear() {
		for (int i = this.numList.size()-1; i >= 0; i--) {
			this.numList.remove(i);
		}
	}
	public void allPrint() {
		int listSize = this.numList.size();
		System.out.println("사이즈" + listSize);
		if(listSize == 0) {
			System.out.println("stack no data");
		}
		else {
			for (Integer element : numList) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
}