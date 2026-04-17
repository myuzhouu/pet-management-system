package Test;

public class Dog extends Animal{
    
    static int dogSum=0;
    public Dog(String name,int age){
        super(name,age);
        dogSum++;
    }

    
    @Override
    public void eat(){
        
        System.out.println(getName()+"喜欢吃狗粮！今年"+getAge()+"岁了。");
    }
    @Override
    public void sleep(){
        System.out.println(getName()+"喜欢晚上睡觉！今年"+getAge()+"岁了。");
    }
    public void watchHouse(){
        System.out.println(getName()+"能够看家护院！今年"+getAge()+"岁了。");
    }

    public int getDogSum(){
       return dogSum;
    }//多此一举了？！！！！
}
