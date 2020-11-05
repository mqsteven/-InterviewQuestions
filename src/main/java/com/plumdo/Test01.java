package com.plumdo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author steven
 * @Classname Test01
 * @Description TODO
 * @Date 2020/11/3 14:59
 */
public class Test01 {


    public static void main(String[] args) {
        int[] nums=new int[]{2,7,11,15};
         int target=9;
        int[] ints = Test01.twoSum(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }


    }

    public int[] runningSum(int[] nums) {

        for (int i =1;i<=nums.length;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
        public static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
            for (int i = 0; i < nums.length; ++i) {
                if (hashtable.containsKey(target - nums[i])) {
                    return new int[]{hashtable.get(target - nums[i]), i};
                }
                hashtable.put(nums[i], i);
            }
            return new int[0];
        }

}
