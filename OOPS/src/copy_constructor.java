public class copy_constructor {

    static class Student {
        String name;
        int roll_no;
        int []marks = new int[3];
        String password;
        Student(){
            System.out.println("Default constructor");
        }
        Student(String name, int roll_no, int[] marks){
            this.name = name;
            this.roll_no = roll_no;
            this.marks = marks;
        }
//      shallow copy constructor
//        Student(Student s1){
//            this.name = s1.name;
//            this.roll_no = s1.roll_no;
//            this.marks = s1.marks;
//        }
//      deep copy constructor
        Student(Student s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll_no = s1.roll_no;
            for(int i=0; i<3; i++){
                this.marks[i] = s1.marks[i];
            }
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.roll_no = 1;
        s1.marks[0] = 10;
        s1.marks[1] = 20;
        s1.marks[2] = 30;
        s1.password = "1234";
        Student s2 = new Student(s1);
        s2.password = "5678";
        s1.marks[0] = 100;
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }

    }

}
