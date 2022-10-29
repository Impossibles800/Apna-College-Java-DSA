package Polymorphism;

public class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {

        Deer deer = new Deer();
        deer.eat();
    }
}

class Deer extends Animal{
    @Override
    void eat(){
        System.out.println("Eating Grass");
    }
}


