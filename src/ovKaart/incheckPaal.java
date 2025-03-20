package ovKaart;

public class incheckPaal {

	private double saldo;
	private boolean ingecheckt;
	private static final double START_TARIEF = 2.50;

	public void ovkaart (double saldo) {
		this.saldo = saldo;
		this.ingecheckt = false;
	}

	public void inchecken() {
		if (!ingecheckt && saldo >= START_TARIEF) {
			saldo -= START_TARIEF;
			ingecheckt = true;
			System.out.println("Ingecheckt. " + START_TARIEF + " afgeschreven.");
		}
	}

		public void toonSaldo() {
			System.out.println("Saldo: " + saldo);
	}

		public boolean isIngecheckt() {
		return false;
	}
}