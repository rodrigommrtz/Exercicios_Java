/* Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex13 
{
    public static void main (String args [])
    {
        int Kgs;
        Kgs = Integer.parseInt(JOptionPane.showInputDialog ("Digite o quantidade de Kilos de alimentos (kgs)"));
        Kgs = (Kgs * 1000) / 50; 
        System.out.println ("Com consumode 50gs por dia, o alimento irá durar (dias) " + Kgs);
    }
}
