package searching_algorithems.largest_element;

import arrays.equilibram_index.Main;

public class LargestElement {

    static int largestM1(int[] arr){
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static int findMax(int[] arr, int i){
        if(i == arr.length -1){
            return arr[i];
        }

        int recMax = findMax(arr, i+1);

        return Math.max(recMax, arr[i]);
    }

    static int largestM2(int[] arr){
        return findMax(arr,0);
    }

    public static void main(String[] args){
        int arr[] = {10, 324, 45, 90, 9808};

        System.out.println(largestM1(arr));
        System.out.println(largestM2(arr));
//        System.out.println(largestM3(arr));
    }
}
