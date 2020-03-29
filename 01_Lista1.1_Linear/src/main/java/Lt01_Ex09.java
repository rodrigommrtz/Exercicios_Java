/* Objetivo: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex09 
{
    public static void main (String args [])
    {
        int A, Soma = 0;
        A = Integer.parseInt(JOptionPane.showInputDialog ("Digite o primeiro Valor"));
        Soma  = (A * A) + Soma;
        A = Integer.parseInt(JOptionPane.showInputDialog ("Digite o segundo Valor"));
        Soma  = Soma + (A * A);
        System.out.println ("O valor da Soma Quadrada dos valores é " + Soma);               
    }
}
