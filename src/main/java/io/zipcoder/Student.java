package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<>();


    public Student (String newFirstName, String newLastName, ArrayList<Double> newExamScores) {
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.examScores = newExamScores;
    }

    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getnumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        String formattedGrades = "";
        for (int i = 0; i < this.examScores.size(); i++) {
            formattedGrades += "Exam " + (i+1) + " -> " + this.examScores.get(i);
            if (i < this.examScores.size()-1) {
                formattedGrades += "\n";
            }
        }
        return formattedGrades;
    }

    public void addExamScore(double examScore) {
        this.examScores.add(examScore);
    }

    public void setExamScores(int examNumber, double newScore) {
        this.examScores.set(examNumber, newScore);
    }

    public String getAverageExamScore() {
        double sumOfGrades = 0;

        for (Double grade : this.examScores) {
            sumOfGrades += grade;
        }

        double averageOfGrades = sumOfGrades / this.examScores.size();
        //String output = "\\`\\`\\`\n" + averageOfGrades + "\n\\`\\`\\`";
        String border = "\\`\\`\\`";
        String output = String.format("%s\n %.1f\n%s", border,averageOfGrades,border);
        return output;
    }

    @Override
    public String toString() {
        String border = "\\`\\`\\`";

        double sumOfGrades = 0;
        for (Double grade : this.examScores) {
            sumOfGrades += grade;
        }
        double averageOfGrades = sumOfGrades / this.examScores.size();

        String formattedGrades = "";
        for (int i = 0; i < this.examScores.size(); i++) {
            formattedGrades += "    Exam " + (i+1) + " -> " + this.examScores.get(i);
            if (i < this.examScores.size()-1) {
                formattedGrades += "\n";
            }
        }

        String output = String.format("%s\nStudent Name: %s %s\n> Average Score: %s\n> Exam Scores:\n%s\n%s"
                , border, this.getFirstName(), this.getLastName(), averageOfGrades, formattedGrades, border);

        return output;
    }
}
