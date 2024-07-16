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
            System.out.println("����� ������ ���������");
        }
        else{
            System.out.println("���� ��� ����� �� ����������!");
        }
    }


    @Override
    public void swim() {
        System.out.println("����� ������� � �������");
    }
}
