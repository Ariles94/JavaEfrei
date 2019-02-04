package racineException;
import java.util.*;

public class UtiliseRacine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.println("Saisir le nombre dont on cherche la racine");
			int value = sc.nextInt();
			
			Racine extracteur = new Racine(0.01);
			
			double operande= (Double.valueOf(value)).doubleValue();
			
			double valeurRacine;
			
			valeurRacine=extracteur.racine(operande); 
			
			System.out.println(valeurRacine);
			System.out.println("precision "+extracteur.getPrecision() + " , erreur =" + (valeurRacine-Math.sqrt(operande)));
			extracteur.setPrecision(0.00001); 
			
			valeurRacine=extracteur.racine(operande); 
			System.out.println(valeurRacine);
			System.out.println("precision "+extracteur.getPrecision() + " , erreur =" + (valeurRacine-Math.sqrt(operande)));
		}
		catch(NombreNegatifException e)
		{
				
		}
		catch(InputMismatchException ie)
		{
			System.out.println("Vous n'avez pas saisie un nombre !");
		}
	}

}
