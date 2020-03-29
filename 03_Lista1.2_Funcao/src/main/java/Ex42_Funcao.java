/* Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 *
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */

        
public class Ex42_Funcao
{
    public static void main (String args [])
    {
        int n=1;
        System.out.println ("O resultado da soma da serie eh: " +funcaoSerie(n));
    }
    
        
    static double funcaoSerie(int n)
    {    
        double n1=1, n2=1, i, soma=0;
        
        for (i=1; i<=50; i++)
        {
            System.out.println (+n1+"/"+n2+" +");
            soma = (n1 / n2) + soma;
            n1 = n1 + 1;
            n2 = n2 + 2;
                             
        }
        return soma;
    }
    
}
