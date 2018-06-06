/**
 * Description: 二分查找算法接口
 * User: sukai
 * Date: 2018-04-16   16:32
 */
public interface Search {

    /**
     * 二分查找循环实现
     * @param arr 按顺序排好的数组
     * @param x 要查找的数
     * @return 返回数组的下标， 没有找到返回-1
     */
    public int binarySearch(int[] arr, int x);


    /**
     * 递归实现二分查找
     * @param dataSet 按顺序排好的数组
     * @param data 要查找的数据
     * @param beginIndex 开始位置
     * @param endIndex 结束位置
     * @return 返回数组的下标， 没有找到返回-1
     */
    public int binarySearch(int[] dataSet,int data,int beginIndex,int endIndex);
}
