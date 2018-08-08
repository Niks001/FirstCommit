public class CountVowelsAndAlphabets {
    static boolean Isvowel(char ch){
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
                default : return false;
            }

    }
    public static void main(String args[]){
        int consonentCount=0,vowelCount=0;
        String str = "This is java programming";
        for(int i=0;i<str.length();i++){
            if(Isvowel(str.charAt(i)))
                vowelCount++;
            else
                consonentCount++;
        }
        System.out.println("Total Vowels: "+vowelCount);
        System.out.println("Total Consonents: "+consonentCount);
    }
}
