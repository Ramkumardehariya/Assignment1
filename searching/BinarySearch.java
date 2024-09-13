package Assignment1.searching;

public class BinarySearch {

    boolean binarySearch(int arr[], int num){
        int low = 0;
        int high = arr.length -1;
        
        while(low <= high){
            int mid = low+(high-low)/2;
            if(arr[mid] == num){
                return true;
            }
            if(arr[mid] < num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        BinarySearch a = new BinarySearch();
        int arr[] = new int[50];

        for(int i = 1; i<=arr.length; i++){
            arr[i-1] = i;
        }

        System.out.println(arr[9]);

        System.out.println(a.binarySearch(arr, 2));
        System.out.println(a.binarySearch(arr, 25));
    }
}
