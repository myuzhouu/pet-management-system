package Test;
import java.util.Map;
import java.util.HashMap;
public class AnimalManager {
    private Map<Integer,Animal> animalMap = new HashMap<>();
    private int nextId = 1;
    public void addAnimal(Animal animal){
       animalMap.put(nextId,animal);
       System.out.println("恭喜您添加爱宠成功！"+"您的宠物编号id是："+ nextId);
       nextId++;
}
    public void deleteAnimal(Integer id){               //删除您的宠物
        

                if(!containsId(id)){
                System.out.println("您输入的宠物编号不存在！");
                return;
                }
                Animal animal = getAnimalById(id);
                if(animal instanceof Dog){
                    Dog.dogSum--;
                }
                else if(animal instanceof Cat){
                    Cat.catSum--;
                }
                animalMap.remove(id);
                System.out.println("恭喜您删除爱宠成功，您太狠心了！");
                
                
    }
    public void showAllAnimals(){                  //查看所有宠物信息
        if(checkIfEmpty()){
            return;
        }
        for(Integer id : animalMap.keySet()){
            Animal animal = getAnimalById(id);
            System.out.println( "宠物ID：" + id + " ,名字：" + animal.getName() + " ,年龄：" + animal.getAge() );
        }

    }
    public void showDogCount(){            //查看修狗总数
        System.out.println("您的修狗总共有"+Dog.dogSum+"只！");
    }
    public void showCatCount(){            //查看喵喵总数
        System.out.println("您的喵喵总共有"+Cat.catSum+"只！");
    }
    public void showAnimalCount(){          //查看宠物总数
        System.out.println("您的宠物总共有"+animalMap.size()+"只！");
    }
    public void doRegular(){                 //让所有宠物执行行为

        if(checkIfEmpty()){
            return;
        }
        for (Integer id : animalMap.keySet()){
                    Animal animal = getAnimalById(id);
                    animal.eat();
                    animal.sleep();
                }
    }
    public void doSpecial(){                   //让宠物执行特殊行为

            if(checkIfEmpty()){
            return;
        }

           for (Integer id : animalMap.keySet()){
                    Animal animal = getAnimalById(id);
                      if (animal instanceof Dog) {
                        Dog dog = (Dog) animal;
                        dog.watchHouse();
    }
                      else if (animal instanceof Cat) {
                        Cat cat = (Cat) animal;
                        cat.catchMouse();
                }
            }
    }
    public void modifyAnimal(Integer id , Integer age,String name){  //修改宠物信息
        
                
            if(!containsId(id)){
                System.out.println("您输入的宠物编号不存在！");
                return;
            }

            
            Animal animal = getAnimalById(id);
            System.out.println("您宠物当前信息如下："+"宠物ID：" + id + " ,名字：" + animal.getName() + " ,年龄：" + animal.getAge() );
            animal.setAge(age);
            animal.setName(name);
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("您修改后的宠物信息如下："+"宠物ID：" + id + " ,名字：" + animal.getName() + " ,年龄：" + animal.getAge() );
            System.out.println("恭喜您修改宠物信息成功！");
            
           
    }
    public void findAnimal(Integer id){          //查看指定宠物信息
            
            if (!containsId(id)) {
                System.out.println("您输入的宠物编号不存在！");
                return;
            }
                
            Animal animal = getAnimalById(id);
            if(animal instanceof Dog){
                System.out.println("您宠物当前信息如下："+"宠物ID：" + id + " ,修狗的名字：" + animal.getName() + " ,年龄：" + animal.getAge() );
            }
            else if(animal instanceof Cat){
                System.out.println("您宠物当前信息如下："+"宠物ID：" + id + " ,喵喵的名字：" + animal.getName() + " ,年龄：" + animal.getAge() );
            }
            }
            
    public boolean containsId(Integer id){         //判断输入宠物编号id是否存在
        return animalMap.containsKey(id);
    }
           

    public Animal getAnimalById(Integer id){       //获取宠物id创建宠物对象
        return animalMap.get(id);
    }

    public boolean checkIfEmpty(){
            if(animalMap.isEmpty()){
            System.out.println("当前没有任何宠物，请先添加宠物。");
            return true;
        }
            return false;
    }
    }

