import java.util.Arrays;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class studentSort {
    public static void main(String[] args){
        System.out.println("Enter the number of students");
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();
        System.out.println("Enter the student names");
        String[] studentNames = new String[numOfStudents];
        for(int i = 0; i < numOfStudents ; i++){
            studentNames[i] = input.nextLine();
        }
        System.out.println("Enter the student scores matching order of their names");
        double[] scoreStudents = new double[numOfStudents];
        for(int i = 0; i < numOfStudents; ++i){
            scoreStudents[i] = input.nextDouble();
        }
        for(int i = 0; i < numOfStudents; i++){
            int max = i;
            for(int j = i; j < numOfStudents; ++j){
                if(scoreStudents[max] < scoreStudents[j]){
                    max = j;
                }
             
            }
               double temp;
               String tempStr;
                temp = scoreStudents[i];
                tempStr = studentNames[i];
                studentNames[i] = studentNames[max];
                scoreStudents[i] = scoreStudents[max];
                studentNames[max] = tempStr;
                scoreStudents[max] = temp;
        }
        for(int i = 0; i < numOfStudents; i++)
            System.out.println("Student name is " + studentNames[i] + " and score is " + scoreStudents[i]);
}
}
