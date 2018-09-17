import static java.lang.Math.*;
public class Hometask3 {
public static void main(String[] args) {
		
		reshenie(10, 5, 7);
}
		public static void reshenie(int a, int b, int r){
			double f = sqrt(pow(a,2) + pow(b,2));
			if (r >= f) 
				System.out.println("Закрыть можно");
			else System.out.println("Закрыть нельзя");
}}
