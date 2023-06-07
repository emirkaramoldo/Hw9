import java.util.Currency;

public class Price {
    private int price;
    private String currency;

    public Price(int price, String currency) {
        this.price = price;
        this.currency = currency;
    }

    public int getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}
