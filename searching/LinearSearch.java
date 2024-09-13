package Assignment1.searching;

public class LinearSearch {
    boolean linearSearch(int arr[], int num){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == num){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        LinearSearch a = new LinearSearch();
        int arr[] = new int[50];

        for(int i = 1; i<=arr.length; i++){
            arr[i-1] = i;
        }

        System.out.println(arr[9]);

        System.out.println(a.linearSearch(arr, 2));
        System.out.println(a.linearSearch(arr, 99));
    }
}