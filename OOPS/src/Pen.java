public class Pen {
//    properties + functions
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int tip) {
        this.tip = tip;
    }
    String getColor() {
        return this.color;
    }

}
class Student{
    String name;
    int age;
    float percentage;

    void cal_percentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/5;
    }
}
class Bank_account{
    public String username;
    private String password;
    public void setPassword(String password){
        password = password;
    }
}