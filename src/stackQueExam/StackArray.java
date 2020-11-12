package stackQueExam;


public class StackArray {

	public static void main(String[] args) {
		
		ArrayStack as = new ArrayStack(20);
		
		as.pop();
		
		as.push(11);
		as.push(12);
		as.push(13);
		as.push(14);
		as.push(15);
		
		as.allPrint();
		as.pop();
		as.pop();
		as.allPrint();
		as.peek();
		as.allPrint();
		
		as.clear();
		as.allPrint();
		
	}
	
}
interface ArrayStackInterface{
	
	int pop(); // 데이터 추출, 삭제
	int peek(); // 데이터만 추출
	boolean isEmpty(); // 데이터 빈 상태인지 확인
	boolean isFull(); //데이터가 꽉 찬 상태인지 확인
	void push(int value); // 데이터 저장
	void clear(); // 데이터 전체 삭제
	void allPrint(); // 모든 데이터 출력
	
}

class ArrayStack implements ArrayStackInterface{
	
	int[] number;
	int top;
	
	// 스택크기를 설정안하면 10으로 지정
	public ArrayStack() {
		this(10);
	}
	public ArrayStack(int stackSize) {
		this.top = -1;
		this.number = new int[stackSize];
	}
	
	public boolean isEmpty() {
		return (this.top == -1);
	}
	public boolean isFull() {
		return (number.length-1 == top);
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack no data");
			return 0;
		}
		else {
			int value = number[this.top];
			number[this.top--] = 0;
			System.out.println("스택에서 pop한 데이터" + value);
			return value;
		}
			 
	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack no data");
			return 0;
		}
		else {
			int value = number[this.top];
			System.out.println("스택에서 peek한 데이터" + value);
			return value;
		}
	}
	public void push(int value) {
		if(isFull()) {
			System.out.println("stack is full");
		}
		else {
			number[++this.top] = value;
		}
	}
	public void clear() {
		if(isEmpty()) {
			System.out.println("stack already is empty");
		}
		else {
			System.out.println("배열초기화");
			for (int i = 0; i < number.length; i++) {
				number[i] = 0;
			}
			
		}
	}
	public void allPrint() {
		if(isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			for (int element : number) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
	}
	
}