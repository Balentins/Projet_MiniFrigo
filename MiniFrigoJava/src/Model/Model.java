package Model;

public class Model {
	
	String condensation;
	
	
	public String getCondensation() {
		return condensation;
	}

	public void setCondensation(String condensation) {
		this.condensation = condensation;
	}
	
	public  void Condensation()
    {
        int ACond=10;
        if (ACond <= 25)
        {
            this.condensation = "0";
        }

        else 
        {
            this.condensation = "1";
        }

    }

}
