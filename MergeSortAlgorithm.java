public class MergeSortAlgorithm {
    static void merge(int arr[], int low, int middle, int high){
        int n1 = (middle-low)+1;
        int n2 = high-middle;
        int Left[] = new int[n1];
        int Right[] = new int[n2];
        for(int i=0;i<n1;i++){
            Left[i] = arr[low+i];
        }
        for(int j=0;j<n2;j++){
            Right[j]= arr[middle+1+j];
        }
        int i=0,j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(Left[i]<=Right[j]){
                arr[k]=Left[i];
                i++;
            }
            else{
                arr[k]=Right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]= Left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]= Right[j];
            j++;
            k++;
        }
    }
    static void sort(int arr[], int low, int high){
        if(low<high){
            int middle = (low+high)/2;
            sort(arr,low,middle);
            sort(arr,middle+1,high);
            merge(arr,low,middle,high);
            System.out.println(low+" "+middle+" "+high);
        }
    }
    public static void main(String[] args){
         int arr[] = {9,5,7,3,8,2,15};
         int arrLength = arr.length;
         sort(arr,0,arrLength-1);
        for (int t=0; t<arrLength; t++)
            System.out.print(arr[t] + " ");

     }
}
