package com.plumdo;

import java.util.HashMap;
import java.util.Map;


/**
 * @author steven
 * @Classname Test01
 * @Description 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 *
 * 输入：[0,3,2,1]
 * 输出：true
 * 输入：[3,5,5]
 * 输出：false
 * 输入：[2,1]
 * 输出：false
 * @Date 2020/11/3 14:59
 */
public class Test02 {


    public static void main(String[] args) {

        int [] a=new int[]{1,2,3,5,3,1};


    }
    public boolean validMountainArray(int[] A) {

        int length=A.length;
        int i=0;
        while (i+1<length&&A[i]<A[i+1]){
            i++;
        }
        if(i==0 || i==length-1){
            return false;
        }
        while (i+1<length&&A[i]>A[i+1]){
            i++;
        }

        return i ==length-1;
    }

}
