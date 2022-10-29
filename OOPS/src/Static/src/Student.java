public class Student {
    String name;
    int roll_number;

    static String school_name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public static int return_percentage(int maths, int phy, int chem){
        return maths+phy+chem/3;
    }
}
