import java.util.Objects;

public class Rectangle extends Shape{
    private int sideA = 0, sideB = 0;

    public Rectangle(){

    }

    public Rectangle(int sideB, int sideA) {
        this.sideB = sideB;
        this.sideA = sideA;
    }

    public Rectangle(String color, int sideB, int sideA) {
        super(color);
        this.sideB = sideB;
        this.sideA = sideA;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.printf("Side A %d Side B %d",sideA,sideB);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return sideA == rectangle.sideA && sideB == rectangle.sideB
                && Objects.equals(this.getColor(), rectangle.getColor());
    }
}
