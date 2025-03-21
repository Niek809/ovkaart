package ovKaart;

public class ovkaart {
    private double saldo;

    public ovkaart(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void afschrijven(double bedrag) {
        saldo -= bedrag;
    }
}
