/* Objetivo: Receba 100 números inteiros reais. 
 *           Verifique e mostre o maior e o menor valor.
 *           Obs.: somente valores positivos.
 *
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */

import javax.swing.JOptionPane;

public class Ex38_Funcao
{
    public static void main (String args [])
    {
        int n=0, i;
        
        for (i=1; i<=10; i++)
        {
            n = Integer.parseInt (JOptionPane.showInputDialog("Digite o Numero " + i + " de 100"));
        }
        
        System.out.println ("O MENOR numero digitado foi: " + funcaoMenor(n));
        System.out.println ("O MAIOR numero digitado foi: " + funcaoMaior(n));
            
    }
    
    
    static int funcaoMaior(int n1)
    {
            int maior=0, menor = 999999999;
            
            if (n1 > maior)
            {
                maior = n1;
            }
            
            if (n1 < menor)
            {
                menor = n1;
            }
            
            return maior;
            
    }
 
    
        static int funcaoMenor(int n2)
    {
            int maior=0, menor = 999999999;
            
            if (n2 > maior)
            {
                maior = n2;
            }
            
            if (n2 < menor)
            {
                menor = n2;
            }
            
            return menor;
            
    }
    
    
}
    
   