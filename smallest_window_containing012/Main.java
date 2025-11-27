package smallest_window_containing012;

import java.util.Arrays;

public class Main {

    static int smallestSubString(String S){

        int zeroC = 0;
        int oneC = 0;
        int twoC = 0;
        int l=0;
        int ans = -1;
        for(int r=0;r<S.length();r++){
            if(S.charAt(r)=='0'){
                zeroC++;
            } else if(S.charAt(r)=='1'){
                oneC++;
            } else {
                twoC++;
            }
            while(zeroC >= 1 && oneC >= 1 && twoC >= 1){
                if (ans==-1){
                    ans = r-l+1;
                } else {
                    ans = Math.min(ans, r-l+1);
                }
                if (S.charAt(l)=='0'){
                    zeroC--;
                } else if (S.charAt(l)=='1'){
                    oneC--;
                } else {
                    twoC --;
                }
                l++;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        String S = "01212";
        System.out.println(smallestSubString(S));
    }
}
