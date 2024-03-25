//divide the array into two parts
//Take first element from unsorted array and find its correct position in sorted array
//repeat until unsorted array is empty

public class InsertionSort {

    public static void printElement(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i< arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                --j;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args){
        int[] arr = {60,10,30,20,50,40};
        System.out.print("Array elements before sorting: " );
        printElement(arr);
        insertionSort(arr);
        System.out.print("Array elements after sorting: " );
        printElement(arr);
    }
}
