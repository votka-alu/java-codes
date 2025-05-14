
package geometricobject;


public class Rectangle extends GeometricObject{
    private double width;
    private double height;
    
    public Rectangle(){
        this.width = 0;
        this.height = 0;
    }
     
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getPerimeter(){
        return 2*(this.width+this.width);
    }
    
    public double getDiameter(){
        return Math.sqrt(this.height*this.height)+(this.width*this.width);
    }
    
    public double getArea(){
        return this.width*this.height;
    }
    
    public void printRectangle(){
        System.out.println(super.toString()+" ,Width of Ractangle is: "+this.getWidth()+" ,height is :"+this.getHeight()+" ,diameter is : "+this.getDiameter()+", the perimeter is :"+this.getPerimeter()+" and area is :"+this.getArea());
    }
}
