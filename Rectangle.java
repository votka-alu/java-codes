
package inheritance_task2;
import java.lang.Math;

public class Rectangle extends GeomtricObj {
    private double width;
    private double height;
    
    public Rectangle(){
        //super();
        //this.width=0;
        //this.height=0;
        this(0,0,"n",false);
    }
    
    public Rectangle(double width,double height){
        //super();
        //this.width=0;
        //this.height=0;
        this(width,height,"null",false);
    }
    public Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.height=height;
    }
    
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public void getHeight(double height){
        this.height=height;
    }
    
    public double getPerimeter(){
        return 2*(this.width+this.height);
    }
    public double getDiameter(){
        return Math.sqrt((this.height*this.height)+(this.width*this.width));
    }
    public double getArea(){
        return this.width*this.height;
    } 
    
    public void printRectangle(){
        System.out.println(super.toString()+" ,the object is a rectangle whose width is : "+this.getWidth()+" ,height is :"+this.getHeight()+" ,diameter is : "+this.getDiameter()+", the perimeter is :"+this.getPerimeter()+" and area is :"+this.getArea());
    }
    
    
}
