package org.example.lesson2;

public class Teacher {
    String name;

    public void ocenka(Teacher teacher, Student student) {
        if (student.averageScore >= 4.5f) {
            System.out.println(teacher.name + " поставил студенту " + student.name + " оценку 5.");
        } else if (student.averageScore >= 3.5f && student.averageScore<=4.5f) {
            System.out.println(teacher.name + " поставил студенту " + student.name + " оценку 4.");
        } else if (student.averageScore <= 3.5f) {
            System.out.println(teacher.name + " поставил студенту " + student.name + " оценку 3.");
        }
    }
}