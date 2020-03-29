/* Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex16 
{
    public static void main (String args [])
    {
        float HorasTrab, ValorH, Desconto, Depend, ValorB, ValorL;
                
        HorasTrab = Float.parseFloat(JOptionPane.showInputDialog ("Digite a qtde de horas trabalhadas"));
        ValorH = Float.parseFloat(JOptionPane.showInputDialog ("Digite o valor da hora trabalhada - R$"));
        Desconto = Float.parseFloat(JOptionPane.showInputDialog ("Digite o % de descontos"));
        Depend = Float.parseFloat(JOptionPane.showInputDialog ("Digite a quantidae de dependentes - R$"));
        
        ValorB = (HorasTrab * ValorH);
        ValorL = (ValorB - (ValorB * (Desconto / 100))) + (Depend * 100) ;
        
        System.out.println ("O valor do Salário Bruto é de R$ " + ValorB);
        System.out.println ("O valor líquído a receber é de R$ " + ValorL);
    }
}
