/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Task1;

/**
 *
 * @author Mochamad Brilian Bani Adam
 * 22104410048
 */
public class Calculator {
  
    private double result;
    
    public Calculator() {
        result = 0;
    } 
    public double getResult() {
        return result;
    } 
    public void add(double num) {
        result += num;
    }
    public void subtract(double num) {
        result -= num;
    }
    public void multiply(double num) {
        result *= num;
    }
    public void divide(double num) {
        if (num != 0) {
            result /= num;
        } else {
            System.out.println("Error: division by zero.");
        }
    }
    
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5);
        calc.multiply(2);
        System.out.println("Result: " + calc.getResult());
    }
}


