public class Cat extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }
    @Override
    public void move(){
        System.out.println("Prowling");
    }

    @Override
    public void eat(){
        System.out.println("Chicken");
    }
}
