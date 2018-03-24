package com.aierdeliqi.junittestexample;

/**
 * Created by Quin 2018/3/24.
 * version 1.0
 */

public class MaxArray {
    private int []array;
//    private int []maxArray;
    MaxArray(){}

    MaxArray(int example){
/** example = 0 , 题目用例
 *  example = other , 全负数用例
 */
        if (example == 0){
            array = new int[]{-2,11,-4,13,-5,-2};
        }else {
            array = new int[]{-11,-22,-24,-1,-20,-9};
        }
    }

    MaxArray(int []array){
        this.array = array;
    }

    public int searchMaxArray(){
        //还原指针
        int negativePointer = 0;
        //最大值
        int max = 0;
        //组累加和
        int accumulation = 0;
        for(int i = 0; i < array.length ; i++){
            accumulation += array[i];
            max = Math.max(max,accumulation - negativePointer);
            //指针移进
            negativePointer = Math.min(negativePointer,accumulation);
        }
        if(max >= 0){
            return max;
        }else {
            return 0;
        }
    }
}
