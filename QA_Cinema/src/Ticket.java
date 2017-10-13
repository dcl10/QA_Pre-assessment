public class Ticket {

    private int price;

    protected final int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    public Ticket() {}

    public Ticket(int price) {
        this.price = price;
    }
}

