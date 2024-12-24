import java.lang.reflect.Method;

public class SortingHelper {

    private SortingHelper() {
    }

    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {

        for (int i = 1; i < arr.length; i++)
            if (arr[i - 1].compareTo(arr[i]) > 0)
                return false;
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortname, E[] arr) {

        long startTime = System.nanoTime();
        if (sortname.equals("SelectionSort"))
            SelectionSort.sort(arr);
        long endTime = System.nanoTime();

        double time = (endTime - startTime) / 1000000000.0;

        if (!SortingHelper.isSorted(arr))
            throw new RuntimeException(sortname + " failed");
        System.out.println(String.format("%s , n = %d : %f s", sortname, arr.length, time));
    }

    /**
     * 使用反射进行优化
     * @param sortClassName
     * @param sortMethodName
     * @param arr
     * @param <E>
     */
    public static <E extends Comparable> void sortTest2(String sortClassName, String sortMethodName, E[] arr) {
        try {
            Class<?> sortClass = Class.forName(sortClassName);
            Method sortMethod = sortClass.getMethod(sortMethodName, Comparable[].class);
            long startTime = System.nanoTime();
            sortMethod.invoke(null, (Object) arr);
            long endTime = System.nanoTime();
            double time = (endTime - startTime) / 1_000_000_000.0;
            if (!SortingHelper.isSorted(arr)) {
                throw new RuntimeException(sortClassName + "." + sortMethodName + " failed");
            }
            System.out.println(String.format("%s.%s , n = %d : %f s", sortClassName, sortMethodName, arr.length, time));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Reflection failed:" + e.getMessage());
        }
    }
}
