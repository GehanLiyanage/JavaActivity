package oop;


class students {
    String name;
    String school;
    int grade;
    int age;
    int marks;

    students(String name, String school, int grade, int age, int marks) {
        this.name = name;
        this.school = school;
        this.grade = grade;
        this.age = age;
        this.marks = marks;
    }
}

    class gehan extends students{
        int average;
        gehan(String name, String school, int grade, int age, int marks, int average){
            super(name, school, grade, age, marks);
            this.average = average;
        }
    }

public class supers {

    public static void main(String[] args) {
        gehan obj = new gehan("Gehan", "Nalanda", 13, 21, 75, 56);
        System.out.println(obj.name);
        System.out.println(obj.school);
        System.out.println(obj.grade);
        System.out.println(obj.age);
        System.out.println(obj.marks);
        System.out.println(obj.average);
    }
}
