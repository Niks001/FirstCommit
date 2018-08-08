public class CompareArrays {
        static void findDuplicateValueCount(int arr1[], int arr2[]){
            int count=0;
            for(int i=0;i<arr1.length;i++){
                for(int j=0;j<arr2.length;j++){
                    if(arr1[i]==arr2[j]){
                       count++;
                    }
                }
            }
            System.out.println("Total Duplicate Values "+ count);
        }

    public static void main(String args[]){
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,10,11,12,5};
        String str = "abc";
        String str1 = new String("abc");
        String str2 = "abc";
        System.out.println(str.equals(str1));
        System.out.println(str==str1);
        System.out.print(str2==str1);
       // findDuplicateValueCount(arr1,arr2);
    }
}
