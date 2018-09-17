import java.util.Random;
public class Hometask4 {
	public static void main(String[] args){

			int x = getRandomX();
			
			System.out.println("X: " + x);
			int a = x - (x/10*10);
			if (a==1)
			System.out.println(x + "рубль");
			if (a==2 || a==3 || a==4 && x!=12 && x!=13 && x!=14   )
			System.out.println(x + "рубля");
			if (x == 12 || x == 13 || x ==14 || a==5 || a==6 || a==0 ||  a==7 || a==8 || a==9)
			System.out.println(x + " рублей");
			
		}
	 
		
		private static int getRandomX() {
			Random rand = new Random();
			return rand.nextInt(9999);
		}
}