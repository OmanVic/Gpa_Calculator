/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gradecalculator;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class GradeCalculator {

    public static void main(String[] args) {
        ArrayList<Object> StudentDataBase = new ArrayList<Object>();
        StudentInput cal = new StudentInput(StudentDataBase);
        boolean MoreSubject = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Name of Student:");
        String StudentName = input.next();
        
        while(MoreSubject){
//             texting my codes here 
       cal.StudentScore();
       System.out.println("Type Y if you want to add the data for another course. type any other button to discontinue this compilation");
       String Answer = input.next();
       MoreSubject = Answer.toLowerCase().equals("y");
        }
        System.out.print("|.................|.................|.................|.................|\n");
        System.out.print("|  COURSE & CODE  |  COURSE UNIT    |    GRADE        |     GRADE-UNIT  |\n");
        System.out.print("|.................|.................|.................|.................|\n");
        
        int Count = 0;
        
        for (Object element : StudentDataBase){
            System.out.print("|  ");
            System.out.printf("%-" + 15 + "s", element.toString());
            
            Count += 1;
            
            if ( Count == 4){
                System.out.print("|\n");
                
                Count = 0;
            }
            
        }
        System.out.print("|.................|.................|.................|.................|\n");
        GpaCalculator GpCal = new GpaCalculator(StudentDataBase);
        String Gpa = GpCal.TotalGradeUnit();
        System.out.print("Your GPA is = " + Gpa + " to 2 decimal places");
    }
}
