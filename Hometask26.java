import java.util.Random;

public class Hometask26 {
	public static void main(String[] args) {
		int b = getRandomX();
		System.out.println("����� ������� " + b);
			System.out.print("������ ");
			
			int [] array = new int [b];
			for (int i=0; i<array.length; i++){

				array [i] = getRandomX();
				
				System.out.print(array[i] + " ");}
			
			System.out.println( );
			int max= array[0];
			int min= array[0];
		
			int pozmax = 0;
			int pozmin = 0;
			
			for (int i=0; i<array.length; i++){
				if (array[i]>max) {max = array[i];
				pozmax = i;
				}
				
				else if (array[i]<min) {min = array[i];
				pozmin = i;}
				
				
			}
			for (int i=0; i<array.length; i++){
				if ((pozmax>pozmin)&(array[i]==max)) {max = array[i];
				pozmax = i;
				}
			}
			for (int i=0; i<array.length; i++){
			if ((pozmax<pozmin)&(array[i]==min)) {min = array[i];
			pozmin = i;
			}}
			System.out.println(max);
			System.out.println(min);
			System.out.println( "������������ " + max + " �� ������� " + pozmax + ", ����������� " + min + " �� ������� " + pozmin);
			
		int sum = 0;
		int sum1 = 0;
		if (pozmax<pozmin){
		for (int i=pozmax; i<=pozmin; i++)
		sum = sum + array[i];
		System.out.println("�����=" + sum);}
		
		if (pozmax>pozmin)	{
			for (int i=pozmin; i<=pozmax; i++)
			sum1 = sum1 + array[i];
			System.out.println("�����=" + sum1);}
		}	
	
			private static int getRandomX() {
				Random rand = new Random();
				return rand.nextInt(10)+1;

		
		
		
	}
}
