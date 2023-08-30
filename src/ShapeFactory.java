class ShapeFactory extends AbstractFactory{
    @Override
    public Color createColor(String color) {
        return null;
    }

    @Override
    public Shape createShape(String shape){
        if(shape.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(shape.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("square")){
            return new Square();
        }
        return null;
    }
}
