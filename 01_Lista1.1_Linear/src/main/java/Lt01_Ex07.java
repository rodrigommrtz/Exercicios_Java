/* Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex07 
{
    public static void main (String args [])
    {
        int Volume, Lado;
        Volume = 1;
        Lado = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor do Largura"));
        Volume = Volume * Lado;
        Lado = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor do Comprimento"));
        Volume = Volume * Lado;
        Lado = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor da Altura"));
        Volume = Volume * Lado;
               
        System.out.println ("O Volume do paralelepípedo é: " + Volume);               
    }
}
