/* Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0.
 *            Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */


import javax.swing.JOptionPane;


public class Ex20_Procedimento 
{
    public static void main (String args [])
    {
        int A, B, C;
    
        A = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de A"));
        B = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de B"));
        C = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de C"));

        chamaDelta(A, B, C);
        
    }
    
    
    public static void chamaDelta(int A, int B, int C)
    {
        double Delta, X1, X2;
        
        Delta = (B * B) - ((4 * A * C));
        
        if (Delta < 0){
                System.out.println ("Não há raízes reais");
        } else {
                X1 = ((-B) - (Math.sqrt (Delta)) / 2 * A);
                X2 = ((-B) + (Math.sqrt (Delta)) / 2 * A);
                    
                System.out.println ("X1 é: " + X1);        
                System.out.println ("X2 é: " + X2);
        
        }
    }
   
}
