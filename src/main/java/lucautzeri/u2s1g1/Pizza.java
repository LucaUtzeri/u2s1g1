package lucautzeri.u2s1g1;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pizza extends MenuList {
    private List<Topping> topping;

    public Pizza(){}

    public Pizza(String name, int calories, double price, List<Topping> topping) {
        super(name, calories, price);
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "topping=" + topping +
                '}';
    }
}
