public class Fish extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Blub");
    }
    @Override
    public void move() {
        System.out.println("Swimming");
    }

    @Override
    public void eat(){
        System.out.println("Algae");
    }

    public void moveOnLand() {
        System.out.println("The fish cannot move on land!");
    }
}
