package Assignment1.sorting;
// package sorting;

public class MergeSort {

    void merge(int arr[], int s, int e){
        int mid = s+(e-s)/2;

        int len1 = mid-s+1;
        int len2 = e-mid;

        int arr1[] = new int[len1];
        int arr2[] = new int[len2];
        int k = s;

        for(int i = 0; i<len1; i++){
            arr1[i] = arr[k];
            k++;
        }

        k = mid+1;
        for(int i = 0; i<len2; i++){
            arr2[i] = arr[k];
            k++;
        }

        int mainArrayIndex = s;
        int index1 = 0;
        int index2 = 0;

        while(index1 < len1 && index2 < len2){
            if(arr1[index1] < arr2[index2]){
                arr[mainArrayIndex++] = arr1[index1++];
            }
            else{
                arr[mainArrayIndex++] = arr2[index2++];
            }
        }

        while (index1 < len1) {
            arr[mainArrayIndex++] = arr1[index1++];
        }
        while (index2 < len2) {
            arr[mainArrayIndex++] = arr2[index2++];
        }
    }
    void mergeSort(int arr[], int s, int e){
        if(s >= e){
            return;
        }
        int mid = s+(e-s)/2;

        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);

        merge(arr, s, e);
    }
    public static void main(String[] args) {
        int arr[] = {6,7,1,5,2,3,9,8,4};

        MergeSort a = new MergeSort();
        a.mergeSort(arr, 0, arr.length-1);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
