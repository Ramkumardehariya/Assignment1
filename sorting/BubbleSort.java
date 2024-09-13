package Assignment1.sorting;

public class BubbleSort {
    void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            boolean flag = true;
            for(int j = 0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,7,1,5,2,3,9,8,4};

        BubbleSort a = new BubbleSort();
        a.bubbleSort(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
