public class LinearSearch {

    private LinearSearch(){}

    /**
     * 使用泛型方法使得方法更具有通用性
     * @param data
     * @param target
     * @return
     * @param <E>
     */
    public static <E> int search(E[] data, E target){

        for(int i = 0; i < data.length; i ++)
            if(data[i].equals(target))
                return i;

        return -1;
    }

    public static void main(String[] args){

        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};

        /*
        在java当中具有类型推断机制，不需要我们显示的去指定使用的方法类型，会自动帮我们去识别类型
         */
        int res = LinearSearch.search(data, 16);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 666);
        System.out.println(res2);
    }
}
