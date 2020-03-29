/* Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex10 
{
    public static void main (String args [])
    {
        double N1, N2;
        N1 = Double.parseDouble(JOptionPane.showInputDialog ("Digite o primeiro Valor"));
        N2 = Double.parseDouble(JOptionPane.showInputDialog ("Digite o segundo Valor"));
        N2 = N1 - N2;
        System.out.println ("O valor da diferença entre N1 e N2 é " + N2);               
    }
}
