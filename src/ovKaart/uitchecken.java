package ovKaart;

public class uitchecken {
    public static void main(String[] args) {
  	  ovkaart mijnKaart = new ovkaart(12.00);
        incheckPaal incheckPaal = new incheckPaal(mijnKaart);
        incheckPaal.inchecken();
        incheckPaal.uitchecken();
        incheckPaal.toonSaldo();
        incheckPaal.afgeschrevenSaldo();
  }
}

