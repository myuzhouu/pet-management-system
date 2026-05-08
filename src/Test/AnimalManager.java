package Test;
import java.util.Map;
import java.util.HashMap;
public class AnimalManager {
    private Map<Integer,Animal> animalMap = new HashMap<>();
    
    public void addAnimal(Integer id, Animal animal){
       animalMap.put(id,animal);
       System.out.println("恭喜您添加爱宠成功！");
}
    public void deleteAnimal(Integer id){
        if(animalMap.containsKey(id)){
                Animal animal = getAnimalById(id);
                if(animal instanceof Dog){
                    Dog.dogSum--;
                }
                if(animal instanceof Cat){
                    Cat.catSum--;
                }
                animalMap.remove(id);
                System.out.println("恭喜您删除爱宠成功，您太狠心了！");
                }
                else
                    System.out.println("您输入的宠物编号不存在！");
    }
    public void showAllAnimals(){
        for(Integer id : animalMap.keySet()){
            Animal animal = getAnimalById(id);
            System.out.println( "宠物ID：" + id + " ,名字：" + animal.getName() + " ,年龄：" + animal.getAge() );
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
                    Animal animal = getAnimalById(id);
                    animal.eat();
                    animal.sleep();
                }
    }
    public void doSpecial(){
           for (Integer id : animalMap.keySet()){
                    Animal animal = getAnimalById(id);
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
    public void modifyAnimal(Integer id , Integer age,String name){
            
                Animal animal = getAnimalById(id);
            System.out.println("您宠物当前信息如下："+"宠物ID：" + id + " ,名字：" + animal.getName() + " ,年龄：" + animal.getAge() );
            animal.setAge(age);
            animal.setName(name);
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("您修改后的宠物信息如下："+"宠物ID：" + id + " ,名字：" + animal.getName() + " ,年龄：" + animal.getAge() );
            System.out.println("恭喜您修改宠物信息成功！");
            
           
    }
    public void findAnimal(Integer id){
            
            
                
                Animal animal = getAnimalById(id);
            if (animal instanceof Dog){
                System.out.println("您宠物当前信息如下："+"宠物ID：" + id + " ,修狗的名字：" + animal.getName() + " ,年龄：" + animal.getAge() );
            }
            if (animal instanceof Cat){
                System.out.println("您宠物当前信息如下："+"宠物ID：" + id + " ,喵喵的名字：" + animal.getName() + " ,年龄：" + animal.getAge() );
            }
            }
            
    public boolean containsId(Integer id){
        return animalMap.containsKey(id);
    }
           

    public Animal getAnimalById(Integer id){
        return animalMap.get(id);
    }
    }

