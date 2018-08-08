import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckAnagram {
    static void isAnagram(String string, String string2){
        boolean status = false;
        String s1 = string.replace(" ", "");
        String s2 = string2.replace(" ", "");
        if(s1.length()!=s2.length())
            status=false;
        else {
            char[] str1 = s1.toLowerCase().toCharArray();
            char[] str2 = s2.toLowerCase().toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            status = Arrays.equals(str1,str2);
        }
        if(status==false){
            System.out.println("Non Anagram");
        }
        else
            System.out.println("Anagrams");

    }
    public static void main(String args[]){
        String s1 = "Mother In Law";
        String s2 = "Hitler Woman";
        isAnagram(s1,s2);
        isAnagram("nikhil","guptaa");
    }
}
