package maximum_sub_array_less_than_or_equal_to_x;

public class Main {
    public static long findMaxSubarraySum(int[] arr, long x) {
        // Your code goes here
        long sum = 0;
        int r=0;
        int n=arr.length;
        long maxSum = sum;
        while(r<n){
            sum += arr[r];
            if(sum<=x){
                maxSum = Math.max(maxSum, sum);
            }
            else{
                sum = arr[r];
                if(sum<=x){
                    maxSum = Math.max(maxSum, sum);
                }
            }
            r++;
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] arr = {46, 22, 71, 76, 19};
        long x = 73;
        System.out.println(findMaxSubarraySum(arr,x));
    }
}
