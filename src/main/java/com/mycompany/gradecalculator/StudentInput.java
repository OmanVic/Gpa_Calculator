/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gradecalculator;
import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author USER
 */
public class StudentInput {
    public int Score;
    public int Unit;
    public String CourseName;
    public ArrayList<Object>arr;
    
    
    public StudentInput(ArrayList<Object> arr){
        this.arr =  arr;
    }
    
    Scanner input = new Scanner(System.in);
    
// This method daels with the users input data. It returns an arraylist  
    
    public ArrayList<Object> StudentScore(){
        
//        Ask the user for the namse of his/ her course and save it in an arraylist arr.
        
        System.out.println("What is the name of the course");
        this.CourseName = input.nextLine();
        
        arr.add(this.CourseName);
        
        
//     The user is ask about the unit of the course he specified. 
        
        System.out.println("What is your Course Unit");
        
        
        
        boolean IsValid = false;
        
//    We check the user input if there is any error. if error exist, we catch the error

        do{
            try{
                IsValid = true;
               
                this.Unit = input.nextInt();
            }
            catch (Exception e){
                
//      The user is told that he entered an invalid input. The option of  entering a new input or ending the program is given to the user

                System.out.println("You entered a invalid Course Unit, Press Y to enter a valid COURSE UNIT. press any other key to end process");
                input.next();
                String UnitAnswer = input.next();
                
        
                
                if (UnitAnswer.toLowerCase().equals("y")){
                    IsValid = false;
                    System.out.println("What is your Course Unit");
                }
                else{
                    System.exit(0);
                }
            }
        }while(!IsValid);
        
//      The Course unit is added to the array

        arr.add(Unit);
        
//      The user is asked to input his/her score
        
        
        System.out.println("What is your score");
        
         
        int TestScore = input.nextInt();
        
//       The user score is vaidated to check if it is above 100 or less than 0. The user is allowed to make a choice to end the program or to input a new score if score is less than zero or greater than 100.

        while (TestScore > 100 || TestScore < 0){
            System.out.println("You have entered an incorrect score, press Y to enter valid score or press any key to exit the program");
            String UserAnswer = input.next();
            if (UserAnswer.toLowerCase().equalsIgnoreCase("y")){
                System.out.println("Please Enter Your Correct Score");
                TestScore = input.nextInt();
            }
            else{
                System.out.println("Thank you for using GPA CALCULATOR");
                System.exit(0);
            }
        }
         this.Score = TestScore;
         
         input.nextLine();
        
//       A new method ScoreToGrade from the GradingLogic Class is called on.
        
        GradingLogic Grade = new GradingLogic(arr, this.Score, this.Unit);
        
        Grade.ScoreToGrade();
        
        return arr;
    }
}

