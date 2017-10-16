package Algorithms;

import java.util.Arrays;

public class Main {

	// Sorting Algorithms <-----------------------

	// Bubble sort
	public static void bubbleSort(int[] arr) {

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temporary = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temporary;
				}
			}
		}
	}
	

	// Selection sort
	public static void selectSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int minIndxe = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndxe])
					minIndxe = j;
			}

			int temp = arr[i];
			arr[i] = arr[minIndxe];
			arr[minIndxe] = temp;
		}
	}
	

	// Insertion sort
	public static void insertSort(int[] arr) {
		int j, temp;

		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];

			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}

			arr[j + 1] = temp;
		}
	}
	
	
	//Merge Sort
	
	public static int[] sortMerge(int[] array){
		if(array.length < 2) return array;
		int mid = array.length/2;
		int[] firstArray = Arrays.copyOfRange(array, 0, mid);
		int[] secondArray = Arrays.copyOfRange(array, mid, array.length);
		return merge(sortMerge(firstArray), sortMerge(secondArray));
	}
	
	public static int[] merge(int[] array1, int[] array2){
		int newLength = array1.length + array2.length;
		int[] newArray = new int[newLength];
		int a1 = 0;
		int a2 = 0;
		for(int i = 0; i < newLength; i++){
			if(a1 == array1.length){
				newArray[i] = array2[a2++];
			}else if(a2 == array2.length){
				newArray[i] = array1[a1++];
			}else{
				if(array1[a1] < array2[a2]){
					newArray[i] = array1[a1++];
				}else{
					newArray[i] = array2[a2++];
				}
			}
		}
		return newArray;
	}

	
	// Searching Algorithms <------------------
	
	public static int binarySearch(int array[], int key){
		int low = 0;
		int high = array.length-1;
		
		while(low < high){
			int mid = (low + high)/2;
			
			if(key > array[mid]){
				low = mid + 1;
			}else if(key < array[mid]){
				high = mid -1;
			}else{
				return mid; // індекс числа в масиві
			}
		}
		
		return -1; // число в масиві відсутнє
		
	}


	// Factorial <-----------------------

	public static int factorial(int a) {
		int rez = 1;
		for(int i = 1; i <= a ; i++){
			rez *= i;
		}
		return rez;
	}
	

	public static int factorialRec(int a) {
		if(a == 0) return 1;
		return a * factorialRec(a-1);
	}

	// Fibonacci sequence <---------------
	
	public static int fibonacci(int a){
		if(a == 1 || a == 2){
			return 1;
		}
		
		int first = 1;
		int second = 1;
		int rez = 1;
		
		for(int i = 1; i < a-1; i++){
			rez = first + second;
			first = second;
			second = rez;
		}
		
		return rez;
	}
	
	
	public static int fibonacciRec(int a){
		if(a == 1 || a == 2) return 1;
		return fibonacciRec(a-1) + fibonacciRec(a-2);
	}
	
	
	public static void main(String[] args) {

		int[] array = { 5, 2, 3, 6, 9, 8, 7, 4, 1, 10 };

//		bubbleSort(array);
//		selectSort(array);
//		insertSort(array);
		
//		int [] sortedArray = sortMerge(array);
//		System.out.println(Arrays.toString(sortedArray));

//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
//		System.out.println(binarySearch(array, 3));
		
//		System.out.println(factorial(5));
//		System.out.println(factorialRec(4));
		
//		System.out.println(fibonacci(8));
//		System.out.println(fibonacciRec(8));
		
		
	}

}
