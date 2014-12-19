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
public class BubbleSort {
    public static void main(String[] args){
        //program for bubble sort
        System.out.println("Enter the number of elements");
        Scanner input = new Scanner(System.in);
        int numInput = input.nextInt();
        int[] array = new int[numInput];
        for(int i = 0; i < numInput; ++i){
            array[i] = input.nextInt();
        }
        for(int i = 0; i < numInput - 1; ++i){
            for(int j = 0; j < numInput - i - 1; ++j){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //printing sorted array
        for(int i = 0; i < numInput; ++i){
            System.out.print(array[i] + "\t");
        }
        
    }
}
