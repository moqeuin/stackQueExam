package stackQueExam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueClass {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		Queue<Integer> qe = new LinkedList<Integer>();
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		qe.offer(5);
		qe.offer(6);
		qe.offer(7);
		qe.offer(8);
		
		System.out.println(" = stack = ");
		while(!st.empty()) {
			System.out.print(st.pop() + " ");
		}
		System.out.println();
		System.out.println(" = que = ");
		while(!qe.isEmpty()) {
			System.out.print(qe.poll() + " ");
		}
	}

}
