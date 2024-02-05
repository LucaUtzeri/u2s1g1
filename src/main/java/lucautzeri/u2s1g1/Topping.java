package lucautzeri.u2s1g1;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter

public class Topping extends MenuList{
    private List<Topping> toppings;

    public Topping(){}

    public Topping(String name, int calories, double price, List<Topping> toppings) {
        super(name, calories, price);
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "toppings=" + toppings +
                '}';
    }
}
