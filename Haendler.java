package ab7;

public class Haendler {

	double preis;
	int anzahl;
	double einnamen;
	
	
	public Haendler (double preis) {
		this.preis=preis;
	}


	public void kaufen(int anzahl) {
		this.anzahl=anzahl;
		
	}

	
	
	
	
	public double liefereEinnahmen() {
		einnamen=anzahl*preis;
		return einnamen;
	}
	

}
