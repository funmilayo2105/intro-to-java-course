package com.cbfacademy;

public class Year {

    public static Boolean isLeapYear(int year) {
        if (year % 400 ==0){
           
            return true;

        } else if  (year % 100 ==0){
        return false;     
        }  

        else if (year % 4 ==0){
            return true;
        }
        return true;
    }}

    


