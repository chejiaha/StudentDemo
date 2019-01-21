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
public class TestStudent {
    
    public static void main (String[] args){
        Student s1 = new Student (11, "john");
        Student s2 = new Student ();
        
        System.out.println("Name of s2:"+s2.getStudName());
        s2.setStudName("John Chen");
        System.out.println("After set method "+s2.getStudName());
    }
    
}
