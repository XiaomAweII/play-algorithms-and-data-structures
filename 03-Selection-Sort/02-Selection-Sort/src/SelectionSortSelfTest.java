/**
 * @author xiaoweii
 * @create 2024-12-24 21:47
 */
public class SelectionSortSelfTest {
    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            swap(arr, i, minIndex);

        }
    }

    public static void swap(int[] arr, int i, int j) {

        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
