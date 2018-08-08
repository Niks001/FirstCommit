import java.util.*;

public class RemoveDuplicateString {
    static void removeDuplicateChar(String str){
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            set.add(str.charAt(i));

        for(Character ch : set)
            System.out.print(ch);
    }
    static void removeDuplicateElement(int arr[]){
        Set<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++)
            set.add(arr[i]);
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
    public static void main(String args[]){
        String str = "nikhil";
        int[] arr = {1,2,3,2,5,6,7,3,8,3,0};
        removeDuplicateChar(str);
        System.out.println();
        removeDuplicateElement(arr);
    }
}
