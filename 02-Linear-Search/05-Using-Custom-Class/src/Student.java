public class Student {

    private String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object student){
        /**
         * 判断流程
         * 1. 首先判断这个类的对象是否就是对象本身
         * 2. 对象是否为空对象
         * 3. 判断是否是同一个类
         */

        if(this == student)
            return true;

        if(student == null)
            return false;

        if(this.getClass() != student.getClass())
            return false;

        Student another = (Student)student;
        return this.name.equals(another.name);
    }
}
