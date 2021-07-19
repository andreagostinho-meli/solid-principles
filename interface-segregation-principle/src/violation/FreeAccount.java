package violation;

public class FreeAccount implements Account {

    @Override
    public void deposit() {
    }

    @Override
    public void withdraw() {
    }

    // it's a free account, no need to charge fee
    @Override
    public void chargeFee() {
    }
}
