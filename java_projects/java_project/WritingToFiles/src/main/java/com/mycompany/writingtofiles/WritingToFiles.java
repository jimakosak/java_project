package com.mycompany.writingtofiles;
import java.io.*;

public class WritingToFiles{
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            out = new FileWriter("out.txt");
            for(long number : FibonacciNumbers()){
                out.write(String.valueOf(number));
            }
            out.close(); // close the output stream
        } catch (IOException e) {
            System.out.println("File IO Failed.");
        }
    }
    
    private static long[] FibonacciNumbers() 
    { 
        long[] fibNumbers = new long[50]; 
        fibNumbers[0] = 0; 
        fibNumbers[1] = 1; 
        for(int i = 2; i < 50; i++) 
        { 
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2]; 
        } 
        return fibNumbers; 
    }
}