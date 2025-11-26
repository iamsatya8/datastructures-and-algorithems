package arrays.equilibram_index;

public class Main {
    static int findEquilibriumMethod1(int[] arr){
        int n = arr.length;

        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = arr[0];
        suff[n-1] = arr[n-1];

        for(int i=1;i<n;i++){
            pref[i] = pref[i-1]+arr[i];
        }

        for(int i=n-2;i>=0;i--){
            suff[i] = suff[i+1] + arr[i];
        }

        for(int i=0;i<n;i++){
            if(pref[i]==suff[i]){
                return i;
            }
        }
        return -1;
    }

    static int findEquilibriumMethod2(int[] arr){
        int prefixSum = 0;
        int totalSum = 0;

        for(int i:arr){
            totalSum += i;
        }

        for(int i=0;i<arr.length;i++){
            int suffixSum = totalSum - prefixSum - arr[i];
            if(suffixSum == prefixSum){
                return i;
            }
            prefixSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {-7,1,5,2,-4,3,0};

        System.out.println(findEquilibriumMethod1(arr));
        System.out.println(findEquilibriumMethod2(arr));
    }
}
