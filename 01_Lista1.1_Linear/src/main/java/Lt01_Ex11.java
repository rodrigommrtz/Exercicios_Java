/* Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex11 
{
    public static void main (String args [])
    {
        float A;
        A = Float.parseFloat(JOptionPane.showInputDialog ("Digite o valor do Raio"));
        A = (float) (A * 2 * Math.PI);
        System.out.println ("O valor da circunferência é " + A);              
    }
}
