package io.zipcoder;

public class Classroom {

    private Student[] students;

    public Classroom(int maxNumberofStudents, Student[] students) {
        this.students = new Student[maxNumberofStudents];
        for (int i = 0; i > maxNumberofStudents; i++) {
            this.students[i] = students[i];
        }

    }

    public Classroom() {
        this.students = new Student[30];
    }


    public Student[] getStudents() {
        return students;
    }

    public Integer getAverageScore() {
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
    }
}
