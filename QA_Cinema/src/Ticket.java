public abstract class Ticket {

    private int price;

    protected final int getPrice() {
        return price;
    }

    public Ticket(int price) {
        this.price = price;
    }
}

