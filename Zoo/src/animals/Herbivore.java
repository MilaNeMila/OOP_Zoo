package animals;

import food.Food;
import food.Grass;
import food.Meat;

public class Herbivore extends Animal implements Swim{
    @Override
    public void eat(Food food){
        super.eat(food);
        boolean toEat = food instanceof Grass;
        if(toEat){
            System.out.println("Рыбка кушает водоросли");
        }
        else{
            System.out.println("Этот вид рыбок не плотоядный!");
        }
    }


    @Override
    public void swim() {
        System.out.println("Рыбка плавает в прудике");
    }
}
