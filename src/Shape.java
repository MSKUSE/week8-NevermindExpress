public class Shape {
    private String color = "white";

    public Shape(){

    }
    public Shape(String color) {
        this.color = color;
    }

//    public void describe(int sideA, int sideB){
//        System.out.printf("Side A is %d, Side B is %d\n",sideA,sideB);
//    }
//    public void describe(int sideA){
//        System.out.printf("Side A is %d\n",sideA);
//    }
//    public void describe(double sideA){
//        System.out.printf("Radius is %f\n",sideA);
//    }
    public void describe(){
        System.out.println("This is a Shape and its color is "+color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
