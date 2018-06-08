import org.junit.Test;

/**
 * Description: 排序
 * User: sukai
 * Date: 2018-04-16   16:51
 */
public class Sort{

    /**
     * 快速排序
     * @param arr
     * @return
     */
    public static int[] quickSort(int[] arr, int low, int high) {
        //1,找到递归算法的出口
        if( low > high) {
            return arr;
        }
        //2, 存
        int i = low;
        int j = high;
        //3,key
        int key = arr[low];
        //4，完成一趟排序
        while(i < j) {
            //4.1 ，从右往左找到第一个小于key的数
            while( i<j && arr[j]>key ){
                j--;
            }
            // 4.2 从左往右找到第一个大于key的数
            while( i<j && arr[i]<=key ) {
                i++;
            }
            //4.3 交换
            if(i < j) {
                int p = arr[i];
                arr[i] = arr[j];
                arr[j] = p;
            }
        }
        // 4.4，调整key的位置
        int p = arr[i];
        arr[i] = arr[low];
        arr[low] = p;
        //5, 对key左边的数快排
        quickSort(arr, low, i-1 );
        //6, 对key右边的数快排
        quickSort(arr, i+1, high);

        return arr;
    }


    /**
     * 冒泡排序（思路一）
     * 两两相邻的数比较，每一轮从0开始，共比较arr.length-1轮
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] ^= arr[j+1];
                    arr[j+1] ^= arr[j];
                    arr[j] ^= arr[j+1];
                }
            }
        }
        return arr;
    }

    /**
     * 冒泡排序（思路二）
     * 第一个数依次与后面的数比较，找出最小值放到第一个位置，第二轮从第二个数往后比较，共比较arr.length-1轮
     * @param arr
     * @return
     */
    public static int[] bubbleSort1(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=i; j<arr.length-1; j++){
                if(arr[i] > arr[j+1]){
                    arr[i] ^= arr[j+1];
                    arr[j+1] ^= arr[i];
                    arr[i] ^= arr[j+1];
                }
            }
        }
        return arr;
    }

    @Test
    public void testSort(){
        int[] arr = {1, 2, 5, 12, 5, 6, 3, 9};
        arr = quickSort(arr, 0, arr.length-1);
        for(int x : arr){
            System.out.println(x);
        }

    }
}
