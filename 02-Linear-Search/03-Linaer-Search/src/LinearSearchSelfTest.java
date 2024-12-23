import java.util.Objects;

/**
 * @author xiaoweii
 * @create 2024-12-22 16:56
 */
public class LinearSearchSelfTest {

    /**
     * 通过私有化构造方法，让外部的类无法实例化该类，只能使用类名.方法名进行使用search方法，但是并不能阻止该类的内部创建该类
     */
    private LinearSearchSelfTest(){};

    /**
     *
     * @param data - 目标数组
     * @param target - 目标值
     * @return 存在-返回对应目标值数组下标；不存在-返回-1，表示目标值不存在；
     */
    public static int search(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 使用泛型来定义一个方法可以使得这个方法更具有通用性
     * @param data
     * @param target
     * @return
     * @param <E>
     */
    public static <E> int searchByGenerics(E[] data,E target){
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i],target)) {
                return i;
            }
//            if (data[i].equals(target)) {
//                return i;
//            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] data = {24, 18, 12, 9, 16, 66, 32, 4};
        Integer[] data2={24, 18, 12, 9, 16, 66, 32, 4};

        System.out.println("LinearSearchSelfTest.search(data,66) = " + LinearSearchSelfTest.search(data, 66));
        System.out.println("LinearSearchSelfTest.search(data,666) = " + LinearSearchSelfTest.search(data, 666));

        System.out.println("LinearSearchSelfTest.searchByGenerics(data2,66) = " + LinearSearchSelfTest.searchByGenerics(data2, 66));
        System.out.println("LinearSearchSelfTest.searchByGenerics(data2,666) = " + LinearSearchSelfTest.searchByGenerics(data2, 666));
    }
}
