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
import java.text.DecimalFormat;

public class GpaCalculator {
    ArrayList<Object> arr;
    
    public GpaCalculator(ArrayList<Object> arry){
        this.arr = arry;
    }
    
    public String TotalGradeUnit(){
        double TotalUnit = 0;
        double TotalQualityPoint = 0;
        double Gpa;
        for (int i = 3 ; i < this.arr.size(); i += 4){
           int k = (int)this.arr.get(i);
           int z = (int)this.arr.get(i - 2);
           TotalUnit +=  k;
           TotalQualityPoint += (k * z);
        }
        Gpa = TotalQualityPoint / TotalUnit;
        String RoundedGpa = String.format("%.2f", Gpa);
        return RoundedGpa;
    }
}
