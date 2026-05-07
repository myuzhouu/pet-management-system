package Test;
import java.util.Map;
import java.util.HashMap;
public class AnimalManager {
    private Map<Integer,Animal> animalMap = new HashMap<>();
    
    public void addAnimal(Integer id, Animal animal){
       animalMap.put(id,animal);
       System.out.println("恭喜您添加爱宠成功！");
}
    public void delAnimal(Integer id){
        if(animalMap.containsKey(id)){
                Animal animalDel = animalMap.get(id);
                if(animalDel instanceof Dog){
                    Dog.dogSum--;
                }
                if(animalDel instanceof Cat){
                    Cat.catSum--;
                }
                animalMap.remove(id);
                System.out.println("恭喜您删除爱宠成功，您太狠心了！");
                }
                else
                    System.out.println("您输入的宠物编号不存在！");
    }
    public void showAllanimals(){
        for(Integer id : animalMap.keySet()){
            Animal animal = animalMap.get(id);
            System.out.println( "宠物ID：" + id + " 名字：" + animal.getName() + " 年龄：" + animal.getAge() );
        }
    }
    public void showDogCount(){
        System.out.println("您的修狗总共有"+Dog.dogSum+"只！");
    }
    public void showCatCount(){
        System.out.println("您的喵喵总共有"+Cat.catSum+"只！");
    }
    public void showAnimalCount(){
        System.out.println("您的宠物总共有"+animalMap.size()+"只！");
    }
    public void doRegular(){
        for (Integer id : animalMap.keySet()){
                    Animal animal = animalMap.get(id);
                    animal.eat();
                    animal.sleep();
                }
    }
    public void doSpecial(){
           for (Integer id : animalMap.keySet()){
                    Animal animal = animalMap.get(id);
                      if (animal instanceof Dog) {
                        Dog dog = (Dog) animal;
                        dog.watchHouse();
    }
                    if (animal instanceof Cat) {
                        Cat cat = (Cat) animal;
                        cat.catchMouse();
                }
            }
    }
}
