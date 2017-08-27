package Array;

public class MyArray {

	public static void main(String[] args) {
		
		int [] array = new int[10];
		
		for(int i=0; i < array.length; i++){
			array[i] = (int) Math.round(Math.random()*100);
		}
		
		for(int i=0; i < array.length; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("-----------");
		max(array);
		System.out.println();
		min(array);
		System.out.println();
		pairedAndUnpaired(array);

	}
	
	public static void max(int [] ar){
		int maxAr = 0;
		for(int i=0; i < ar.length; i++){
			if(ar[i] > maxAr){
				maxAr = ar[i];
			}
		}
		System.out.println("Max element of the array = " + maxAr);
	}
	
	static void min(int [] ar){
		int minAr = ar[0];
		for(int i=0; i < ar.length; i++){
			if(ar[i] < minAr){
				minAr = ar[i];
			}
		}
		System.out.println("Min element of the array = " + minAr);
	}
	
	static void pairedAndUnpaired(int [] ar){
		int p = 0;
		int unp = 0;
		for(int i=0; i < ar.length; i++){
			if(ar[i]%2==0){
				p++;
			}else if(ar[i]%2!=0){
				unp++;
			}
		}
		System.out.println(p+" paired and "+ unp + " unpaired elements");
		
	}

}
