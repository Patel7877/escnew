package dayone.com;

import java.util.ArrayList;

public class BinaryGapTest {

	public static void main(String[] args) {
//		Solution.solveThis(1);
		
		int count1= Solution.solveThis(1041);
		System.out.println("Max Count of 0 : " + count1);
		
		int count2= Solution.solveThis(10);
		System.out.println("Max Count of 0 : " + count2);
		
		int count3= Solution.solveThis(16);
		System.out.println("Max Count of 0 : " + count3);
		
		int count4= Solution.solveThis(141);
		System.out.println("Max Count of 0 : " + count4);
		
		int count5= Solution.solveThis(1541);
		System.out.println("Max Count of 0 : " + count5);
		
	}
}
class Solution{
	public static int solveThis(int N) {
		String binartyRepre = Integer.toBinaryString(N);//Convert in binary but its return type is in string
		System.out.println( N + " Binary :"+ binartyRepre); //third type function
		int longestGap=0;
		
		//array ylist is dynamic
		ArrayList <Integer> onelist= new ArrayList <Integer> ();
		for(int i=0; i<binartyRepre.length();i++) {
			if(binartyRepre.charAt(i)=='0')
			continue;
			onelist.add(i);
		}
		
		for(int i=0; i<onelist.size()-1; i++) {
			int indicesDifferences= onelist.get(i+1) - onelist.get(i) - 1;
			longestGap= Math.max(longestGap, indicesDifferences);
		}

		return longestGap;
	}
}
