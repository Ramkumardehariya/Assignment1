package Assignment1.sorting;

public class InsertionSort {
    void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int num = arr[i];
            int j = i-1;
            for(; j >= 0; j--){
                if(num < arr[j]){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
            }
            arr[j+1] = num;
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,7,1,5,2,3,9,8,4};

        InsertionSort a = new InsertionSort();
        a.insertionSort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
