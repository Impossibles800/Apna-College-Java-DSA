public class Climbing_Stairs {
    public static int climbing_Stairs(int n){
        if(n<0)
            return 0;
        if(n==0)
            return 1;
        return climbing_Stairs(n-1)+climbing_Stairs(n-2);
    }

    public static void main(String[] args) {
        System.out.println(climbing_Stairs(4));
    }
}
