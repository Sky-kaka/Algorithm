
/**
 * Description: 排序接口
 * User: sukai
 * Date: 2018-04-16   16:51
 */
public interface Sort {

    /**
     * 快速排序
     * @param arr
     * @return
     */
    public int[] quickSort(int[] arr, int low, int high);

    /**
     * 冒泡排序（思路一）
     * 两两相邻的数比较，每一轮从0开始，共比较arr.length-1轮
     * @param arr
     * @return
     */
    public int[] bubbleSort(int[] arr);

    /**
     * 冒泡排序（思路二）
     * 第一个数依次与后面的数比较，找出最小值放到第一个位置，第二轮从第二个数往后比较，共比较arr.length-1轮
     * @param arr
     * @return
     */
    public int[] bubbleSort1(int[] arr);
}
