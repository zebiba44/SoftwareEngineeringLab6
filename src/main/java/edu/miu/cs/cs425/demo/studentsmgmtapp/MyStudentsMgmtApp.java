package edu.miu.cs.cs425.demo.studentsmgmtapp;

import java.time.LocalDate;
import java.util.Arrays;

import edu.miu.cs.cs425.demo.studentsmgmtapp.model.Students;

/**
 * Hello world!
 *
 */
public class MyStudentsMgmtApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       
        Students[] students= {
        	new Students(110001,"Dave",LocalDate.of(1951, 11, 18)),
        	new Students(110002,"Anna",LocalDate.of(1990,12, 07)),
        	new Students(110003,"Erica",LocalDate.of(1974,01,31)),
        	new Students(110004,"Carlos",LocalDate.of(2009,8, 22)),
        	new Students(110005,"Bob",LocalDate.of(1990,05, 03))
        };
        
        printSudents(students);
    }
    public static void printSudents(Students[] stu) {
    	Arrays.stream(stu).forEach(System.out::println);
    	
    }
}
