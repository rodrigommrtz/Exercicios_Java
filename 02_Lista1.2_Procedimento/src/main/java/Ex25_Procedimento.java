/* Objetivo: Receba a hora de início e de final de um jogo (HH,MM) sabendo que o 
 *           tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */

import javax.swing.JOptionPane;


public class Ex25_Procedimento 
{
    public static void main (String args [])
    {
        
        int Hi, Hf, Mi, Mf;
        
        Hi = Integer.parseInt(JOptionPane.showInputDialog ("Digite a hora de inicio"));
        Mi = Integer.parseInt(JOptionPane.showInputDialog ("Digite o minuto de inicio"));
        Hf = Integer.parseInt(JOptionPane.showInputDialog ("Digite a hora final"));
        Mf = Integer.parseInt(JOptionPane.showInputDialog ("Digite o minuto final"));
        
        calculoHoras(Hi, Hf, Mi, Mf);
        
    }

    public static void calculoHoras(int Hi, int Hf, int Mi, int Mf)
    {
        int Ht=0, Mt;
        

        // Calculo das horas
        if (Hf == Hi + 1 && Mf < Mi)
                {
                    Ht = (Hf - Hi - 1);
                } else
                    {
                        if (Hi>Hf)
                        {
                            Ht = (24 - Hi) + Hf;
                        } else 
                            {
                                if (Mf < Mi)
                                    {
                                        Mt = (Hf - Hi) - 1;
                                    } else
                                        {
                                            Ht = Hf - Hi;
                                        }
                            }
                    }
          
        
        // Calcular os minutos
        if (Mi == Mf)
        {
            Mt = 0;
        } else 
            {
                if (Mi >= Mf)
                {
                    Mt = (60 - Mi) + Mf;
                } else
                    {
                        Mt = Mf - Mi;
                    }
            }
    
        System.out.println ("Jogo com total de " + Ht + " Horas e " + Mt + " Minutos");

    }    
        
}