import java.util.Random;
public class Homeworktask2 {
	public static void main(String[] args){

			int x = getRandomX();
			
			System.out.println("X: " + x);
			
			if(x > 99 && x < 1000) 
				System.out.println("Число трехзначное");
				else System.out.println("Число не является трехзначным");
			if((x-(x/10*10)) == 7) 
				System.out.println("На конце семерка");
				else System.out.println("На конце не семерка");
			
			if(x%2 == 0) 
				System.out.println("Число является четным");
				else System.out.println("Число является нечетным");
			
		}
	
		private static int getRandomX() {
			Random rand = new Random();
			return rand.nextInt(9999);
		}}
	