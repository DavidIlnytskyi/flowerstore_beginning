package flower;

public class Main {
    public static void main(String[] args) {
        Flower flower = new Flower();
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        System.out.println(flower.getColor());;
    }
}