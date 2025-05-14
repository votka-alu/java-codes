
package generics;


public class Generics {


    public static void main(String[] args) {
        Gen<Integer> iOb;
        
        iOb = new Gen<Integer>(80);
        
        iOb.showType();
        
        int v = iOb.getob();
        System.out.println("Value:"+v);
        
        System.out.println();
        
        Gen<String> strOb = new Gen<String>("Generics Test");
    }
    
}
