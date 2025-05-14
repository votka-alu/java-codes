
package geometricobject;

public class GeometricObject {
    private String color;
    private boolean filled;
    
    public GeometricObject(){
        this.color = "null  ";
        this.filled = false;
    }
    
    public GeometricObject(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean getFilled(){
        return this.filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public String toString(){
        return "Color: "+this.color+"Filled: "+this.filled;
    }
}
