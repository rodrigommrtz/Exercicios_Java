/* Objetivo: Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex14 
{
    public static void main (String args [])
    {
        int Ang = 180, A;
        A = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 1º ângulo do triângulo"));
        Ang = Ang - A;
        A = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 2º ângulo do triângulo"));
        Ang = Ang - A;
        System.out.println ("O 3º âmgulo do triâmgulo é " + Ang);
    }
}
