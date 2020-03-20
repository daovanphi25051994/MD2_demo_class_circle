package circledemo;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.5, "red");
        double areaCir1 = circle1.getArea();
        double areaCir2 = circle2.getArea();
        System.out.printf("area cir1 = %.2f ; area cir2 = %.2f", areaCir1, areaCir2);
    }
}
