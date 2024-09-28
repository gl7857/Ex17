public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public void move() {
        System.out.println("Running");
    }

    @Override
    public void eat(){
        System.out.println("meat");
    }
}

