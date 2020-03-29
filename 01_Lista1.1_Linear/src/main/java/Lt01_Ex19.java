/* Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */


import javax.swing.JOptionPane;

public class Lt01_Ex19 
{
    public static void main (String args [])
    {
        float N1, N2, Maior;
    
        N1 = Float.parseFloat(JOptionPane.showInputDialog ("Digite o 1º Número"));
        N2 = Float.parseFloat(JOptionPane.showInputDialog ("Digite o 2º Número"));

        Maior = (N1 > N2)? N1: N2;
                        
        System.out.println ("O Maior Número é: " + Maior);
    }
    
}
    