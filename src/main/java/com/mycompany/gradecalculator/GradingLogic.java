/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gradecalculator;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class GradingLogic {
    ArrayList<Object> arr;
    public int Score;
    public char ScoreGrade;
    public int GradeUnit;
    public int Unit;
    public String CourseName; 
    
    public GradingLogic(ArrayList<Object>arr, int Score, int Unit){
        this.arr = arr;
        this.Score = Score;
        this.Unit = Unit;
    }
    
//    This method determines the Grade and the Grade Unit of the score the user inputed in the StudentInput class. It returns an arraylist
    public ArrayList<Object>ScoreToGrade(){
        
        if(this.Score >= 70 && this.Score <= 100){
            this.ScoreGrade = 'A';
            this.GradeUnit = 5;
        }
        else if(this.Score >= 60 && this.Score <= 100){
            this.ScoreGrade = 'B';
            this.GradeUnit = 4;
        }
        else if(this.Score >= 50 && this.Score <= 100){
            this.ScoreGrade = 'C';
            this.GradeUnit = 3;
        }
        else if(this.Score >= 45 && this.Score <= 100){
            this.ScoreGrade = 'D';
            this.GradeUnit = 2;
        }
        else if(this.Score >= 40 && this.Score <= 100){
            this.ScoreGrade = 'E';
            this.GradeUnit = 1;
        }
        else if(this.Score >= 0 && this.Score <= 39){
            this.ScoreGrade = 'F';
            this.GradeUnit = 0;
        }
        
        arr.add(this.ScoreGrade);
        arr.add(this.GradeUnit);
        
        return arr;
    }
    
}

