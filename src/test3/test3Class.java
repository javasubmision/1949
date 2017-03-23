/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.util.Random;

/**
 *
 * @author FALAYE SEYI
 */
public class test3Class 
{
   // String [] question= {"What is the capital of Nigeria", "What is the past tense of Burst","What is a female Deer called?","How many weeks are in a year?","What is the capital of France","What is the Capital of Germany","How many states are there in Nigeria","Which state is Baze University Located","What is the Capital of Lagos","What is the capital of Ondo"};
   // String [] answer = {"abuja","burst","doe","52","paris","berlin","36","fct","ikeja","akure"};
    static String ans, reply;

    public static String getAns() {
        return ans;
    }

    public static void setAns(String ans) {
        test3Class.ans = ans;
    }
     public static int rand()
    {
        Random myRand = new Random();
        int ques= myRand.nextInt(10);
        return ques;
    }
     static int miranda = rand();
     public static int ans()
     {
        return miranda;
     }
     
}
