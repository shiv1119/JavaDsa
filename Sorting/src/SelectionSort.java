
//In case of selection sort we repeatedly find the minimum element
//and move it to the sorted part of the array to make unsorted part sorted
public class SelectionSort {
    public static void printElement(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int min_index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[min_index] > arr[j]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

    }
    public static void main(String[] args){
        int[] arr = {60,10,30,20,50,40};
        System.out.print("Array elements before sorting: " );
        printElement(arr);
        selectionSort(arr);
        System.out.print("Array elements after sorting: " );
        printElement(arr);
    }
}
