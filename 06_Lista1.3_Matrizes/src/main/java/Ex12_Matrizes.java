

/* Objetivo:  Carregar códigos das peças em um tabuleiro de xadrez, onde:
 *
 *            codigo  |   1  |   2   |   3   |   4    |   5    |   6   |   7   |   
 *            peca    | peao | torre | bispo | cavalo | rainha |  rei  | vazio |     
 *            
 *              Calcular e mostrar a soma das peças do tabuleiro.
 *              Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peça
 *
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Mar/2020
 */


import javax.swing.JOptionPane;

public class Ex12_Matrizes 
{
    public static void main (String args[])
    {
        int matriz[][] = new int[8][8];
        int vetor[] = new int [7];
        int i, x, y=0, n;
        
        for (i=0; i<8; i++)
        {
            for (x=0; x<8; x++)
            {
                y=y+1;
                n = Integer.parseInt (JOptionPane.showInputDialog ("Digite o numero da peca ("+y+"/64)" +"\n\n1 - peao;     2 - torre;     3 - bispo"+"\n4 - cavalo;     5 - rainha;     6 - rei"+"\n7 - vazio"));
                matriz[i][x] = n;
                vetor[n] = vetor[n] + 1;
            }
        }
        
        for (i=0; i<7; i++)
        {
            System.out.println ("A quantidade de pecas "+i+ " eh: "+vetor[i]);
        }
        
    }
}

