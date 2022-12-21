package daytwo.com;
public class QueueTest {
	public static void main(String[] args) {
		
		MyQueue que = new MyQueue(5);
		que.add(10); //0
		que.add(20); //1
		que.add(30); // 2
		que.add(40);
		que.add(50);
		que.add(60);
		
		System.out.println(que.remove()); // 5 - 2 - 1 
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.remove());
		
		//System.out.println(que.remove());
	}
}
//           index
//             |   
// 0  1  2  3  4 
// 10 20 30 40 50
// F            R            
class MyQueue {
	
	int front=-1;
	int index=-1;int length;int array[]; //just a reference
	
	MyQueue(int length) {
		this.length = length;
		array = new int [ length ];
	}
	void add(int item) {
		if(index > length-2) {
			throw new RuntimeException("Queue is full...");
		}
		array [ ++index ] = item;
		System.out.println("added "+item+" at index "+index);
	}
	int  remove() {	
		if(front > index-1 ) {
			throw new RuntimeException("Rear reached...");
		}
		return array [  ++front ];
				//        5  -     0       -1
	}
}








