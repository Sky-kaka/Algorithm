package main.java;

import org.junit.Test;

/**
 * Description: 二分查找算法
 * User: sukai
 * Date: 2018-04-16   16:32
 */
public class Search{

    /**
     * 二分查找循环实现
     * @param arr 按顺序排好的数组
     * @param x 要查找的数
     * @return 返回数组的下标， 没有找到返回-1
     */
    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int middle = (low + high)/2;
            if(x == arr[middle]){
                return middle;
            }else if(x < arr[middle]){
                high = middle - 1;
            }else if(x > arr[middle]){
                low = middle + 1;
            }
        }
        return -1;
    }

    /**
     * 递归实现二分查找
     * @param dataSet 按顺序排好的数组
     * @param data 要查找的数据
     * @param beginIndex 开始位置
     * @param endIndex 结束位置
     * @return 返回数组的下标， 没有找到返回-1
     */
     public static int binarySearch(int[] dataSet,int data,int beginIndex,int endIndex){
        int midIndex = (beginIndex+endIndex)/2;
        if(data<dataSet[beginIndex] || data>dataSet[endIndex] || beginIndex>endIndex){
            return -1;
         }
        if(data < dataSet[midIndex]){
            return binarySearch(dataSet,data,beginIndex,midIndex-1);
        }else if(data > dataSet[midIndex]){
            return binarySearch(dataSet,data,midIndex+1,endIndex);
        }else {
            return midIndex;
        }
     }

    @Test
    public void testSearch(){
        int a[] = {1, 4, 8, 13, 17, 24, 34, 46};
        System.out.println(binarySearch(a, 34));
        System.out.println(binarySearch(a, 34, 0, a.length-1));
    }
}
