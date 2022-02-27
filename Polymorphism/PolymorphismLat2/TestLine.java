
package PolymorphismLat2;

public class TestLine {
    public static void main(String[] args){
        Line a = new Line(3,8,7,7);
        Line b = new Line (1,1,11,3);
        
        System.out.println("Panjang Garis A : " + a.getLength());
        System.out.println("Panjang Garis B : " + b.getLength());
        
        System.out.println("\nGaris A  > Garis B ----> " + a.isGreater(a, b) );
        System.out.println("Garis A  < Garis B ----> " + a.isLess(a, b));
        System.out.println("Garis A == Garis B ----> " + a.isEqual(a, b));
        
        System.out.println("\nGaris B  < Garis A ----> " + b.isGreater(a, b));
        System.out.println("Garis B  > Garis A ----> " + b.isLess(a, b));
        System.out.println("Garis B == Garis A ----> " + b.isEqual(a, b));
        
    }
}

