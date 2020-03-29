/* Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
 *           Mostre os 4 números em ordem crescente.
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */

import javax.swing.JOptionPane;

public class Ex23_Procedimento 
{
    public static void main (String args [])
    {
        
    int N1, N2, N3, N4 = 0;
         
    N1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 1º Numero"));
    N2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 2º Numero"));
     
    
    if (N2>N1)
    {
        chamaNovoN(N1, N2);
    }else
    {
        System.out.println ("O 1º, 2º e 3º numeros devem ser crescentes");
    }
           
    }
    
    
    public static void chamaNovoN(int N1, int N2)
    {
        
        int N3, N4=0;
        
        N3 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 3º Numero"));
        if (N3>N2)
        {
            N4 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 4º Numero"));
        }else
        {if (N3<N2)
            {
                System.out.println ("O 1º, 2º e 3º numeros devem ser crescentes");
            }else
            {
                if (N4>= N3)
                {
                    System.out.println ("A sequencia crescente eh: " +N1 +" "+ N2 +" "+N3+" " +N4);
                }else
                {
                    if (N4 <= N1)
                    {
                        System.out.println ("A sequencia crescente eh: " +N4 +" "+ N1 +" "+N2+" " +N3);
                    }if(N4 >= N2)
                    {
                        System.out.println ("A sequencia crescente eh: " +N1 +" "+ N2 +" "+N4+" " +N3);
                    }
                           
                }
     
            }
        }
    }
    

}
