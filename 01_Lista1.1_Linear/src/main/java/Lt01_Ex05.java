/* Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue 2 raízes)
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex05 
{
    public static void main (String args [])
    {
        int A, B, C;
        double Delta, X1, X2;
        A = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de A"));
        B = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de B"));
        C = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de C"));
        
        Delta = (B * B) - (4 * A *C);
        Delta = Math.sqrt (Delta);
        
        X1 = (-B + Delta) / (2 * A);
        X2 = (-B - Delta) / (2 * A);
        
        System.out.println ("A raíz de X1 é: " + X1);
        System.out.println ("A raíz de X2 é: " + X2);
    }
}
