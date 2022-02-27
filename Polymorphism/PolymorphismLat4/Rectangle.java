
package PolymorphismLat4;

public class Rectangle extends Shape{
    //Private member variables
    private int lenght;
    private int width;
    //constructor
    public Rectangle(String color, int lenght, int width){
        super(color);
        this.lenght = lenght;
        this.width = width;
    }
    @Override
    public String toString(){
        return "Rectangle [lenght = " + lenght + ", width = " + width + ", " +super.toString()+ "]";
    }
    //override the inherited getArea() to provide the proper implementation
    @Override
    public double getArea(){
        return lenght*width;
    }
}
