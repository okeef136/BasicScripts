/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author lildocta
 */
public class StudentQuizGrades {
    public static void main(String[] args) {
        //Initialize a hashmap called grades key = name, value = student object
        HashMap<String, Student> grades = new HashMap<>();
        ConsoleIO cio = new ConsoleIO();
        int sum = 0;
        String answer = "yes";
        
        //Student Object Creator
        do
        {
            cio.print("Main Menu:\n========");
            cio.print("1) Add new student(s)");
            cio.print("2) Delete student(s)");
            cio.print("3) List students and scores");
            cio.print("4) Get Average of student");
            cio.print("5) Quit Program");
            int choice = cio.intInp("Selection\n========");
            cio.print("");
            switch(choice)
            {
            case 1:
                int numStud = cio.intInp(0, 10, "How many students would you like to add scores for?");
                for (int i = 0; i < numStud; i++)
                {
                String studentName = cio.scanPrint("Name of Student:");
                
                //Creates an array list using the ScoreArray method outlined in the Student Class
                ArrayList<Integer> scores = Student.ScoreArray();
                for (int j = 0; j < scores.size(); j++)
                {
                    int score = scores.get(j);
                    sum = sum + score;
                }
                double average = sum / scores.size();
                
                //Adds key and value to hashmap grades
                grades.put(studentName, new Student(studentName, scores, average));
                };
                break;
                
            case 2:
                //Student Deleter
                String answer2 = cio.scanPrint("Would you like to delete a student?").toLowerCase();
                while (answer2.equals("yes"))
                {
                    String studDelete = cio.scanPrint("What is the name of the student you want to delete?");
                    grades.remove(studDelete);
                    answer2 = cio.scanPrint("Would you like to delete another student?").toLowerCase();
                };
                break;
                
            case 3:
                //Prints off a list of all the students and an array of their scores
                for(String n: grades.keySet()) 
                {
                    cio.print(n + " : " + grades.get(n).scores);      
                }
                cio.print("");
                ;
                break;
                
            case 4:
                do
                {
                    String studAver = cio.scanPrint("Whos average would you like to see?");
                    cio.print("Average Score\n========\n" + String.valueOf(grades.get(studAver).average + "\n========"));
                    String temp = cio.scanPrint("Would you like to get the average of another student?");
                    answer = temp.toLowerCase();
                } while (answer.equals("yes"));
                answer = "yes";
                break;
                
            case 5:
                answer = "quit"; 
                break;
            }
            
        } while (answer.equals("yes")); 
    }
}
    