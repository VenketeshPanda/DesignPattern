package Strategy;

public class ClientStrategy {
    public static void main(String[] args) {
        GoogleMaps g = new GoogleMaps();
        g.findPathByMode(TravelMode.AUTO);
    }
}
