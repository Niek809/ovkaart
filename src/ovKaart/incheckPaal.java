package ovKaart;

public class incheckPaal {

    private ovkaart kaart;
    private double reiskosten = 0.0;
    private static final double startTarief = 4.20;
    private static final double reisKosten = 0.50; 	
    
    public incheckPaal(ovkaart kaart) {
        this.kaart = kaart;
    }

    public boolean inchecken() {
        if (kaart.getSaldo() >= startTarief) {
            System.out.println("Ingecheckt.");
            kaart.afschrijven(startTarief);
        } else {
            System.out.println("Niet genoeg saldo om in te checken.");
            return false;
        }
        return true;
    }

    public void uitchecken() {
        double kosten = reiskosten * reisKosten;
        if (kaart.getSaldo() >= kosten) {
            kaart.afschrijven(kosten);
            kaart.bijschrijven(startTarief);
            System.out.println("Uitgecheckt.");
            System.out.println(kosten + " afgeschreven.");
        } 
    }

    public void toonSaldo() {
        System.out.println("Saldo: " + kaart.getSaldo());
    }

    public void setAfstand(double afstand) {
        this.reiskosten = afstand;
    }
}