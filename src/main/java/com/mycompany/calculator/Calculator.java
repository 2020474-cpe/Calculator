/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;

/**
 *Created By:Dominic Aladia Gaba
 *Student No: 2020474
 *Description: Creating Simple Calculator using joptionpane in java
 */
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import javax.swing.plaf.ColorUIResource;

class Calculator{

    public static void main(String[] args){
        
        UIManager UI=new UIManager();
            UI.put("OptionPane.background",new ColorUIResource(100,255,0));
            
            String operation;
            while (true){
                operation=JOptionPane.showInputDialog(null, """
                                                            Type the Operator to be use:
                                                            Addition
                                                            Subtraction
                                                            Multiplication
                                                            Division
                                                            Modulo
                                                            Square root
                                                            Exit
                                                            """);
                                                            
                                                                             
            
        
                switch(operation){
                    case "Addition":
                        String value1_add = JOptionPane.showInputDialog(null, "Enter the first number:", "Calculator", JOptionPane.PLAIN_MESSAGE);
                        String value2_add = JOptionPane.showInputDialog(null, "Enter the second number:", "Calculator", JOptionPane.PLAIN_MESSAGE);       
                        JOptionPane.showMessageDialog(null,Integer.parseInt(value1_add) + "+" + Integer.parseInt(value2_add) + "=" + (Integer.parseInt(value1_add)+Integer.parseInt(value2_add)));
                        break;
            
                    case "Subtraction":
                        String value1_minus = JOptionPane.showInputDialog(null, "Enter the first number:", "Calculator", JOptionPane.PLAIN_MESSAGE);
                        String value2_minus = JOptionPane.showInputDialog(null, "Enter the second number:", "Calculator", JOptionPane.PLAIN_MESSAGE);     
                        JOptionPane.showMessageDialog(null,Integer.parseInt(value1_minus) + "-" + Integer.parseInt(value2_minus) + "=" + (Integer.parseInt(value1_minus)-Integer.parseInt(value2_minus)));
                        break;
                
                    case "Multiplication":
                        String value1_mult = JOptionPane.showInputDialog(null, "Enter the first number:", "Calculator", JOptionPane.PLAIN_MESSAGE);
                        String value2_mult = JOptionPane.showInputDialog(null, "Enter the second number:", "Calculator", JOptionPane.PLAIN_MESSAGE);     
                        JOptionPane.showMessageDialog(null,Integer.parseInt(value1_mult) + "*" + Integer.parseInt(value2_mult) + "=" + Integer.parseInt(value1_mult)*Integer.parseInt(value2_mult));
                        break;
                
                    case "Division":
                        String value1_div = JOptionPane.showInputDialog(null, "Enter the first number:", "Calculator", JOptionPane.PLAIN_MESSAGE);
                        String value2_div = JOptionPane.showInputDialog(null, "Enter the second number:", "Calculator", JOptionPane.PLAIN_MESSAGE);     
                        
                        JOptionPane.showMessageDialog(null,Integer.parseInt(value1_div) + "/" + Integer.parseInt(value2_div) + "=" + Integer.parseInt(value1_div)/Integer.parseInt(value2_div));
                        break;
            
                    case "Square root":
                        String square =JOptionPane.showInputDialog("Enter Value");
                        int root = Integer.parseInt(square); 
                        JOptionPane.showMessageDialog(null, "Result: "+ Math.sqrt(root),
                         "Square Root", JOptionPane.PLAIN_MESSAGE); 
                        break;
                        
                    case "Modulo":
                        String value1_mod = JOptionPane.showInputDialog(null, "Enter the first number:", "Calculator", JOptionPane.PLAIN_MESSAGE);
                        String value2_mod = JOptionPane.showInputDialog(null, "Enter the second number:", "Calculator", JOptionPane.PLAIN_MESSAGE);  
                        JOptionPane.showMessageDialog(null,Integer.parseInt(value1_mod) + "%" + Integer.parseInt(value2_mod) + "=" + Integer.parseInt(value1_mod)%Integer.parseInt(value2_mod));
                        break;
                    case "Exit":
                         JOptionPane.showMessageDialog(null,"Exiting Program!");
                         System.exit(0);
                         
                    default:
                         JOptionPane.showMessageDialog(null,"Invalid Enter Operation..."); 
                        break;
        }
        

    
    }
}
}