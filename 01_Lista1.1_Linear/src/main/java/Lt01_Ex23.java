/* Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
 *           Mostre os 4 números em ordem crescente.
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex23 
{
    public static void main (String args [])
    {
        
     int N1, N2, N3, N4 = 0;
         
     N1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 1º Numero"));
     N2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 2º Numero"));
     
    
     if (N2>N1)
     {
         N3 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 3º Numero"));
         if (N3>N2)
         {
            N4 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 4º Numero"));
         }if (N4>= N3)
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
     
                 }else
                  {
                        System.out.println ("O 1º, 2º e 3º numeros devem ser crescentes");
                  }
        
        
}
}

