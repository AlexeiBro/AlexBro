import java.util.Random;
public class Hometask25 {
	public static void main(String[] args) {
		int b = getRandomX();
		System.out.println("����� ������� " + b);
			System.out.print("������ ");
			
			int [] array = new int [b];
			int c=array.length;
			for (int i=0; i<array.length; i++){

				array [i] = getRandomX();
				
				System.out.print(array[i] + " ");
			}
			System.out.println(" ");
			System.out.print("������������ ������ ");
			
				
				
			
			while (c-1>=0) {
				
				System.out.print(array[c-1] + " ");
				c--;}
			
			}
		
		
			private static int getRandomX() {
				Random rand = new Random();
				return rand.nextInt(10)+1;

	
	
	
}
}

	