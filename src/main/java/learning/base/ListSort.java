package learning.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author Lin JingHui
 * @Date 2019/3/27
 */

public class ListSort<E> {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();

        // 创建3个学生对象，年龄分别是20、19、21，并将他们依次放入List中
        Student s1 = new Student();
        s1.setAge(20);
        s1.setUsable(true);
        Student s2 = new Student();
        s2.setAge(19);
        s2.setUsable(true);
        Student s3 = new Student();
        s3.setAge(21);
        s3.setUsable(false);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println("排序前：" + list);
        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                // 按照学生的年龄进行升序排列
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });

        System.out.println("升序排序后：" + list);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {

                // 按照学生的年龄进行降序排列
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        });

        System.out.println("降序排序后：" + list);

        Boolean b1 = true; // 创建Boolean对象1

        Boolean b2 = false; // 创建Boolean对象0

        Boolean b3 = true; // 创建Boolean对象1
        System.out.println(b1);

        int i;

        i = b1.compareTo(b2); // b1和b2进行比较

        System.out.println(i);//1-0

        i = b2.compareTo(b1); // b2和b1进行比较

        System.out.println(i);//0-1

        i = b1.compareTo(b3); // b1和b3进行比较

        System.out.println(i);//1-1
    }
}

class Student{

    private int age;

    private Boolean isUsable;

    public int getAge() {
        return age;
    }

    public Boolean isUsable() {
        return isUsable;
    }

    public void setUsable(Boolean isUsable) {
        this.isUsable = isUsable;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return getAge()+"";
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
//        list.add(2);
//        list.add(5);
//        list.add(7);
        System.out.println(list.subList(0, 3));
    }
}