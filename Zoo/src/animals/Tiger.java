package animals;

import food.Food;
import food.Meat;

public class Tiger extends Carnivorous implements Run, Swim, Voice{

    @Override
    public void run() {
System.out.println("Тигор бежит!");
    }

    @Override
    public void swim() {
System.out.println("Тигор не любит воду, но умеет плавать!");
    }

    @Override
    public String voice() {
        String voice = "РРР!";
        return voice;
    }
    @Override
    public void eat(Food food){
        super.eat(food);
        boolean toEat = food instanceof Meat;
        if(toEat){
            System.out.println("Тигр ест мясо");
        }
        else{
            System.out.println("Тигр не травоядное животное!");
        }
    }
}
