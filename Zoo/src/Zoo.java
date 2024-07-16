import animals.Fish;
import animals.Tiger;
import food.Grass;
import food.Meat;

public class Zoo {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Fish fish = new Fish();
        Meat meat = new Meat();
        Grass grass = new Grass();
        Worker worker = new Worker();
        tiger.run();
        tiger.swim();
        worker.getVoice(tiger);
        worker.feed(meat, tiger);
        worker.feed(grass, tiger);

        fish.swim();
        worker.feed(grass, fish);
        worker.feed(meat, fish);
        //worker.getVoice(fish);
    }
}