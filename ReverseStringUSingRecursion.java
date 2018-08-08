public class ReverseStringUSingRecursion {
    static String reverseString(String str){
        StringBuilder builder = new StringBuilder();
        char[] string = str.toCharArray();
        for(int i=string.length-1;i>=0;i--){
            builder.append(string[i]);
        }
    return  builder.toString();
    }
    static String reverseRecursively(String str){
        if(str.length()<2)
            return str;
        else
//            System.out.println(str.substring(0,str.length()-1));
            return str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));

    }
    public static void main(String args[]){
        String str1 = "Happy New Year";
        System.out.println(reverseString(str1));
        System.out.print(reverseRecursively(str1));
    }
}
