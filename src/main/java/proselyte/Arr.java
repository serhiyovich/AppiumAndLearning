package proselyte;

import org.apache.commons.lang3.ArrayUtils;

public class Arr {
    public boolean firstLast6(int[] nums) {
        if(nums[0]==6){
            return true;
        }
        else if (nums[0]!=6){
            ArrayUtils.reverse(nums);
            if (nums[0]==6){
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,3,5,6,7,8};
        ArrayUtils.reverse(arr);
        System.out.println(arr[0]);
    }
}
