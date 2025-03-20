package ovKaart;

public class inchecken {
    public static void main(String[] args) {
        ovkaart mijnKaart = new ovkaart(5.00);
        incheckPaal incheckPaal = new incheckPaal();
		incheckPaal.inchecken();
    }
}