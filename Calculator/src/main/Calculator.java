/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import javax.swing.JOptionPane;


/**
 *
 * @author 182210113
 */
public class Calculator {
    public static void main(String[] args) {
        double firstNumber, secondNumber, calc, opInt;
        String operator, fN, sN;
        
        operator = JOptionPane.showInputDialog("Digite a operação" +"\n"+  "1 para soma" +"\n"+ "2 para subtração" +"\n"+ "3 para multiplicação" +"\n"+ "4 para divisão");
        opInt = Integer.parseInt(operator);
        
        
             
       switch (operator){
           case "1": 
               fN = JOptionPane.showInputDialog("Digite o primeiro número");
               firstNumber = Double.parseDouble(fN);
               sN = JOptionPane.showInputDialog("Digite o segundo número");
               secondNumber = Double.parseDouble(sN);
               calc = firstNumber + secondNumber;
               JOptionPane.showMessageDialog(null, fN + " + " + sN + " = " + calc, "Resultado soma", JOptionPane.INFORMATION_MESSAGE);
               break;
           case "2": 
               fN = JOptionPane.showInputDialog("Digite o primeiro número");
               firstNumber = Double.parseDouble(fN);
               sN = JOptionPane.showInputDialog("Digite o segundo número");
               secondNumber = Double.parseDouble(sN);
               calc = firstNumber - secondNumber;
               JOptionPane.showMessageDialog(null, fN + " - " + sN + " = " + calc, "Resultado subtração", JOptionPane.INFORMATION_MESSAGE);      
               break;
           case "3": 
               fN = JOptionPane.showInputDialog("Digite o primeiro número");
                firstNumber = Double.parseDouble(fN);
                sN = JOptionPane.showInputDialog("Digite o segundo número");
                secondNumber = Double.parseDouble(sN);
                calc = firstNumber * secondNumber;
                JOptionPane.showMessageDialog(null, fN + " * " + sN + " = " + calc, "Resultado multiplicação", JOptionPane.INFORMATION_MESSAGE);
                break;
           case "4":
                fN = JOptionPane.showInputDialog("Digite o dividendo");
                firstNumber = Double.parseDouble(fN);
                sN = JOptionPane.showInputDialog("Digite o divisor");
                secondNumber = Double.parseDouble(sN);
                calc = firstNumber / secondNumber;
                JOptionPane.showMessageDialog(null, fN + " / " + sN + " = " + calc, "Resultado da divisão", JOptionPane.INFORMATION_MESSAGE);    
                break;
           default: 
               JOptionPane.showMessageDialog(null,"Preencha uma das opções Válidas", "INVÁLIDO", JOptionPane.ERROR_MESSAGE);
               break;
       
       
       
       }
               
       /*if(opInt == 1){
           fN = JOptionPane.showInputDialog("Digite o primeiro número");
           firstNumber = Double.parseDouble(fN);
           sN = JOptionPane.showInputDialog("Digite o segundo número");
           secondNumber = Double.parseDouble(sN);
           calc = firstNumber + secondNumber;
           JOptionPane.showMessageDialog(null, fN + " + " + sN + " = " + calc, "Resultado soma", JOptionPane.INFORMATION_MESSAGE);
       }
       else if (opInt == 2) {
           fN = JOptionPane.showInputDialog("Digite o primeiro número");
           firstNumber = Double.parseDouble(fN);
           sN = JOptionPane.showInputDialog("Digite o segundo número");
           secondNumber = Double.parseDouble(sN);
           calc = firstNumber - secondNumber;
           JOptionPane.showMessageDialog(null, fN + " - " + sN + " = " + calc, "Resultado subtração", JOptionPane.INFORMATION_MESSAGE);      
       
       } 
        else if (opInt == 3) {
           fN = JOptionPane.showInputDialog("Digite o primeiro número");
           firstNumber = Double.parseDouble(fN);
           sN = JOptionPane.showInputDialog("Digite o segundo número");
           secondNumber = Double.parseDouble(sN);
           calc = firstNumber * secondNumber;
           JOptionPane.showMessageDialog(null, fN + " * " + sN + " = " + calc, "Resultado multiplicação", JOptionPane.INFORMATION_MESSAGE);      
       
       } 
        else if (opInt == 4) {
           fN = JOptionPane.showInputDialog("Digite o dividendo");
           firstNumber = Double.parseDouble(fN);
           sN = JOptionPane.showInputDialog("Digite o divisor");
           secondNumber = Double.parseDouble(sN);
           calc = firstNumber / secondNumber;
           JOptionPane.showMessageDialog(null, fN + " / " + sN + " = " + calc, "Resultado da divisão", JOptionPane.INFORMATION_MESSAGE);      
       
       }
        else {
                       JOptionPane.showMessageDialog(null,"Preencha uma das opções Válidas", "INVÁLIDO", JOptionPane.ERROR_MESSAGE);      

        }*/
        
        
       
       
    }
    
}
