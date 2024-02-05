package lucautzeri.u2s1g1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Drink extends MenuList{
    private double quantity;

    public Drink(){}

    public Drink(String name, int calories, double price, double quantity) {
        super(name, calories, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "quantity=" + quantity +
                '}';
    }
}
