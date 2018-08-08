public class StringPalindrome {
    static void checkPalindrome(String str){
        int flag=0;
        for(int i=0,k=str.length()-1;i<(str.length())/2;i++,k--){
            if(str.charAt(i)!=str.charAt(k)){
                flag++;
                break;
            }
        }
        if(flag==1)
            System.out.println("String is not palindrome");
        else
            System.out.println("String is palindrome");
    }
    public static void main(String args[]){
        String str = "abcdcba";
        checkPalindrome(str);
        checkPalindrome("nikhil");
        checkPalindrome("aaaaaaaaa");
    }
}
