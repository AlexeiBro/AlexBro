public class Hometask6 {
	public static void main(String[] args) {

			int x = 2234;
			int a = x/1000;
			int b = (x - a*1000)/100;
			int c = (x - a*1000 - b*100)/10;
			int d = x - a*1000 - b*100 - c*10;
			
			
			if(a!= b && a!= c && a!=d && b != c && b!=d && c!=d) 
				System.out.println("Все цифры различные");
				else System.out.println("Есть повторяющиеся цифры");}
			
		}
		