package Test;
import java.util.Scanner;
public abstract class Animal {
    Scanner sc = new Scanner(System.in);
    
    private String name;
    private int age; 
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    
    public void setAge(int age){
        
        
        this.age=age;
    }
    public void setName(String name){
       
        this.name = name;
    }

    public int getAge(){
        return age;

    }
    public String getName(){
        return name;
    }
   

    public abstract void eat();
    public  abstract void sleep();
    

 
}
