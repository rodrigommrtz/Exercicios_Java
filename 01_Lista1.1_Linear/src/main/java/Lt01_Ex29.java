/* Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
             Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
             Demais tipos não serão considerados.

 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex29 
{
    public static void main (String args [])
    {
        
        int tipo;
        float valor;
        
        tipo = Integer.parseInt (JOptionPane.showInputDialog ("Digite o tipo de investimento" +"\n"+ "1: poupanca"+ "\n"+ "2: Renda Fixa"));
        if (tipo ==1 || tipo ==2)
        {
            valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do investimento"));
            if (tipo == 1)
            {
                valor = (float)((float)valor * 1.3);
                System.out.println ("O valor apos 30 dias sera de: R$ " + valor);
            }else
            {
                valor = (float)((float)valor * 1.5);            
                System.out.println ("O valor apos 30 dias sera de: R$ " + valor);
            }
        } else
        {
            System.out.println ("Opcao NAO valida");
        }
    }
}


       
        
    