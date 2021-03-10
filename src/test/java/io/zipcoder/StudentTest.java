package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StudentTest {

    @Test
    public void studentConstructorTest1() {
        //given
        Student jack = new Student("Jack", "Torrance",null);

        //when
        String output = jack.getFirstName();
        //then
        Assert.assertTrue(output == "Jack");
    }


    @Test
    public void studentConstructorTest2() {
        //given
        ArrayList<Double> jacksGrades = new ArrayList<Double>();
        jacksGrades.add(57.0);
        jacksGrades.add(34.0);
        jacksGrades.add(62.0);
        jacksGrades.add(55.0);
        Student jack = new Student("Jack", "Torrance",jacksGrades);

        //when
        String output = jack.getLastName();
        //then
        Assert.assertTrue(output == "Torrance");
    }


    @Test
    public void studentConstructorTest3() {
        //given
        ArrayList<Double> jacksGrades = new ArrayList<Double>();
        jacksGrades.add(57.0);
        jacksGrades.add(34.0);
        jacksGrades.add(62.0);
        jacksGrades.add(55.0);
        Student jack = new Student(null, null,jacksGrades);

        //when
        Integer output = jack.getnumberOfExamsTaken();
        //then
        Assert.assertTrue(output == 4);
    }

    @Test
    public void printExamScoresTest() {
        ArrayList<Double> jacksGrades = new ArrayList<Double>();
        jacksGrades.add(57.0);
        jacksGrades.add(34.0);
        jacksGrades.add(62.0);
        jacksGrades.add(55.0);
        Student jack = new Student(null, null,jacksGrades);

        //when
        String output = jack.getExamScores();
        //then
        Assert.assertEquals("Exam 1 -> 57.0\nExam 2 -> 34.0\nExam 3 -> 62.0\nExam 4 -> 55.0", output);

    }

    @Test
    public void addExamScoreTest() {
        //given
        Student jason = new Student("jason", "vorhees", new ArrayList<>());
        //when
        jason.addExamScore(100.0);
        String output = jason.getExamScores();

        //then
        Assert.assertEquals(output, "Exam 1 -> 100.0");
    }

    @Test
    public void setExamScoreTest() {
        //given
        Student freddy = new Student("freddy", "krueger", new ArrayList<>());
        freddy.addExamScore(100.0);
        freddy.setExamScores(0,24.0);

        //when
        String output = freddy.getExamScores();

        //then
        Assert.assertEquals(output, "Exam 1 -> 24.0");
    }

    @Test
    public void averageOfGradesTest() {
        ArrayList<Double> normansGrades = new ArrayList<Double>();
        normansGrades.add(72.0);
        normansGrades.add(91.0);
        normansGrades.add(82.0);
        normansGrades.add(87.0);
        Student norman = new Student("norman", "bates",normansGrades);

        //when
        String output = norman.getAverageExamScore();
        //then
        Assert.assertEquals("\\`\\`\\`\n 83.0\n\\`\\`\\`", output);

    }

    @Test
    public void studentSummaryTest() {
        ArrayList<Double> normansGrades = new ArrayList<Double>();
        normansGrades.add(72.0);
        normansGrades.add(91.0);
        normansGrades.add(82.0);
        normansGrades.add(87.0);
        Student norman = new Student("Norman", "Bates",normansGrades);

        //when
        String output = norman.toString();
        //then
        Assert.assertEquals(output, output);

    }
}