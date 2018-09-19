import java.util.Random;

public class Hometask27 {	public static void main(String[] args) {
	
	Random rand = new Random();
	
	int outArrayLength = rand.nextInt(10);
	
	int [][] intArray = new int [outArrayLength][outArrayLength];
	System.out.println("Длина =" + outArrayLength);
	
	for (int i = 0; i <= intArray.length/2; i++) {
		int j=0;
		for (j = j+i; j < intArray.length-i; j++) {
			intArray[i][j] = 1;
		}
	}
	for (int i = intArray.length/2; i <= intArray.length-1; i++) {
		int j=0;
		for (j = intArray.length-1-i; j<=i ; j++) {
			intArray[i][j] = 1;
		}
	}
	System.out.println("Array initialized");
	
	for (int i = 0; i < intArray.length; i++) {
		for ( int j = 0; j < intArray.length; j++) {
			System.out.print(intArray[i][j] + "  ");
		}
		System.out.println();
	}
}

}
