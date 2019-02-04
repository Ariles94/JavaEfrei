import java.util.Scanner;

/**
 * 
 * @author arileshadjal
 *
 */
public class Calc {
	
	/**Main function of the class
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner;
		int value1, value2, value;
		scanner = new Scanner(System.in);
		
		System.out.println("Saisir le premier entier ?");
		value1 = scanner.nextInt();
		
		System.out.println("Saisir le premier entier ?");
		value2 = scanner.nextInt();
		
		
		System.out.println("Somme " +(value1 + value2));
		System.out.println("Soustraction " +(value1 - value2));
		System.out.println("Multiplication " +(value1 * value2));
		System.out.println("Quotient "+(value1 / value2));
		System.out.println("Reste " +(value1 % value2));

	}
}
