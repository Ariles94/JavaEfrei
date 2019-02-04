package racineException;

public class Racine {
	
	private double precision;
	
	Racine(double precision) 
	{
		this.precision=precision; 
	}
	
	/**
	 * Permet de determiner la racine d'un nombre
	 * @param operande Le nombre dont on cherche la racine
	 * @return la solution
	 * @throws NombreNegatifException Permet de gérer l'execption d'un nombre négatif
	 */
	double racine(double operande) throws NombreNegatifException
	{
		if(operande<0)
		{
			throw new NombreNegatifException();
		}
		else
		{
		
			double solution, carre, a, b;
			
			a=0;
			b=operande; 
			solution=(a+b)/2; 
			
			while(b-a>precision)
			{
				carre=solution*solution;
				if (carre>operande) b=solution; 
				else a=solution; 
				solution=(a+b)/2;
			}
			return solution;
		}
	}
	
	double getPrecision() 
	{ 
		return precision; 
	}
	void setPrecision(double precision) 
	{
		this.precision=precision; 
	}
}
