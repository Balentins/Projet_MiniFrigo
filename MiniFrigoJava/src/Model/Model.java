package Model;

public class Model {
	
	String condensation;
	String temperature;
	
	public String getTemperature() {
		return temperature;
	}


	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}


	public Model ()
	{
		Condensation();
		Temperature();
	}
	
	
	public String getCondensation() {
		return condensation;
	}

	public void setCondensation(String condensation) {
		this.condensation = condensation;
	}
	
	public  void Condensation()
    {
        int ACond=30;
        if (ACond <= 25)
        {
            this.condensation = "0";
        }

        else 
        {
            this.condensation = "1";
        }

    }
	
	public  void Temperature()
    {
        int ATemp=30;
        if (ATemp <= 25)
        {
            this.temperature = "0";
        }

        else 
        {
            this.temperature = "1";
        }

    }

}
