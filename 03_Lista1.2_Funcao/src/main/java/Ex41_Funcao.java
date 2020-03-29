/* Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

        
public class Ex41_Funcao
{
    public static void main (String args [])
    {
        int x=1;
        funcaoDados(x);
    }
    
        
    
    static int funcaoDados(int x)
    {
        int n1, n2;
        
        for (n1=1; n1< 6; n1++)
        {
            n2 = 7 - n1;
            System.out.println ("Para o total de 7, o dado No.1 dever ser: " + n1 + " e o Dado No2.: " + n2 );
            
        }
        return n1; // o que retornou aqui tamebm?? nao seria melhor usar um procedimento para usar exercicio????
    }
    
}