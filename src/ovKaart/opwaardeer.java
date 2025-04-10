package ovKaart;

import java.util.Scanner;

public class opwaardeer {
	
	Scanner sc = new Scanner(System.in);
	private ovkaart kaart;
	
	public void opwaardeerPaalMet(ovkaart kaart) {
		double opwaarderen = sc.nextDouble();
		kaart.setsaldo(kaart.getSaldo() + opwaarderen);
		System.out.println(kaart.getSaldo());
	}
	
	public void opwaardeerPaalTot(ovkaart kaart) {
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
