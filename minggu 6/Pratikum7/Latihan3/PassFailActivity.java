package Latihan3;

public class PassFailActivity extends GradedActivity {

    double minPassingScore;

    public PassFailActivity(double min) {
        minPassingScore = min;
    }

    public char getGrade() {
        char letterGrade;

        if (super.getScore() >= minPassingScore)
            letterGrade = 'P';
        else
            letterGrade = 'F';

        return letterGrade;
    }
}

