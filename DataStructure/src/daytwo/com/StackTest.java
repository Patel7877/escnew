package daytwo.com;
public class StackTest {
	public static void main(String[] args) 
	{
		MyStack theStack = new MyStack(5);
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		//theStack.push(60);
		System.out.println("\n====> Element of the top : "+theStack.peek());
		System.out.println(theStack.pop());
		System.out.println("\n====> Element of the top : "+theStack.peek());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		System.out.println(theStack.pop());
		//System.out.println(theStack.pop());
	}
}
class MyStackOverflowException extends RuntimeException
{
	MyStackOverflowException(String str) {
		super(str);
	}
}
class MyStackEmptyExcpetion extends RuntimeException
{
	MyStackEmptyExcpetion(String str) {
		super(str);
	}
}
class MyStack
{
	int index=-1;
	int size;
	int array []; //just a reference to int array
	MyStack(int size) {
		System.out.println("MyStack created with "+size+" integers");
		this.size = size;
		array = new int [ size ]; //allocation of the ints 
	}
	void push(int item) {
		System.out.println("pushing "+item+" to the stack..");
		// 10 20 30 40 50 60
		// -1 0  1  2  3  4 
		if(index > size-2 ) { // 5 > 5		
			throw new MyStackOverflowException("Stack size is overflown..."); 
		}
		array [ ++index ] = item;
	}
	int pop() {
		System.out.println("popping item fromn the stack...");
		if(index < 0 ) {
			throw new MyStackEmptyExcpetion("Stack is empty...");
		}
		return array [ index-- ];
	}
	int peek() {
		return array [ index ];
	}	
}






