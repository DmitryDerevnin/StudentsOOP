package data;

public class TestData {
    private double[][] ratingOfEachStudent = {{5,5,5,5,5,5,5,5,5,5},
            {4,2,3,4,4,3,5,4,5,3},
            {4,3,2,2,3,2,4,2,3,3},
            {5,4,3,5,3,4,5,5,4,5}};

    private String[] students = {"Ivanov","Petrov", "Sidorov", "Semyonov"};

    public double[][] getRatingOfEachStudent() {
        return ratingOfEachStudent;
    }

    public String[] getStudents() {
        return students;
    }
}
