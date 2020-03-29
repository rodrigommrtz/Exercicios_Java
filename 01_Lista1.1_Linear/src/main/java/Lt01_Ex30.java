/* Objetivo: Receba a data de nascimento e atual em ano, mês e dia. Calcule e 
 *           mostre a idade em anos, meses e dias, considerando os anos bissextos.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex30 
{
    public static void main (String args [])
    {
        int ano0, mes0, dia0;
        int ano1, mes1, dia1;
        int anoT, mesT, diaT;
        int difdias, count, bis=0; 
        
        dia0 = Integer.parseInt (JOptionPane.showInputDialog ("Digite o DIA de Nascimento"));
        mes0 = Integer.parseInt (JOptionPane.showInputDialog ("Digite o MÊS de Nascimento"));
        ano0 = Integer.parseInt (JOptionPane.showInputDialog ("Digite o ANO de Nascimento"));
        
        dia1 = Integer.parseInt (JOptionPane.showInputDialog ("Digite o DIA atual"));
        mes1 = Integer.parseInt (JOptionPane.showInputDialog ("Digite o MÊS atual"));
        ano1 = Integer.parseInt (JOptionPane.showInputDialog ("Digite o ANO atual"));
        
        
        // bissexto
        
        count = ano0;
        if (ano1 == ano0)
        {
            while (count == ano1)
            {
                if (ano1 % 4 == 0 || ano1 % 400 == 0)
                {
                    bis = bis + 1;
                    count = count - 1;
                }else
                {
                    bis = bis + 0;
                    count = count + 1;
                }
            }
        } else
        {
            while (count < ano1)
            {
                if (ano1 % 4 == 0 || ano1 % 400 == 0)
                {
                    bis = bis +1;
                    count = count + 1;
                } else
                {
                     bis = bis + 0;
                     count = count + 1;
                }
            }
        }
        
        if (mes0 == 2)
        {
            difdias = (28 + bis) - dia0;
            
        }else
        {
            if (mes0 == 1 || mes0 == 3 || mes0 == 5 || mes0 == 7 || mes0 == 8 || mes0 == 10 | mes0 == 12)
            {
                difdias = 31 - dia0;
            }else
            {
                difdias = 30 - dia0;
            }
        }
        
        // anos
        if (ano1 == ano0 && mes0 == mes1)
        {
            anoT = ano0 - ano1;
            
        }else
        {
            if (ano1 == (ano0 + 1))
            {
                anoT = ano1 - ano0;
            }else
            {
                anoT = ano1 - (ano0 + 1);
            }
        }
        
        
        // meses
        if (ano1 == ano0)
        {
            mesT = mes1 - mes0;
        }
        
        if (mes0 == 1)
        {
            mesT = mes0 - mes1;
        }else
        {
            if (ano1 == ano0)
            {
                mesT = mes1 - mes0;
            }else
            {
                mesT = (12 - mes0) + mes1;
            }
        }

        if (mesT > 12)
        {
            mesT = mesT - 12;
            anoT = anoT + 1;
        }

        //dias
        diaT = difdias + dia1;
        
        //ajustes
        if (diaT > 28) 
        {
            if (mes1 ==1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1==10 || mes1 == 12)
            {
                diaT = diaT - 31;
            }
        }else
        {
            if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11)
            {
                diaT = diaT - 30;
            }else
            {
                diaT = diaT - (28 + bis);
            }
        }
        
        System.out.println ("Sua idade é: " + anoT + " anos " + mesT + " meses e " + diaT + " dias");
        
        
    }
}
