import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sotel
 */
public class Student {
    
    // comments added from git hub for pull operation
    
    // comments added for fetch and push
    private int studentId;
    private String studentName;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static void main(String[] args) {
        
        System.out.println("Enter a word >");
        
        Scanner scan = new Scanner(System.in);
        String userWord = scan.next();
        
        char[] wordLetter = new char[userWord.length()]; // Use length method for String
        
        for (int i = 0; i < wordLetter.length; i++) { // wordLetter is a property of an array, how long the array is
            wordLetter[i] = userWord.charAt(i);
        }
        
        for (int i = 0; i < wordLetter.length; i++) { 
            System.out.println(wordLetter[i]);
        }
        
        System.out.println("Printing in reverse order...");
        
        for (int i = wordLetter.length -1; i >= 0; i--) { 
            System.out.println(wordLetter[i]);
        }
    
    }
    
}
