package ovKaart;

public class incheckPaal {

	private ovkaart kaart;
	private static final double startTarief = 2.00;
	
	public incheckPaal(ovkaart kaart) {
        this.kaart = kaart;
    }

	public void inchecken() {
        if (kaart.getSaldo() >= startTarief) {
            kaart.afschrijven(startTarief);
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
}