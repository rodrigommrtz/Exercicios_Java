/* Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex02 
{
    public static void main (String args [])
    {
        double Salario;
        Salario = Double.parseDouble(JOptionPane.showInputDialog ("Digite o valor do Salário - R$"));
        Salario = (Salario * 1.15);
        System.out.printf ("O novo valor de salário é: R$ %.2f ", Salario);               
    }
}
