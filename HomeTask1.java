
public class HomeTask1 {

	public static void main (String[] args) {
		
		int i = 15;   // счетчик чисел, N-ое число Фибоначчи
		int a = 0;   // первое число Фибоначчи
		int b = 1;   // второе число Фибоначии
		
		System.out.println("1-е число: " + a);
		System.out.println("2-е число: " + b);
		
		for (int x = 3; x <= i; x++) {
			
			int rez = a + b;
			a = b;
			b = rez;
			System.out.println(x + "-е число: " + rez);
		}
	}
}
	

