package self.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparator_Element {

    private static class Student{
        private String name;
        private String phone;
        private int age;

        public Student(String name, String phone, int age) {
            this.name = name;
            this.phone = phone;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        String helloworld = "G432432";
        String str = helloworld.substring(2,6)+ helloworld.substring(12,3);
        //Create a lIst of 5 students
        List<Student> studentList = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            Student st = new Student("Amredra"+i, "1234"+i , 20-i);
            studentList.add(st);
        }

        List<Student> sortedByAge = studentList.parallelStream().sorted(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.age - s2.age;
            }
        }).collect(Collectors.toList());

        System.out.println(sortedByAge);

    }

}
