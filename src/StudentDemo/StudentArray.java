/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDemo;

/**
 *
 * @author John
 */
public class StudentArray {
    public static void main (String []args){
    char [] letters = new char [7];
    Student [] studentArray = new Student [3]; // 3 objects of student array
    
    Student s1 = new Student (1, "John Chen");
    studentArray [0] = s1;
    
    Student s2 = new Student (2, "Bob");
    studentArray [1] = s2;
    
    studentArray[2] = new Student (3, "Tim");
    
    for (int i = 0; i< studentArray.length; i++){
        System.out.println("Name of student at index "+(i)+"is: "+
                studentArray[i].getStudName());
    }
    
    }
}
