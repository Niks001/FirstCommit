import java.util.Scanner;

public class CharacterFrequency {
    static final int NO_OF_CHAR = 256;
    static char[] count=new char[NO_OF_CHAR];

    static void getCharCountArray(String string){
        for(int i=0; i<string.length(); i++){
            count[string.charAt(i)]++;
        }
    }

    static void getFreqOfCharacterCount(String str){
            getCharCountArray(str);
            for(int i=0; i<str.length(); i++){
                System.out.println(str.charAt(i)+ " comes " +(int)count[str.charAt(i)]+" times ");
            }
    }

    public static void main(String args[]){
        System.out.print("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        getFreqOfCharacterCount(string);

    }
}