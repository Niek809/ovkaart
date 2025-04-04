package ovKaart;

public class main {
    public static void main(String[] args) {
        ovkaart mijnKaart = new ovkaart(4.20);
        incheckPaal incheckPaal = new incheckPaal(mijnKaart);

        station nijmegenCentraal = new station("Nijmegen Centraal", 12, 34);  
        station nijmegenHeyendaal = new station("Nijmegen Heyendaal", 17, 21); 

        double afstand = nijmegenHeyendaal.afstandUitrekenen(nijmegenCentraal);
        double kosten = afstand * 0.50; 
        
        incheckPaal.setAfstand(kosten);  
        if (incheckPaal.inchecken()) {
        	incheckPaal.uitchecken(); 
            incheckPaal.toonSaldo(); 
        }
    }
}