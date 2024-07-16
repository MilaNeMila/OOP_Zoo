package animals;

import food.Food;
import food.Meat;

public class Carnivorous extends Animal{
    @Override
    public void eat(Food food){
        super.eat(food);
        boolean toEat = food instanceof Meat;
        if(toEat){
        }
        else{
        }
    }
}
