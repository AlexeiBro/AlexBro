import java.util.Random;
public class Hometask24 {

		public static void main(String[] args){
			System.out.print("������ ������ ");
			int [] array = new int [5];
			for (int i=0; i<array.length; i++){

				array [i] = getRandomX();
				
				System.out.print(array[i] + " ");
			}
			System.out.println("");
			System.out.println("������ ������ " + array[0]);
			System.out.println("��������� ������ " + array[4]);
			int x = array [0];
			int poz = 0;
			for (int i=1; i<array.length; i++){
				
			if (array [i] > x) {
				x = array[i];
				poz = i;
				
			}
			}
		
			System.out.println("���������� ������ " + x);
			System.out.println("������� ���������� ������ " + poz);}
		
			private static int getRandomX() {
				Random rand = new Random();
				return rand.nextInt(10)+1;
}}
