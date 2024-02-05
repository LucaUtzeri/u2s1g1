package lucautzeri.u2s1g1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class MenuList {
    private String name;
    private int calories;
    private double price;

    public MenuList(){}

    public MenuList(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String toString() {
        return "MenuList{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                '}';
    }
}
