import java.util.Objects;

/**
 * 作业 - 设计一个Student类（在下一个包里有）
 * @author xiaoweii
 * @create 2024-12-22 20:25
 */
public class Student {

    // 姓名
    private String name;
    // 年龄
    private Integer age;
    //班级
    private String clazz;

    public Student() {
    }

    public Student(String name, Integer age, String clazz) {
        this.name = name;
        this.age = age;
        this.clazz = clazz;
    }

    @Override
    public boolean equals(Object stu) {
        if (stu == null || getClass() != stu.getClass()) return false;
        Student student = (Student) stu;
        return Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(clazz, student.clazz);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, clazz);
    }

    public static void main(String[] args) {
        Student stu1 = new Student("熊大", 3, "三年二班");
        Student stu2 = new Student("熊二", 2, "三年二班");
        Student stu3 = new Student("光头强", 27, "五年六班");
        Student stu4 = new Student("吉吉国王", 1, "一年一班");
        Student[] students = {stu1, stu2, stu3, stu4};
        System.out.println("LinearSearch.search(students,stu1) = " + LinearSearch.search(students, stu2));
        System.out.println("LinearSearch.search(students,stu4) = " + LinearSearch.search(students, stu4));
        System.out.println("LinearSearch.search(students,new Student()) = " + LinearSearch.search(students, new Student()));

    }
}
