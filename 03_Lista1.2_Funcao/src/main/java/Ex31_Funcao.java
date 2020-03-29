/* Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

public class Ex31_Funcao 
{
    public static void main (String args [])
    {
        int i; 
        
        for (i=10; i<151; i++)
        {
            System.out.println ("O quadrado de " +i +" é " +funcaoQuadrado(i));         
        }
    }
    
    
    static int funcaoQuadrado (int x)
    {
        int n;
        n = x*x;                      
        return n; 
    }
}





