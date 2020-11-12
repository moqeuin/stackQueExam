package stackQueExam;

import java.util.LinkedList;

public class QueList {

	public static void main(String[] args) {
		
		ListQue lq = new ListQue();
		
		System.out.println(lq.poll());
		lq.offer(1);
		lq.offer(2);
		lq.offer(3);
		lq.offer(4);
		lq.offer(5);
		lq.allPrint();
		System.out.println(lq.poll());
		System.out.println(lq.poll());
		System.out.println(lq.poll());
		lq.allPrint();
		System.out.println(lq.peek());
		lq.allPrint();
		lq.clear();
		lq.allPrint();
	}

}


interface ListQueInterface{
	
	void offer(int value);
	int poll();
	int peek();
	void clear();
	void allPrint();
}

class ListQue implements ListQueInterface{
	
	// 큐는 추가, 삭제시 데이터를 한 칸 이동시켜서 복사하기 때문에 
	// 처리속도를 위해서 linkedList로 저장해서 처리한다.
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	public ListQue() {
		
	}
	
	public void offer(int value) {
		list.add(value);
	}
	public int poll() {
		if(list.size() == 0) {
			System.out.println("que is empty");
			return 0;
		}
		else {
			int value = list.get(0);
			list.remove(0);
			return value;
		}
	}
	public int peek() {
		if(list.size() == 0) {
			System.out.println("que is empty");
			return 0;
		}
		else {
			return list.get(0);
		}
	}
	public void clear() {
		if(this.list.size() == 0) {
			System.out.println("que is already empty");
			return;
		}
		else {
			for (int i = list.size()-1; i >= 0; i--) {
				list.remove(i);
			}
		}
	}
	public void allPrint() {
		if(this.list.size() == 0) {
			System.out.println("que is empty");
			return;
		}
		else {
			for (Integer element : list) {
				System.out.print(element);
			}
		}
		System.out.println();
	}
	
}



















