

/* Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferença do maior pelo menor valor
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */


import javax.swing.JOptionPane;

public class Lt01_Ex18 
{
    public static void main (String args [])
    {
        int N1, N2, Dif;
    
        N1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 1º Número Inteiro"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 2º Número Inteiro"));

        Dif = (N1 > N2)? N1 - N2: N2-N1;
                        
        System.out.println ("O valor da diferença entre o Maior e o Menor Número é: " + Dif);
    }
    
}
    
