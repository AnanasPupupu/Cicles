package org.example.lesson2;

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            System.out.println("Введите имя");
        }
    }

    public void ocenit(Teacher teacher, Student student) {
        if (student.getAverageScore() >= 4.5f) {
            System.out.println(teacher.name + " поставил студенту " + student.getName() + " оценку 5.");
        } else if (student.getAverageScore() >= 3.5f && student.getAverageScore() <= 4.5f) {
            System.out.println(teacher.name + " поставил студенту " + student.getName() + " оценку 4.");
        } else if (student.getAverageScore() <= 3.5f) {
            System.out.println(teacher.name + " поставил студенту " + student.getName() + " оценку 3.");
        }
    }
}