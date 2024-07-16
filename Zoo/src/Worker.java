import animals.Animal;
import food.Food;

public class Worker {

    public void feed(Food food, Animal animal){
        animal.eat(food);
    }

    public void getVoice(Animal animal){
        System.out.println(animal.voice());
    }

}
