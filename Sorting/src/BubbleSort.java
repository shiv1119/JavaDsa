//Bubble sort is referred as sinking sort
//We repeatedly compare each pair of adjacent items and swap them if they are in wrong order
//Time  - O(n^2)
public class BubbleSort {

    public static void printElement(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void bubbleSort(int[] arr){
        int temp;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }


    public static void main(String[] args){
        int[] arr = {60,10,30,20,50,40};
        System.out.print("Array elements before sorting: " );
        printElement(arr);
        bubbleSort(arr);
        System.out.print("Array elements after sorting: " );
        printElement(arr);
    }
}
