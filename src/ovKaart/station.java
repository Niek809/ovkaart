package ovKaart;

public class station {

	String naam;
	double x;
	double y;

	public double afstandUitrekenen(station tweedeStation) {
		double A = this.x * tweedeStation.x;
		double B = this.y * tweedeStation.y;
		
		return Math.sqrt(A + B);
	}
	
	public double reisKosten(station tweedeStation) {
        double afstand = afstandUitrekenen(tweedeStation);
		return afstand;
	}
	
}
