public class Hometask5 {
		public static void main(String[] args) {

				int x = 1123;
				int a = x/1000;
				int b = (x - a*1000)/100;
				int c = (x - a*1000 - b*100)/10;
				int d = x - a*1000 - b*100 - c*10;
				int f = d*1000 + c* 100 + b*10 + a;
					System.out.println("Число обратное данному " + f);
			}
			
}
