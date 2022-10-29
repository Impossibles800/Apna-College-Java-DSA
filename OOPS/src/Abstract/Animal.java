package Abstract;

public abstract class Animal {

    String color;
    // constructor
    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    //    gives the idea
    abstract void walk();

    public static void main(String[] args) {
//        Horse h = new Horse();
//        h.walk();
//        Chicken c = new Chicken();
//        c.walk();
////        Gives error
////        Animal a = new Animal()
//        System.out.println(h.color);

        Mustang m = new Mustang();
//        Animal->Horse->Mustang


    }
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse constructor called");
    }
    @Override
    void walk() {
        System.out.println("Walking with 4" +
                "legs");
    }
    void change_color(){
        color = "dark brown";
    }
}

class Chicken extends Animal {
    Chicken(){
        System.out.println("Chicken constructor called");
    }
    @Override
    void walk() {
        System.out.println("Walking with 2 legs");
    }
    void change_color(){
        color = "Yellow";
    }

}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}