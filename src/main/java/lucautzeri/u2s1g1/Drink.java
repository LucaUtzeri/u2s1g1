package lucautzeri.u2s1g1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Drink extends MenuList {
    private String name;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
