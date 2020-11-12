package stackQueExam;

public class QueArray {

	public static void main(String[] args) {
		
		ArrayQue aq = new ArrayQue(20);
		System.out.println(aq.poll());
		aq.offer(1);
		aq.offer(2);
		aq.offer(3);
		aq.offer(4);
		aq.offer(5);
		aq.allPrint();
		
		System.out.println(aq.poll());
		System.out.println(aq.poll());
		System.out.println(aq.poll());
		aq.allPrint();
		System.out.println(aq.peek());
		aq.allPrint();
		aq.offer(6);
		aq.offer(7);
		aq.offer(8);
		aq.allPrint();
		aq.clear();
		aq.allPrint();
		
		
	}

}

interface ArrayQueInterface{
	
	boolean isEmpty(); // 큐가 비었는지 확인
	boolean isFull(); // 큐가 꽉찼는지 확인
	void offer(int value); // 큐에 마지막요소+1에 데이터 삽입
	int poll(); // 큐에 첫 번째 요소 출력
	int peek();
	void clear();
	void allPrint();
}

class ArrayQue implements ArrayQueInterface{
	
	int top;
	int[] number;
	
	public ArrayQue() {
		this(10);
	}
	public ArrayQue(int queSize) {
		top = -1;
		this.number = new int[queSize];
	}
	
	public boolean isEmpty() {
		return ( this.top == -1);
	}
	public boolean isFull() {
		return (this.top == this.number.length-1);
	}
	
	
	public void offer(int value) {
		if(isFull()) {
			System.out.println("que is full");
			return;
		}
		else {
			number[++this.top] = value;
			return;
		}
	}
	public int poll() {
		if(isEmpty()) {
			System.out.println("que is empty");
			return 0;
		}
		else {
			int value = number[0];
			for (int i = 1; i < top + 1; i++) {
				number[i-1] = number[i];
			}
			number[this.top--] = 0;
			return value;
		}
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("que is empty");
			return 0;
		}
		else {
			return number[0];
		}
	}
	public void clear() {
		if(isEmpty()) {
			System.out.println("que is already empty");
			return;
		}
		else {
			for (int i = 0; i < number.length; i++) {
				number[i] = 0;
			}
			return;
		}
	}
	public void allPrint() {
		if(isEmpty()) {
			System.out.println("que is empty");
			return;
		}
		else {
			for (int element : number) {
				System.out.print(element + " ");
			}
			System.out.println();
			return;
		}
	}
	
	
	
	
	
	
}