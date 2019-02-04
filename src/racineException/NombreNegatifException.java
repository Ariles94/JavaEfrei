package racineException;

public class NombreNegatifException extends Exception
{
	/**
	 * Gere les nombres négatifs
	 */
	public NombreNegatifException()
	{
		System.out.println("Impossible de faire la racine carrée d'un nombre négatif !");
	}
}
