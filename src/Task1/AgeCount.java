/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Task1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Mochamad Brilian Bani Adam
 * 22104410048
 */
public class AgeCount {

    

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2000, 05, 12);
        LocalDate currentDate = LocalDate.now();
        int age = calculateAge(birthDate, currentDate);
        System.out.println("You are " + age + " years old.");
    }

    public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
    }
}


