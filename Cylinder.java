
package classes;


public class Cylinder extends Circle{
    private double height;
    
    
    public Cylinder(){
        this.height = 1.0;
    }
    
    public Cylinder(double height){
        this.height = height;
    }
    
    public Cylinder(double height,double radius){
        super(radius);
        this.height = height;
    }
    
    public Cylinder(double height,double radius,String color){
        super(radius,color);
        this.height = height;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double getVolume(){
        return this.getRadius()*this.height;
    }
    
    public String toString(){
        return super.toString()+"Height: "+this.height+"Volume: "+this.getVolume();
    }
    
}
