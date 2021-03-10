package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

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

}
