package org.example.lesson2;

/*Создать студентов, у которых есть имя,средний балл
Создать преподавателя, у которого будет метод проставить автомат, если средний балл >= 4,5 то 5, если больше или равен 3,5 и меньше 4,5, то 4,
если меньше 3,5, то 3.
Метод должен принимать студента, на экран выводится имя студента, оценка.
 */
public class Main {
    public static void main(String[] args) {
        Student masha = new Student();
        masha.name = "Маша";
        masha.averageScore = 4.5f;
        Student oleg = new Student();
        oleg.name = "Олег";
        oleg.averageScore = 3.6f;
        Student igor = new Student();
        igor.name = "Игорь";
        igor.averageScore = 3.1f;
        Teacher teacher = new Teacher();
        teacher.name = "Александр Николаевич";
        teacher.ocenka(teacher,oleg);
    }

}
