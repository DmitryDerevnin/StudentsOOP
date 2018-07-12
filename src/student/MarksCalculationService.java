package student;

import java.util.Arrays;

public class MarksCalculationService {
    private double average_score;

    public void setAverage_score(double average_score) {
        this.average_score = average_score;
    }

    public double getAverage_score() {
        return average_score;
    }

    public double calculateAverageScore(double[] progress){
        double result;
        double sum = Arrays.stream(progress).sum();
        return result = sum /progress.length;
    }
}
