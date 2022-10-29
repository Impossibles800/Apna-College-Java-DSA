public class Animal {
    String color;
    Animal(){
        System.out.println("Animal Constructor is called");
    }

    public static void main(String[] args) {

        Horse h = new Horse();
        Animal a = new Animal();
        System.out.println(h.color);
    }
}
class Horse extends Animal{
    Horse(){
        super();
        super.color = "Brown";
        System.out.println("Horse Constructor is called");

    }
}


