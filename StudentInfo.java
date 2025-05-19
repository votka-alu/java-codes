
package oop;


public class StudentInfo {
     String name;
     String gender;
     int age;
     double cgpa;
     int phone;
    
//    public StudentInfo(String A,String B,int C,double D,int E){
//        this.name = A;
//        this.gender = B;
//        this.age = C;
//        this.cgpa = D;
//        this.phone = E;
//    }
     void setInfo(String A,String B,int C,double D,int E){
        name = A;
        gender = B;
        age = C;
        cgpa = D;
        phone = E;
    }
     void StudentInformaton(){
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("CGPA:"+cgpa);
        System.out.println("Phone Number:"+phone);
        
    }

    
}

