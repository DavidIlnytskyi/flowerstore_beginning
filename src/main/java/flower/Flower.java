package flower;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Flower{
    private int price;
    FlowerColor color;
    public String getColor(){
        return color.getColor();
    }
}