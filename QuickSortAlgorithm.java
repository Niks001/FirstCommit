class QuickSortAlgorithm {
    int partition(int[] arr, int p, int r){
        int x = arr[r];
        int i=p-1;
        for(int j=p;j<r;j++){
            if(arr[j]<=x){
                i=i+1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[r];
        arr[r]=temp;

    return i+1;
    }
    void quickSort(int[] arr, int p, int r){
        if(p<r){
            int q = partition(arr,p,r);
            quickSort(arr,p,q-1);
            quickSort(arr,q+1,r);
            }
        }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
       // System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {6,5,0,2,8,9,4,7};
        int r = arr.length;
        QuickSortAlgorithm testQuick = new QuickSortAlgorithm();
        testQuick.quickSort(arr,0,r-1);
        printArray(arr);
    }
}
