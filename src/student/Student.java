package student;

public class Student {
    private String name;
    private double[] progress;


    public Student(String surname, double[] progress){
        this.name = name;
        String surname1 = surname;
        this.progress = progress;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setProgress(double[] progress) {
        this.progress = progress;
    }

    public double[] getProgress() {
        return progress;
    }

    public String getName() {
        return name;
    }
}
