class ColorFactory extends AbstractFactory{
    @Override
    public Color createColor(String color) {
        if(color.equalsIgnoreCase("Red")){
            return new Red();
        }else if(color.equalsIgnoreCase("Green")){
            return new Green();
        }else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape createShape(String shape){
        return null;
    }
}
