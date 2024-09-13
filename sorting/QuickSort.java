package Assignment1.sorting;
// package sorting;

public class QuickSort {

    int partition(int arr[], int low, int high){
        int pivot = arr[low];

        int count = 0;

        for(int i = low+1; i<=high; i++){
            if(arr[i] <= pivot){
                count++;
            }
        }

        int pivotIndex = low+count;
        arr[low] = arr[pivotIndex];
        arr[pivotIndex] = pivot;

        int i = low;
        int j = high;

        while(i < pivotIndex &&  j > pivotIndex){
            while(arr[i] < pivot){
                i++;
            }
            while(arr[j] > pivot){
                j--;
            }

            if(i < pivotIndex && j > pivotIndex){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    void quickSort(int arr[], int s, int e){
        if(s >= e){
            return;
        }
        int p = partition(arr, s, e);
        quickSort(arr, s, p-1);
        quickSort(arr, p+1, e);
    }
    public static void main(String[] args) {
        int arr[] = {6,7,1,5,2,3,9,8,4};

        QuickSort a = new QuickSort();
        int n = arr.length;
        a.quickSort(arr, 0, n-1);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
