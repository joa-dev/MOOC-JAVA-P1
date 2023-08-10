
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return squares > compared.squares ? true : false;
    }
    
    public int priceDifference(Apartment compared) {
        int priceAp = princePerSquare * squares ;
        int priceCo = compared.princePerSquare * compared.squares;
        
        return priceAp > priceCo ? priceAp - priceCo : priceCo - priceAp;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        return princePerSquare * squares > compared.princePerSquare * compared.squares ? true : false;
    }
}
