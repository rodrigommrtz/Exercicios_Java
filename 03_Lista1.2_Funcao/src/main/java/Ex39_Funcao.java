/* Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: 
 *           Casa: 1 2 3 4 ... 64 
 *           Qte: 1 2 4 8 ... N
 *
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */



import javax.swing.JOptionPane;

        
public class Ex39_Funcao
{
    public static void main (String args [])
    {
                
        double casas;
        
        casas = Double.parseDouble (JOptionPane.showInputDialog ("Digite a quantidade de casas: "));
        System.out.println ("A qtde de graos eh de: " + funcaoSoma(casas));
    }
        
        
        
    static double funcaoSoma( double casas)
    {   
        
        double num=0, calc, soma=0;
        
        while (num <=casas - 1)
        {
            calc = Math.pow(2, num);
            num = num + 1;
            soma = soma + calc;
      
        }

        return soma;
        
    }
    
}