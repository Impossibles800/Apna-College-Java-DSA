import java.sql.SQLOutput;

public class p1 {

//    Q1
    public static int count_vowels(String s){
        int count = 0;
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
            || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
    public static boolean anangram(String s, String x){

        if (s.length()!=x.length())
            return false;

        int []a = new int[26];


      for (int i = 0,j=0 ;i<s.length() && j<s.length() ;i++,j--){
           a[s.charAt(i)-'a']++;
           a[x.charAt(i)-'a']--;
      }

        for (int i = 0; i < a.length; i++) {
            if (a[i]!=0)
                return false;
            else
                return true;
        }


        return false;
    }

    public static void main(String[] args) {
//        System.out.println(count_vowels("Abhiraj"));
//        System.out.println(anangram("race", "care"));
        String s = "Hello";
        String p = new String("Hello");
        System.out.println(s.equals(p.intern()));
        System.out.println(p.equals(s.intern()));
        System.out.println(p == s.intern());
        System.out.println(p.intern() == s);
    }
}
