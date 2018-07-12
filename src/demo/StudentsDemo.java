package demo;
import group.*;
import data.TestData;
import student.*;
public class StudentsDemo {

    public void test(){
        Group group = new Group();
        TestData data = new TestData();
        GroupScore groupScore = new GroupScore();

        Student[] studentsArray = new Student[data.getStudents().length];
        for(int i =0; i<data.getStudents().length-1; i++)
            studentsArray[i] = new Student(data.getStudents()[i],
                    data.getRatingOfEachStudent()[i]);

        group.fillGroup(studentsArray);



        groupScore.setGroupScore(data.getRatingOfEachStudent());
        System.out.println("Средний балл группы: " + groupScore.getGroupScore());


        MarksCalculationService studentAverageScore = new MarksCalculationService();
        System.out.println("Средний балл студента: " +
                studentAverageScore.calculateAverageScore(group.getStudents()[2].getProgress()));


        groupScore.setStudentsA(data.getRatingOfEachStudent());
        System.out.println("Всего отличников: " + groupScore.getStudentsA());

        groupScore.setStudentsD(data.getRatingOfEachStudent());
        System.out.println("Всего двоечников: " + groupScore.getStudentsD());
    }
}
