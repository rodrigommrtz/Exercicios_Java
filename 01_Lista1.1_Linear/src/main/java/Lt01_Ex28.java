/* Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que: 
                Venda Mensal        Preço Atual     Preço Novo 
                < 500               < 30            + 10% 
                >= 500 e < 1000     >= 30 e < 80    +15% 
                >= 1000             >= 80           - 5% 
                Obs.: para outras condições, preço novo será igual ao preço atual.

 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex28 
{
    public static void main (String args [])
    {
        double PrAtual, VendaM, PrNovo;
        
         PrAtual = Double.parseDouble(JOptionPane.showInputDialog ("Digite atual do produto: R$ "));
         VendaM = Double.parseDouble(JOptionPane.showInputDialog ("Digite a venda mensal "));
         
         if(VendaM < 500 )
         {
             if (PrAtual < 30)
                {
                    PrNovo = (PrAtual * 1.1);
                    System.out.println ("O novo preco eh de R$ " + PrNovo);
                } else
                    {
                        System.out.println ("Sera mantido o preco atual " + PrAtual);
                    }
         } else 
             {
                 if (VendaM <= 500 && VendaM < 1000)
                    {
                        if (PrAtual >= 30 && PrAtual < 80)
                            {
                                PrNovo = (PrAtual * 1.15);
                                System.out.println ("O novo preco eh de R$ " + PrNovo);
                            } else
                                 {
                                    System.out.println ("Sera mantido o preco atual " + PrAtual);
                                 }
                    } else
                        {
                            if (VendaM >= 1000)
                                {
                                    if (PrAtual >= 80)
                                        {
                                            PrNovo = (PrAtual * 0.95);
                                            System.out.println ("O novo preco eh de R$ " + PrNovo);   
                                        }    
                                } else
                                    {
                                        System.out.println ("Sera mantido o preco atual " + PrAtual);
                                    }
                            
                        }
                 
                     
                     
                 }
    }
    
}
    


