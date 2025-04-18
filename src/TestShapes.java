public class TestShapes {
    public static void main(String[] args) {
//        Shape s = new Shape();
//        s.describe();
//        Rectangle r = new Rectangle(3,4);
//        r.describe();
        Rectangle r1 = new Rectangle("blue",4,5);
        Rectangle r2 = new Rectangle("blue",4,5);
        System.out.println(r1.equals(r2));
    }
}