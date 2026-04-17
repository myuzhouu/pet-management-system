package Test;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();
        while(true){
        System.out.println("------------------欢迎来到宠物管理系统！-----------------------");
        System.out.println("------------------输入1选择添加您的宠物-----------------------");
        System.out.println("------------------输入2选择删除您的宠物-----------------------");//这个删除还是有点难度，先不做了
        System.out.println("------------------输入3选择查看宠物总数-----------------------");
        System.out.println("------------------输入4选择查看修狗总数-----------------------");
        System.out.println("------------------输入5选择查看喵喵总数-----------------------");
        System.out.println("------------------输入6选择查看所有宠物信息-----------------------");
        System.out.println("------------------输入7让所有宠物执行行为-----------------------");
        System.out.println("------------------输入8让宠物执行特殊行为-----------------------");
        System.out.println("------------------输入0退出宠物管理系统-----------------------");
        System.out.println("------------------请您做出选择----------------------------------");
        int number = sc.nextInt(); 
        switch(number){
            case 1:
                System.out.println("您的宠物是修狗（输入1）还是喵喵（输入2）？");
                int choseNumber = sc.nextInt();
                if(choseNumber == 1){
                    System.out.println("请输入您宠物的名字：");
                    name = sc.next();
                    System.out.println("请输入您宠物的年龄：");
                    age = sc.nextInt();
                    animals.add(new Dog(name,age));
                    System.out.println("恭喜您添加爱宠修狗成功！");
                }
                else if(choseNumber == 2){
                    System.out.println("请输入您宠物的名字：");
                    name = sc.next();
                    System.out.println("请输入您宠物的年龄：");
                    age = sc.nextInt();
                    animals.add(new Cat(name,age));
                    System.out.println("恭喜您添加爱宠喵喵成功！");
                }
                break;
            case 2:
                System.out.println("请输入您想要删除的宠物编号：");
                int num = sc.nextInt();
                 animals.remove(num-1);
                 break;
            case 3:
                
                System.out.println("您的宠物总共有"+animals.size()+"只！");
                break;
            case 4:
                System.out.println("您的修狗总共有"+Dog.dogSum+"只！");
                break;
            case 5:
                System.out.println("您的喵喵总共有"+Cat.catSum+"只！");
                break;
            case 6:
                for(int i=0;i<animals.size();i++){
                    Animal animal = animals.get(i);
                    System.out.println("第"+(i+1)+"只宠物名字叫："+animal.getName()+",爱宠今年"+animal.getAge()+"岁了。");
                }
                break;
            case 7:
                for(Animal animal: animals){
                    animal.eat();
                    animal.sleep();
                }
                break;
            case 8:
                for(Animal animal: animals){
                    if (animal instanceof Dog) {
                        Dog dog = (Dog) animal;
                        dog.watchHouse();
    }
                    if (animal instanceof Cat) {
                        Cat cat = (Cat) animal;
                        cat.catchMouse();
    }
                    break;
                }
            case 0:
                System.out.println("感谢使用宠物管理系统，期待与您的下次相遇。再见！");
                sc.close();
                return;
                
                default:
        System.out.println("无效选择");
        }
        }
       












        
    



    }}