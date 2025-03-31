package ovKaart;

public class incheckPaal {

	private ovkaart kaart;
	private station afstand;
	private static final double startTarief = 4.20;
	
	public incheckPaal(ovkaart kaart) {
        this.kaart = kaart;
    }

	public void inchecken() {
        if (kaart.getSaldo() >= startTarief)	{
            System.out.println("Ingecheckt.");
            kaart.afschrijven(startTarief);
        } else {
            System.out.println("Niet genoeg saldo om in te checken.");
        }
    }
		public void afgeschreven() {
	}

		public void toonSaldo() {
			System.out.println("Saldo: " + kaart.getSaldo());
	}

		public void uitchecken() {
	        if (kaart.getSaldo() >= afstand + startTarief) {
	            kaart.afschrijven(reisKosten);
	            kaart.bijschrijven(startTarief);
	            System.out.println("uitgecheckt.");
	    		System.out.println(reisKosten + " afgeschreven.");
	    		
	        }
	        
	    }
		
}