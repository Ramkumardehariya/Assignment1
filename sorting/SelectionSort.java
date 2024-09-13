package Assignment1.sorting;

public class SelectionSort {

    void selectionSort(int arr[]){
        
        for(int i = 0; i<arr.length; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,7,1,5,2,3,9,8,4};

        SelectionSort a = new SelectionSort();
        a.selectionSort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
