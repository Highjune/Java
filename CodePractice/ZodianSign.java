import java.util.Scanner;
import java.util.Calendar;

public class Today_Test_0108_Teacher {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Calendar now = Calendar.getInstance();
		int current_year = now.get(Calendar.YEAR);
		
		System.out.print("¿Ã∏ß : "); String name = scan.next();
		System.out.print("√‚ª˝≥‚µµ : "); int born_year = scan.nextInt();
		System.out.printf("%s(%dºº)¥‘!", name, (current_year-born_year +1));
		switch(born_year%12) {
		case 0 : System.out.println("ø¯º˛¿Ã∂Ï¿‘¥œ¥Ÿ."); break;
		case 1 : System.out.println("¥ﬂ∂Ï¿‘¥œ¥Ÿ."); break;
		case 2 : System.out.println("∞≥∂Ï¿‘¥œ¥Ÿ."); break;
		case 3 : System.out.println("µ≈¡ˆ∂Ï¿‘¥œ¥Ÿ."); break;
		case 4 : System.out.println("¡„∂Ï¿‘¥œ¥Ÿ."); break;
		case 5 : System.out.println("º“∂Ï¿‘¥œ¥Ÿ."); break;
		case 6 : System.out.println("π¸∂Ï¿‘¥œ¥Ÿ."); break;
		case 7 : System.out.println("≈‰≥¢∂Ï¿‘¥œ¥Ÿ."); break;
		case 8 : System.out.println("øÎ∂Ï¿‘¥œ¥Ÿ."); break;
		case 9 : System.out.println("πÏ∂Ï¿‘¥œ¥Ÿ."); break;
		case 10 : System.out.println("∏ª∂Ï¿‘¥œ¥Ÿ."); break;
		default : System.out.println("æÁ∂Ï¿‘¥œ¥Ÿ."); break;
		
		
		}
	}

}
