public class Hometask22 {
		public static void main(String[] args){

				int x = 5;
				int n = 0;
				
				for (int i=2; i<x; i++) {
					if (x%i == 0) 
						n++;	

			}
		if (n==0)
				 System.out.println("Число " + x + " простое");	
				else System.out.println("Число " + x + " сложное");	
		}}
