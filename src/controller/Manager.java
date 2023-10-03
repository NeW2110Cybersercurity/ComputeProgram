/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import static common.Validation.checkInputDouble;
import static common.Validation.checkInputOperator;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Manager {

    private static final Scanner in = new Scanner(System.in);

    

    //allow user input number
    public static double inputNumber() {
        System.out.print("Enter number: ");
        double number = checkInputDouble();
        return number;
    }

    //allow user calculator normal
    public static void normalCalculator() {
        
        double memory = 0.0;
        System.out.print("Enter number: ");
        memory = checkInputDouble();
        while (true) {
            System.out.print("Enter operator: ");
            String operator = checkInputOperator();
            
            switch (operator) {
                case "+":
                    memory += inputNumber();
                    break;
                case "-":
                    memory -= inputNumber();
                    break;
                case "*":
                    memory *= inputNumber();
                    break;
                case "/":
                    memory /= inputNumber();
                    break;
                case "^":
                    memory = Math.pow(memory, inputNumber());
                    break;
                case "=":
                    System.out.println("Result: " + memory);
                    return;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            System.out.println("Memory: " + memory);
        }

    }

    //display result BMI status
    public static String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "Under-standard.";
        } else if (bmi >= 19 && bmi < 25) {
            return "Standard.";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight.";
        } else if (bmi >= 30 && bmi < 40) {
            return "Fat-should lose weight";
        } else {
            return "Very fat - should lose weight immediately";
        }
    }

    //allow user BMI calculator
    public static void BMICalculator() {
        System.out.print("Enter Weight(kg): ");
        double weight = checkInputDouble();
        System.out.print("Enter Height(cm): ");
        double height = checkInputDouble();
        double bmi = weight*10000 / (height*height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + BMIStatus(bmi));
    }
}
