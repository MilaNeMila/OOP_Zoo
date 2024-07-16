package animals;

import food.Food;
import food.Meat;

public class Tiger extends Carnivorous implements Run, Swim, Voice{

    @Override
    public void run() {
System.out.println("����� �����!");
    }

    @Override
    public void swim() {
System.out.println("����� �� ����� ����, �� ����� �������!");
    }

    @Override
    public String voice() {
        String voice = "���!";
        return voice;
    }
    @Override
    public void eat(Food food){
        super.eat(food);
        boolean toEat = food instanceof Meat;
        if(toEat){
            System.out.println("���� ��� ����");
        }
        else{
            System.out.println("���� �� ���������� ��������!");
        }
    }
}
