public class Main {
    public static void main(String[] args) {


        Animal[] animals = {
                new Shark(),
                new Turtle(),
                new Eagle()};

       for (Animal animal : animals) {
            animal.makeSound();
             if (animal instanceof Shark) {
                ((Shark) animal).attack();
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).swim();
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            }
        }

         Shark[] sharks = {new Shark()};
        Turtle[] turtles = {new Turtle()};
        Eagle[] eagles = {new Eagle()};
    }
}