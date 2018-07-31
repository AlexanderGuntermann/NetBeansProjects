/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrades;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class StudentGrades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(new FileReader("input.txt"));

//        char[] nameArray = new char[10];
 System.out.println("NAME           SSNUMBER              AVERAGE      GRADE    DISTINCTION  RANGE     \n" +
"*****************************************************************************");
//         nameArray [] = inFile.();
        while (in.hasNext()) {
            String name = in.next();
            String ssNum = in.next();
            double gradeA = in.nextDouble();
            double gradeB = in.nextDouble();
            double gradeC = in.nextDouble();
            double gradeD = in.nextDouble();
            
            SSN student1 = new SSN(name, ssNum, gradeA, gradeB, gradeC, gradeD);
        
           
            System.out.println(student1.toString());
                
            
                    
            
        
            }
        
        

    }

}
