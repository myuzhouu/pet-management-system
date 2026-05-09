package Test;
import java.util.Scanner;
public class App {
    
    public static void main(String[] args) {
        String name;
        int age;
        int id;
        AnimalManager manager = new AnimalManager();
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("------------------欢迎来到宠物管理系统！：）----------------------");
        System.out.println("------------------输入1选择添加您的宠物：）----------------------");
        System.out.println("------------------输入2选择删除您的宠物：）----------------------");//这个删除还是有点难度，先不做了
        System.out.println("------------------输入3选择查看宠物总数：）-----------------------");
        System.out.println("------------------输入4选择查看修狗总数：）-----------------------");
        System.out.println("------------------输入5选择查看喵喵总数：）-----------------------");
        System.out.println("------------------输入6选择查看所有宠物信息：）----------------------");
        System.out.println("------------------输入7让所有宠物执行行为：）-----------------------");
        System.out.println("------------------输入8让宠物执行特殊行为：）-----------------------");
        System.out.println("------------------输入9修改宠物信息：）-----------------------------");
        System.out.println("------------------输入10查看指定宠物信息：）-----------------------------");
        System.out.println("------------------输入0退出宠物管理系统：）-----------------------");
        System.out.println("------------------请您做出选择：）----------------------------------");
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
                    Animal dog = new Dog(name, age);
                    manager.addAnimal(dog);
                    
                }
                else if(choseNumber == 2){
                    System.out.println("请输入您宠物的名字：");
                    name = sc.next();
                    System.out.println("请输入您宠物的年龄：");
                    age = sc.nextInt();
                    Animal cat = new Cat(name, age);
                    manager.addAnimal(cat);
                    
                }
                else{
                System.out.println("宠物类型输入错误，请输入1或2！");
}
                break;
            case 2:
                System.out.println("请输入您想要删除的宠物编号：");
                int num = sc.nextInt();
                manager.deleteAnimal(num);
                break;
            case 3:
                manager.showAnimalCount();
                break;
            case 4:
                manager.showDogCount();
                break;
            case 5:
                manager.showCatCount();
                break;
            case 6:
                manager.showAllAnimals();
                break;
            case 7:
                manager.doRegular();
                break;
            case 8:
                manager.doSpecial();
                break;
            case 9:
                    
                    System.out.println("请输入您宠物的id标号：");
                    id = sc.nextInt();
                    if(!manager.containsId(id)){
                        System.out.println("您输入的宠物编号不存在！");
                        
                        break;
                    }
                    System.out.println("请输入您宠物新的的名字：");
                    name = sc.next();
                    System.out.println("请输入您宠物新的年龄：");
                    age = sc.nextInt();
                    manager.modifyAnimal(id,age,name);
                break;
            case 10:
                    System.out.println("请输入您宠物的id标号：");
                    id = sc.nextInt();
                    if(!manager.containsId(id)){
                        System.out.println("您输入的宠物编号不存在！");
                        break;
                    }
                    manager.findAnimal(id);
                break;
            case 0:
                System.out.println("感谢使用宠物管理系统，期待与您的下次相遇。再见！");
                sc.close();
                return;
                default:
        System.out.println("无效选择");
        }
        }
       












        
    



    }}