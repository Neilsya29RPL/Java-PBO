
package PolymorphismLat4;

public class Triangle extends Shape{
    //private member variables
    private int base;
    private int height;
    //constructor
    public Triangle (String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }
    @Override
    public String toString(){
        return "Tringle [base = " + base + ", Height = " + height + ", " + super.toString() + "]";
    }
    //Override the inherited getArea()
    @Override
    public double getArea(){
        return 0.5*base*height;
    }
}
