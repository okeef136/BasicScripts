
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lildocta
 */
public class Student {
    
    private String student;
    public ArrayList<Integer> scores;
    public double average;
    private double sum = 0;

    //Student Constructor
        public Student(String student, ArrayList<Integer> scores, double average) 
        {
            this.student = student;
            this.scores = scores;
            this.average = average;
            
        }

    /**
     * @return the student
     */
    public String getStudent() {
        return student;
    }

    /**
     * @return the scores
     */
    public ArrayList<Integer> getScores() {
        return scores;
    }

    /**
     * @param scores the scores to set
     */
    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    //# of scores and score entering method
    public static ArrayList<Integer> ScoreArray()
    {
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        
        System.out.println("How many scores would you like to enter?");
        int num = kb.nextInt();
        int grade;
        for (int i = 0; i < num; i++)
        {
           System.out.println("What is the students grade?");
           grade = kb.nextInt();
           scores.add(grade);
           
        }
        return scores;
    }
}
