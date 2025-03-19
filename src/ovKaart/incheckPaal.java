package ovKaart;

public class incheckPaal {
    private static final double INSTAPTARIEF = 2.00;

    public static void inchecken(ovkaart kaart) {
        if (kaart.inchecken(INSTAPTARIEF)) {
            System.out.println("Inchecken gelukt!");
        } else {
            System.out.println("Inchecken mislukt: onvoldoende saldo.");
        }
        kaart.toonSaldo();
    }
}