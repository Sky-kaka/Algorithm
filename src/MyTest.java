import org.junit.Test;

public class MyTest {

    @Test
    public void testSearch(){
        Search search = new SearchImpl();
        int a[] = {1, 4, 8, 13, 17, 24, 34, 46};
        System.out.println(search.binarySearch(a, 34));
        System.out.println(search.binarySearch(a, 34, 0, a.length-1));
    }

    @Test
    public void testSort(){
        Sort sort = new SortImpl();
        int[] arr = {1, 2, 5, 12, 5, 6, 3, 9};
        arr = sort.quickSort(arr, 0, arr.length-1);
        for(int x : arr){
            System.out.println(x);
        }

    }
}
