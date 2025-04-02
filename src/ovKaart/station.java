package ovKaart;

public class station {
    
    String naam;
    double x;
    double y;

    public station(String naam, double x, double y) {
        this.naam = naam;
        this.x = x;
        this.y = y;
    }

    public double afstandUitrekenen(station tweedeStation) {
        double dx = this.x - tweedeStation.x;
        double dy = this.y - tweedeStation.y;
        return Math.sqrt(dx * dx + dy * dy); 
    }
}