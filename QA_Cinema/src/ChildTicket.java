public class ChildTicket extends Ticket {

    ChildTicket() {
        super.setPrice(4);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
