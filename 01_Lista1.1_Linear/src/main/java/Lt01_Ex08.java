/* Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex08 
{
    public static void main (String args [])
    {
        double Valor;
        Valor = Double.parseDouble(JOptionPane.showInputDialog ("Digite o valor em conta - R$"));
        Valor = Valor * 0.013;
        System.out.println ("O valor, após 30 dias, será de R$ " + Valor);               
    }
}
