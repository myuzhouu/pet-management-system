package Test;

public class Cat extends Animal{
    static int catSum=0;
 

    public Cat(String name,int age){
        super(name,age);
        catSum++;
    }
    
    @Override
    public void eat(){
        System.out.println(getName()+"小猫喜欢吃猫条！今年"+getAge()+"岁了。");
    }
    @Override
    public void sleep(){
        System.out.println(getName()+"喜欢白天睡觉，晚上休息！今年"+getAge()+"岁了。");
    }

    public void catchMouse(){
        System.out.println(getName()+"可以抓老鼠！今年"+getAge()+"岁了。");
    }
    public int getCatSum(){
       return catSum;
    }
   
}
