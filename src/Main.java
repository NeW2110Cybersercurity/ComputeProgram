/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import controller.Manager;
import view.Menu;
/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        //loop until user want to exit
        while (true) {
            int choice = Menu.mennu();
            switch (choice) {
                case 1:
                    Manager.normalCalculator();
                    break;
                case 2:
                    Manager.BMICalculator();
                    break;
                case 3:
                    return;
            }
        }

    }
}
