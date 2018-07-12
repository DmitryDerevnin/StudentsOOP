package group;
import student.*;

public class Group {
    private Student[] students;



    public void setStudents(int index, Student student) {
        this.students[index] = student;
    }

    public Student[] getStudents() {
        return students;
    }


    public void fillGroup(Student[] students){
        this.students = students;
    }



}
