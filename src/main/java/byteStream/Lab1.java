package byteStream;

public class Lab1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(c);
        redCircle.draw();
        
        System.out.println("===============");
        
        Rectangle r = new Rectangle();
        RedShapeDecorator redRect = new RedShapeDecorator(r);
        redRect.draw();
    }
}
