package tasks;


public class Box {
    private double width;
    private double length;
    private double depth;
    public Box(){
        width = 1;
        length = 1;
        depth = 1;
    }
    
    public Box (double length){
        this(1,length,1);
    }

    public Box(double width,double length ,double depth){
        this.width = width;
        this.length = length;
        this.depth = depth;
        
    }
    public Box(Box box){
        this(1,1,1);
    }
    
    public double getWidth(){
        return this.width;
    }
    public double getDepth(){
        return this.depth;
    }
    public double getLength(){
        return this.length;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setDepth(double depth){
        this.depth = depth;
    }
    public void setDim(double width,double length,double depth){
        setWidth(width);
        setLength(length);
        setDepth(depth);
    }

    public double Volume(){
        return (this.width*this.length*this.depth);
    }
    
    
    public String toString(){
        String s ="  Width:  "+width+ "  Length:  "+length+ "  Depth:  "+depth;
        return s;
    }
    
}
