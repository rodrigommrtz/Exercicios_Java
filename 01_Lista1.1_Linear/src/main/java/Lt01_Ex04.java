/* Objetivo: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex04 
{
    public static void main (String args [])
    {
        double Temp;
        Temp = Double.parseDouble(JOptionPane.showInputDialog ("Digite o valor da Temperatura em ºC"));
        Temp = ((9 * Temp) + 160) /5;
        System.out.println ("A  em Fahrenheit é: " + Temp);               
    }
}
