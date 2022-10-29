//derived class
public class Fish extends Animal {
    int fins;
    void swim(){
        System.out.println("Swimming");
    }
    @Override
    void eat(){
        System.out.println("Eating fish food");
    }

}
