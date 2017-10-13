public class Ticket {

    private int price;

    protected final int getPrice() {
        return price;
    }

    public Ticket() {
        this.price = 8;
    }

    public Ticket(int price) {
        this.price = price;
    }
}

