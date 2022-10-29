public class oops {
    class Student{
        String name;
        int roll_no;
//       non parameterized constructor
        Student(){
            System.out.println("Default constructor");
        }

//        parameterized constructor
        Student(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        oops obj = new oops();
        Student s1 = obj.new Student("Aman");
        System.out.println(s1.name);
        
    }
}
