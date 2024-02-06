package lucautzeri.u2s1g1;

import lombok.Getter;

@Getter
public abstract class MenuList {

    protected int calories;
    protected double price;

    public MenuList(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

}
