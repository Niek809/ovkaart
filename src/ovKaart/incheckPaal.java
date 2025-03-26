package ovKaart;

public class incheckPaal {

	private ovkaart kaart;
	private static final double startTarief = 1.50;
	private static final double reisKosten = 5.20;
	
	public incheckPaal(ovkaart kaart) {
        this.kaart = kaart;
    }

	public void inchecken() {
        if (kaart.getSaldo() >= reisKosten + startTarief) {
            System.out.println("Ingecheckt.");
        } else {
            System.out.println("Niet genoeg saldo om in te checken.");
        }
    }
		public void afgeschreven() {
		System.out.println(startTarief + " afgeschreven.");
	}

		public void toonSaldo() {
			System.out.println("Saldo: " + kaart.getSaldo());
	}

		public void uitchecken() {
	        if (kaart.getSaldo() >= reisKosten + startTarief) {
	            kaart.afschrijven(reisKosten + startTarief);
	            System.out.println("uitgecheckt.");
	        } else {
	            System.out.println("Niet genoeg saldo.");
	        }
	    }

		public void afgeschrevenSaldo() {
			System.out.println(startTarief + reisKosten + " afgeschreven.");
		}
	
}