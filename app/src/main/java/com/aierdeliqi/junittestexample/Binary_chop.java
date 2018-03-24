package com.aierdeliqi.junittestexample;

/**
 * Created by admin on 2018/3/19.
 */

public class Binary_chop {
    //有序数组
    private int []array;
    //待查找数
    private int sel;

    //空的构造方法，用作默认测试样例
    public Binary_chop(){
        array=new int[10];
        for(int i = 0;i < 10;i++){
            array[i] = i;
        }
        sel = 5;
    }

    //含参构造方法
    public Binary_chop(int[] array, int sel) {
        this.array = array;
        this.sel = sel;
    }

    //二分查找方法
    public int binary_chop() {

        //低位指针，初始为0
        int low = 0;
        //高位指针，初始为数组末位
        int high = array.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sel == array[mid]) {
                return ++mid;
            }
            if (sel > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
