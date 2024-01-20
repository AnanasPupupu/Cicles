package org.example.lesson2;

public class Student {
    private String name;
    private float averageScore;

    public Student(String name, float averageScore) {
        this.name = name;
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ("".equals(name) || name != null) {
            System.out.println("Введите имя");
        } else {
            this.name = name;
        }
    }

    public float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(float averageScore) {
        if (averageScore >= 0.0f && averageScore <= 5.0f) {
            this.averageScore = averageScore;
        } else {
            System.out.println("Введите число от 0.0 до 5.0");
        }
    }
}


