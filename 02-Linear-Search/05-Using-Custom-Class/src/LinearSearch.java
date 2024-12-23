public class LinearSearch {

    private LinearSearch(){}

    public static <E> int search(E[] data, E target){

        /**
         * 补充下循环不变量，就是在每一轮循环条件开始时，这个条件时不变的（说了等于没说）
         * 在这个循环当中每次参与循环的时候data数组时不发生改变的
         * 循环体的目的：维持循环不变量
         *
         * 总结：
         * 写出正确的代码，一定要定义清楚循环不变量，维护循环不变量
         * 对于函数，定义清楚函数的功能
         *
         * 对于LinearSearch来说
         * 输入：数组和目标元素
         * 输出：目标元素所在的索引；若不存在，返回-1
         */
        for(int i = 0; i < data.length; i ++)
            if(data[i].equals(target))
                return i;

        return -1;
    }

    public static void main(String[] args){

        Integer[] data = {24, 18, 12, 9, 16, 66, 32, 4};

        int res = LinearSearch.search(data, 16);
        System.out.println(res);

        int res2 = LinearSearch.search(data, 666);
        System.out.println(res2);


        Student[] students = {new Student("Alice"),
                              new Student("Bobo"),
                              new Student("Charles")};
        Student bobo = new Student("Bobo");
        int res3 = LinearSearch.search(students, bobo);
        System.out.println(res3);
    }
}
