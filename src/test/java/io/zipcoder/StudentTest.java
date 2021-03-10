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
        System.out.println(output);
        Assert.assertEquals("Exam 1 -> 57.0\nExam 2 -> 34.0\nExam 3 -> 62.0\nExam 4 -> 55.0", output);

    }
}