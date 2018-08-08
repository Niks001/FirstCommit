public class OddEvenFrequency {
    static void findFrequncy(int arr[][],int m, int n){
        int Odd=0,even=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((arr[i][j]%2)==0)
                    even++;
                else
                    Odd++;
            }
        }
        System.out.println("Odd frequency is "+ Odd);
        System.out.println("Even frequency is "+ even);
    }
    public static void main(String[] args){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        findFrequncy(arr,3,3);
    }
}
