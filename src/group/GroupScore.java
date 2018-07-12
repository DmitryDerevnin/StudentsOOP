package group;

import java.util.Arrays;

public class GroupScore {

    private double groupScore;
    private int studentsA;
    private int studentsD;


    public void setGroupScore(double[][] studentScore) {
        double sum = 0;
        double countedRating = 0;
        for (int i =0; i<studentScore.length-1;i++){
            sum += Arrays.stream(studentScore[i]).sum();
            countedRating += Arrays.stream(studentScore[i]).count();
        }
        this.groupScore = sum/countedRating;
    }

    public double getGroupScore() {
        return groupScore;
    }


    public void setStudentsA(double[][] progress) {
        double sum = 0;
        double averageScore;
        int counter = 0;
        for (int i = 0; i<progress.length-1; i++){
            sum = Arrays.stream(progress[i]).sum();
            averageScore = sum /progress[i].length;

            if(averageScore>=5.0)
                counter++;
        }
        this.studentsA = counter;
    }

    public int getStudentsA() {
        return studentsA;
    }

    public void setStudentsD(double[][] progress) {
        double sum = 0;
        double averageScore;
        int counter = 0;
        for (int i = 0; i<progress.length-1; i++){
            sum = Arrays.stream(progress[i]).sum();
            averageScore = sum /progress[i].length;

            if(averageScore<3.0)
                counter++;
        }
        this.studentsD = counter;
    }

    public int getStudentsD() {
        return studentsD;
    }
}
