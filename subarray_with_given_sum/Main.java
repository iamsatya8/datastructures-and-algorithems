package subarray_with_given_sum;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static ArrayList<Integer> subarraySum(int[] arr, int sum){
        ArrayList<Integer> list = new ArrayList<>();
        if (sum==0){
            return new ArrayList<>();
        }
        int l = 0;
        int r = 1;
        int n = arr.length;
        int target = arr[0];
        while(r<n){
            if(target==sum){
                return new ArrayList<>(List.of(l+1,r));
            }
            else if (target>sum){
                target -= arr[l];
                l++;
                if(target==sum){
                    return new ArrayList<>(List.of(l+1,r));
                }
            }
            target += arr[r];
            r++;
        }
        return new ArrayList<>();
    }

    public static void main(String[] args){
        int[] arr = {1, 4};
        ArrayList<Integer> result;
        System.out.println(subarraySum(arr,0));
    }
}
