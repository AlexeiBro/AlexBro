import java.util.Random;
public class Homeworktask2 {
	public static void main(String[] args){

			int x = getRandomX();
			
			System.out.println("X: " + x);
			
			if(x > 99 && x < 1000) 
				System.out.println("����� �����������");
				else System.out.println("����� �� �������� �����������");
			if((x-(x/10*10)) == 7) 
				System.out.println("�� ����� �������");
				else System.out.println("�� ����� �� �������");
			
			if(x%2 == 0) 
				System.out.println("����� �������� ������");
				else System.out.println("����� �������� ��������");
			
		}
	
		private static int getRandomX() {
			Random rand = new Random();
			return rand.nextInt(9999);
		}}
	