package moyenneException;

public class MoyenneException {

	public static void main(String[] args) {
	
		if(args.length <= 0)
		{
			System.out.println("Il n'y a pas d'arguments");
			System.exit(1);
		}
		
		int moyenne = moyenne(args);
		System.out.println("La moyenne est " + moyenne);

	}
	
	public static int moyenne(String[] args)
	{
		int somme = 0;
		int cpt = 0;
		for(int i = 0; i < args.length; i++)
		{
			try
			{
				somme += Integer.parseInt(args[i]);
				cpt++;
			}
			catch(NumberFormatException e)
			{
				System.out.println(args[i] +" n'est pas un nombre");
			}
		}
		try
		{
			return somme / cpt;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division par zero est impossible");
			return 0;
		}
	}

}
