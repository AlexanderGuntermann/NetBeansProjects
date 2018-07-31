/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgrades;

/**
 *
 * @author alexguntermann
 */
public class SSN {
    double range;
    double avgOf4;
    
  
    String letterGrade;

    String distinction;

    String name;

    double grade1, grade2, grade3, grade4;

    double average;

//    String social;

    char[] socialNums = new char[9];

    public SSN(String name, String social, double grade1, double grade2, double grade3,
            double grade4) {

        this.name = name;
        this.socialNums = social.toCharArray();
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        distinction();
        average();
        range();
        letterGrade();
    }

    public String getName() {
        return name;
    }
//
//    public String getSocial() {
//        return social;
//
//    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;

    }

    public double getGrade3() {
        return grade3;
    }

    public double getGrade4() {
        return grade4;

    }

    public void setName(String name) {
        this.name = name;

    }

//    public void setSocial(double social) {
//        this.social = social;
//    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;

    }

    public void setGrade4(double grade4) {
        this.grade4 = grade4;

    }

    public String toString() {
        String format = "%-15s%-15s%12.1f%10s%15s%10.1f";
        
//        return name +""+ (new String(socialNums))+""+ String.format("%1$,.1f",avgOf4) +""+ letterGrade + ""+ distinction + ""+ String.format("%1$,.1f",range);
         return String.format(format,name, (new String(socialNums)), avgOf4,letterGrade,distinction, range);
    }

    public void average() {
        avgOf4 = (((grade1 + grade2 + grade3)/3) * .60) + (grade4*.4);
        

    }

    public void distinction() {
        if (avgOf4 >= 85) {
            distinction = "YES";
        } else {
            distinction = "NO";
        }

    }

    public void range() {

//        double smallest = 0;
//        if (grade1 < grade2) {
//            smallest = grade1;
//        } else {
//            smallest = grade2;
//        }
//        if (grade3 < smallest) {
//            smallest = grade3;
//        }
//        if (grade4 < smallest) {
//            smallest = grade4;
//
//            double largest = 0;
//            if (grade1 > grade2) {
//                largest = grade1;
//
//            } else {
//                largest = grade2;
//            }
//
//            if (grade3 > largest) {
//                largest = grade3;
//            }
//            if (grade4 > largest) {
//                largest = grade4;
//            }

            double grades[] = {grade1, grade2, grade3, grade4};
            double min = 100, max = 0;
            for (int i = 0; i < 4; i++) {
                if (grades[i] < min) {
                    min = grades[i];
                }
                if (grades[i] > max) {
                    max = grades[i];
                }
                
                
            }
            range = max - min;

        }
    public void letterGrade (){
        if(avgOf4 > 90){
            letterGrade = "A";
           
        } else if(avgOf4 > 80 && avgOf4 < 90){
        letterGrade = "B";
        } else if(avgOf4 > 70 && avgOf4 < 80 ){
            letterGrade = "C";
        } else if(avgOf4 > 60 && avgOf4 < 70){
            letterGrade = "D";
        } else if(avgOf4 < 60){
            letterGrade = "F";
    }
    }

    }

