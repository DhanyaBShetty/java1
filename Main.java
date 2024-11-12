
class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
}
interface CanFly{
    void fly();
}
interface CanSwim{
    void swim();
}
class Bird extends Animal implements CanFly,CanSwim{
    public void fly(){
        System.out.println("Bird is flying");
    }
    public void swim(){
        System.out.println("Bird is swiming");
    }
    public void chirp(){
        System.out.println("Bird is chirping");
    }
}
public class Main{
    public static void main(String[] args){
        Bird bird=new Bird();
        bird.eat();
        bird.fly();
        bird.swim();
        bird.chirp();
        System.out.println("All actions are performed by the bird");
    }
}