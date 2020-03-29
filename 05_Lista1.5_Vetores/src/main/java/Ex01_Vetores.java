
/* Objetivo:  Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 *              a. A média dos valores entre 10 e 200;
 *              b. A soma dos números ímpares.
 *
 * Programador: Rodrigo Martinez
 * Data: 18/Mar/2020
 */
       
import javax.swing.JOptionPane;

public class Ex01_Vetores 
{
    public static void main (String args [])
    {
        int vetor[] = new int [50];
        int i, media=0, soma=0, somaImp=0;
        
        for (i=0; i<=49; i++)
        {
            vetor[i] = Integer.parseInt (JOptionPane.showInputDialog ("Digite o valor de " +(i+1) +"/50"));
            if (vetor[i] >=10 && vetor[i] <=200)
            {
                media = media + 1;
                soma = soma + vetor[i];
                
            }
        
            if (vetor[i] % 2 !=0)
            {
                somaImp = somaImp + vetor[i];
            }
               
        }
        
        soma= soma / media;
        
        System.out.println ("A média dos valores entre 10 e 200 é: " +soma);
        System.out.println ("A soma dos númerops impares é: " +somaImp);
        
        
    }
    
}
