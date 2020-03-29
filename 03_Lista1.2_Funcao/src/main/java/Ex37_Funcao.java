/* Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Ex37_Funcao
{
    public static void main (String args [])
    {
        int n;

        n = Integer.parseInt (JOptionPane.showInputDialog ("Numero de casas da sequencia Fibonacci "));
        System.out.println ("Resultado da soma de Fibonocci: " + funcaoFib(n));        
    }
    
    
    
    
    static int funcaoFib(int n)
    {
        
        int n1=1, n2=0, fib=0;
        n1 = 1;
        n2 = 0;
                
        while (n >= 1)
        {
            fib = n1 + fib;
            n1 = n2;
            n2 = fib;
            n = n-1;
        }
        return fib;

    }
    
}