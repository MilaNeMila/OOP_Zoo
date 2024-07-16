package animals;

import food.Food;
import food.Grass;

public class Fish extends Herbivore {
    @Override
    public void eat(Food food){
        super.eat(food);
        boolean toEat = food instanceof Grass;
        if(toEat){

        }
        else{
        }
    }
}
