package Model;

public class Model implements Icondensation {
	
	
	String valeur;
	boolean condensation;


	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) 
	{
		this.valeur = valeur;
		System.out.println(valeur);
	}
	public  void Condensation()
	{
		int ACond=10;
		if (ACond <= 25)
		{
			this.condensation = false;
		}
	
		else 
		{
			this.condensation = true;
		}
	
	}

	
	@Override
	public boolean getCondensation() {
		return condensation;
	}

	

}
