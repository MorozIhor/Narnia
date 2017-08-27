package Array;

import java.util.Arrays;

public class WorkWithArrays {

	public static void main(String[] args) {
		int [] array = {1, 3, 5, 7, 9, 0, 2, 4, 6, 8, 10};
		
		for(int i=0; i < array.length; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(array);
		for(int i=0; i < array.length; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		for(int i = array.length-1; i >= 0; i--){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		Arrays.fill(array, 13);
		for(int i=0; i < array.length; i++){
			System.out.print(array[i]+" ");
		}
		

	}

}
