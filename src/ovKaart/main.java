package ovKaart;

public class main {
    public  main(String[] args) {
  	  ovkaart mijnKaart = new ovkaart(50.30);
        incheckPaal incheckPaal = new incheckPaal(mijnKaart);
        incheckPaal.inchecken();
        incheckPaal.uitchecken();
        incheckPaal.toonSaldo();
  }
}

