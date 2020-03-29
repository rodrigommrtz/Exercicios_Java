
/* Objetivo:  Criar e coletar um vetor [100] inteiro e exibir:
 *              a. O maior e o menor valor;
 *              b. A média dos valores.
 *
 * Programador: Rodrigo Martinez
 * Data: 18/Mar/2020
 */
       
import javax.swing.JOptionPane;

public class Ex02_Vetores 
{
    public static void main (String args [])
    {
        int vetor[] = new int [100];
        int i, maior, menor;
        float soma=0;
        
        for (i=0; i<=99; i++)
        {
            vetor[i] = Integer.parseInt (JOptionPane.showInputDialog ("Digite o valor de " +(i+1) +"/100"));
            soma = soma + vetor[i];
            
        }
               
        menor = vetor[0];           
        maior = menor;
 
        for (i=0; i<=99; i++)
        {
            if (vetor[i] < menor)
            {
                menor = vetor[i];
                
            }else
            {
                if (vetor[i] > maior)
                {
                    maior = vetor[i];
                }
            }
                
        }
        
        soma = soma / 100;
        
        System.out.println ("O maior número digitado foi: " +maior);
        System.out.println ("O menor número digitado foi: " +menor);
        System.out.println ("O média dos números digitados é: " +soma);
              
        
    }
    
}
