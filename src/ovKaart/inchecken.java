package ovKaart;

public class inchecken {
    public static void main(String[] args) {
    	  ovkaart mijnKaart = new ovkaart(13.00);
          incheckPaal incheckPaal = new incheckPaal(mijnKaart);
          incheckPaal.inchecken();
          incheckPaal.toonSaldo();
          incheckPaal.afgeschreven();
    }
}


      
