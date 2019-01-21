/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDemo;
import java.util.Scanner;
/**
 *
 * @author John
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //char [] pillbox = {'w','e','e','k','e','n','d'};
        
        /**
        for (int i=pillbox.length-1; i>=0; i--){
            System.out.print(pillbox[i]);
        }
        */
        
        System.out.println("enter a word");
        String word = input.next();
        char [] arr1 = new char [word.length()];
        
        for (int j = 0; j < arr1.length; j++){
            arr1[j] = word.charAt(j);
        }
        
        for (int k = arr1.length-1; k>=0; k--){
           System.out.print(arr1[k]); 
        }
        
    }
    
}
