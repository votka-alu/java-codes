
package geometricobject;


public class Circle extends GeometricObject{
    private double radius;
    
    
    public Circle(){
        super();
        this.radius = 0;
    }
    
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    
    public Circle(double radius,String color,boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }
    
    public  double getDiameter(){
        return this.radius*2;
    }
    
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    
    public void printCircle(){
        System.out.println(super.toString()+" , Radius of the circle is: "+this.radius+",Perimeter of circle is: "+this.getPerimeter()+",Diameter of the Circle is: "+this.getDiameter()+",Area of the Circle is: "+this.getArea());
    }
}
