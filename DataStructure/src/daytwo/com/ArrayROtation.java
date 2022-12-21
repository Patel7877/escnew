package daytwo.com;

import java.util.Arrays;

public class ArrayROtation {

	public static void main(String[] args) {
		
		int SA[] = {1,2,3,4};
		int K=3;
		System.out.println(Arrays.toString(SA));
		int rotateArray[] = RotationTest.solution(SA, K);
		System.out.println(Arrays.toString(rotateArray));
		
	
	}
}
class RotationTest{
	public static int[] solution(int sourceArray[] ,int K) 
	{
		int targetArray [] = new int [sourceArray.length];
		
		for(int i=0; i<sourceArray.length; i++) {
			int rotationIndex = (i + K) % sourceArray.length;
			targetArray [rotationIndex] = sourceArray [i] ;
				
		}
		
		return targetArray;
	}
}


/* Pass source array and the rotation Index as K  
 * step 1 :  declare the targetArray as per the length of the souce array
 * step 2 :  iterate thru the source array from 0 to length
 * step 3 :  determine the rotatedIndex as per the formula
 * 				   rotatedIndex = ( i + K ) % sourceArray.length;
 * 			SA									   TA	
 * 			i=0    rotatedIndex = ( 0 + 3 ) % 5; = 3
 * 			i=1    rotatedIndex = ( 1 + 3 ) % 5; = 4
 * 			i=2    rotatedIndex = ( 2 + 3 ) % 5; = 0
 *  		i=3    rotatedIndex = ( 3 + 3 ) % 5; = 1
 *   		i=4    rotatedIndex = ( 4 + 3 ) % 5; = 2
 * 
 * step 4 :  assign the i(th) value of the source array to the
 * 			 rotatedIndex(th) position of the targetArray
 * step 5  : return the targetArray
 * 
 * 
 * 
 */


