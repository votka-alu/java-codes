/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author tanvir
 */
public class Gen <T>{
    T ob;
    
    Gen(T o){
        ob = o;
    }
    
    T getob(){
        return ob; 
    }
    
    void showType(){
        System.out.println("Type of T is:"+ob.getClass().getName());
    }
    
}
