package ovKaart;

import java.util.Scanner;

public class opwaardeerMachine {
	
	Scanner sc = new Scanner(System.in);
	private ovkaart kaart;
	
	public void opwaardeerKaartMeegeven (ovkaart kaart) {
		this.kaart = kaart;
	}
	
	public void opwaardeerPaalMet() {
		if (kaart == null) {
			System.out.println("kaart is niet geldig");
		} else {
		double opwaarderen = sc.nextDouble();
		kaart.setsaldo(kaart.getSaldo() + opwaarderen);
		System.out.println(kaart.getSaldo());
		}
	}
	
	public void opwaardeerPaalTot() {
		if (kaart == null) {
			System.out.println("kaart is niet geldig");
			return;
		} else {
		double opwaarderen = sc.nextDouble();
		double opwaardeerVerschil = opwaarderen - kaart.getSaldo();
		if (opwaardeerVerschil >= 0) {
			kaart.setsaldo(kaart.getSaldo() + opwaardeerVerschil);
			System.out.println(kaart.getSaldo());
		} else {
			System.out.println("Dat kan helaas niet want u heeft een lagere saldo dan dat u tot wil opwaarderen.");
		}
		}
		
	}
	
		public void opwaardeerKaartVergeten() {
		this.kaart = null;
		}

}
