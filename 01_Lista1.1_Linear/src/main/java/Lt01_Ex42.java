/* Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

        
public class Lt01_Ex42
{
    public static void main (String args [])
    {
        float n1=1, n2=1, i, soma=0;
        
        for (i=1; i<=50; i++)
        {
            System.out.println (+n1+"/"+n2+" +");
            soma = (n1 / n2) + soma;
            n1 = n1 + 1;
            n2 = n2 + 2;
            
                    
        }
        System.out.println ("O resultado da soma da serie eh: " +soma);
    }
    
}




