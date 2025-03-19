package ovKaart;

public class ovkaart {
    private double saldo;
    private boolean ingecheckt;

    public ovkaart(double saldo) {
        this.saldo = saldo;
        this.ingecheckt = false;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isIngecheckt() {
        return ingecheckt;
    }

    public boolean inchecken(double instaptarief) {
        if (saldo >= instaptarief) {
            saldo -= instaptarief;
            ingecheckt = true;
            return true;
        } else {
            return false;
        }
    }

    public void toonSaldo() {
        System.out.printf("Huidig saldo: "+ saldo);
    }
}