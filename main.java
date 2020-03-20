import java.util.*;

public class Main {

     public static void main(String []args) {
        String s = args[0];
        String t = args[1];
        
        if (s == null || t == null) System.out.println("false");
        if (s.length() != t.length()) System.out.println("false");
        
        HashSet<Character> occurrencesFirst = new HashSet<Character>();
        boolean check = true;
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (occurrencesFirst.contains(current)) {
                System.out.println("false");
                check = false;
            } else {
                occurrencesFirst.add(current);
            }
            
        }
        
        if(check) System.out.println("true");
     }
}
