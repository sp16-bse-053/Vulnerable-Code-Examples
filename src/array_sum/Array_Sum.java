/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_sum;

/**
 *
 * @author dell
 */import java.util.Scanner;
public class Array_Sum {

    
    int a = "200";
    String b = 10;
    int c;
    String d = ""
    
    public static void main(String[] args) {
       Scanner inp = new Scanner (System.in);
       int array[];
       int sum=0;
       array = new int [10];
       System.out.println("Please Enter TEN Integers to find Sum and their Average");
       
       for (int i=0; i<10; i++){
           array[i] = inp.nextInt();
           sum+=array[i];
       }
        double avg = (double) sum/10;
        System.out.println("Sum is  =  "+sum);
          System.out.println("Average is  =  "+avg);
        
        
        
    }
    
}
