/* Objetivo:  Criar uma matriz [8][8] onde o programa irá carregar segundo
 *
 *            casa  | 1 | 2 | 3 | 4 |   * exibir a soma
 *            valor | 1 | 2 | 4 | 8 |      dos valores
 *            
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Mar/2020
 */

public class Ex10_Matrizes 
{
    public static void main (String args[])
    {
        double matriz[][] = new double [8][8];
        int y=0;
        int i, x;
        double soma=0;
        
        for (i=0; i<8; i++)
        {
            for (x=0; x<8; x++)
            {
                matriz[i][x] = Math.pow (2, y);
                soma = soma + matriz[i][x];
                y = y + 1;
            }
        }
        
        System.out.println ("A soma eh: " +soma);
        
    }

}


