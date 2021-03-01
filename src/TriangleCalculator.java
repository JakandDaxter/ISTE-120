import java.lang.Math;

public class TriangleCalculator {

    double x1 = 0.0;
    double y1 = 0.0;
    double x2 = 0.0;
    double y2 = 0.0;
    double x3 = 0.0;
    double y3 = 0.0;

    public TriangleCalculator(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    //Area
    public double calcArea() {
        double s = calcPerm()/2;
        return Math.round(Math.sqrt(s*(s-calcLenA())*(s-calcLenB())*(s-calcLenC())));
    }

    //Perimeter
    public double calcPerm() {
        return calcLenA()+calcLenB()+calcLenC();
    }

    //length A
    public double calcLenA() {

        double x = (x2-x3);
        double y = (y1-y2);
        double A = Math.pow(2,x); // B
        double B = Math.pow(2,y); // C

        return Math.round(Math.sqrt(A+B));
    }

    //length B
    public double calcLenB() {

        double x = (x3-x1);
        double y = (y2-y1);
        double A = Math.pow(2,x); // A
        double B = Math.pow(2,y); // C

        return Math.round(Math.sqrt(A+B));
    }

    //length C
    public double calcLenC() {

        double x = (x2-x1);
        double y = (y1-y1);
        double A = Math.pow(2,x); // A
        double B = Math.pow(2,y); // B
        return Math.round(Math.sqrt(A+B));
    }

    //Height
    public double calcHeight() {
        return Math.round((calcArea()*2)/calcLenC());
    }

    //Angle A
    public double calcAngleA() {
        double a = Math.toRadians(calcHeight()); // Opposite
        double b = Math.toRadians(calcLenB()); //  Hypotenuse
        return Math.round(Math.sin(calcLenB()/calcHeight()));
    }

    //Angle B
    public double calcAngleB() {
       double a = Math.toRadians(calcLenA()); // Hypotenuse
       double b = Math.toRadians(calcHeight()); // Opposite
       return Math.round(Math.sin(calcHeight()/calcLenA()));
    }

    //Angle C
    public double calcAngleC() {
        double a = Math.toRadians(calcLenA()); // Hypotenuse
        double b = Math.toRadians(calcHeight()); // Adjacent
        return Math.round(Math.cos(calcHeight()/calcLenA()));
    }

    //tostring
    public String tostring() {
        return "\nTriangle with coordinates: A ("+x1+","+y1+"), B ("+x2+","+y1+"), C ("+x3+","+y3+")"
                +
                "\nArea : " +calcArea()
                +
                "\nPerimeter: " +calcPerm()
                +
                "\nLength side a: " +calcLenA()
                +
                "\nLength side b: " +calcLenB()
                +
                "\nLength side c: " +calcLenC()
                +
                "\nHeight h: " +calcHeight()
                +
                "\nAngle A: " +calcAngleA()
                +
                "\nAngle B: " +calcAngleB()
                +
                "\nAngle C: " +calcAngleC();
    }


}
