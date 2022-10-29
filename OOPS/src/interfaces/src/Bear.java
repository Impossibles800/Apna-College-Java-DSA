public class Bear implements Carnivore, Herbivore {
    @Override
    public void eats_grass(){
        System.out.println("Eats grass");
    }
    @Override
    public void eats_meat(){
        System.out.println("Eats meat");
    }


}
