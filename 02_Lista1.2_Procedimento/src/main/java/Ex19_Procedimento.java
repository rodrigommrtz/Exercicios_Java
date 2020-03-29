/* Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
 * 
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */


import javax.swing.JOptionPane;

public class Ex19_Procedimento {
    
    public static void main (String args [])
    {
        float N1, N2;
    
        N1 = Float.parseFloat(JOptionPane.showInputDialog ("Digite o 1º Número"));
        N2 = Float.parseFloat(JOptionPane.showInputDialog ("Digite o 2º Número"));
        
        maior(N1, N2);
    }
    
    
    public static void maior(float N1, float N2)
    {
        float Maior;
        
        Maior = (N1 > N2)? N1: N2;
        System.out.println ("O Maior Número é: " + Maior);
    }
    
}
