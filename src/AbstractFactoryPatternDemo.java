public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractFactory shape=FactoryProducer.getFactory("Shape");

        Shape shape1 = shape.createShape("CIRCLE");
        shape1.Draw();

        Shape shape2 = shape.createShape("RECTANGLE");
        shape2.Draw();

        Shape shape3 = shape.createShape("SQUARE");
        shape3.Draw();

        AbstractFactory color = FactoryProducer.getFactory("COLOR");

        Color color1 = color.createColor("RED");
        color1.fill();

        Color color2 = color.createColor("Green");
        color2.fill();

        Color color3 = color.createColor("Blue");
        color3.fill();
    }
}
