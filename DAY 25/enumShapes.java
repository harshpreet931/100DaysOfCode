public class enumShapes {
    public enum Shape{
        SQUARE,CIRCLE,RECTANGLE,TRIANGLE,HEXAGON
    }

    public static void main(String[] args){
        Shape s1 = Shape.CIRCLE;
        Shape s2 = Shape.TRIANGLE;

        System.out.println("FIRST SHAPE: "+ s1);
        System.out.println("SECOND SHAPE: "+ s2);
    }
}
