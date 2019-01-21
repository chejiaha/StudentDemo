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
public class Student {
    private int studId;
    private String studName;
    
public Student (){
    studId = 0;
    studName = "N/A";
}

public Student (int studId, String studName){
    this.studId = studId;
    this.studName = studName;
    }

    
public int getStudentId(){
    return studId;
}

public void setStudId(int givenStudId){
    studId = givenStudId;
}

public String getStudName(){
    return studName;
}

public void setStudName(String givenStudName){
    studName = givenStudName;
}
}


