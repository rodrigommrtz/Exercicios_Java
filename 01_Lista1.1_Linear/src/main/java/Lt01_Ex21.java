/* Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética.
             Mostre a mensagem de acordo com a média:
             a. Se a média for >= 6,0 exibir “APROVADO”;
             b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
             c. Se a média for < 3,0 exibir “RETIDO”.
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex21 
{
    public static void main (String args [])
    {
        
     float Nota, Media = 0;
     
        Nota = Float.parseFloat(JOptionPane.showInputDialog ("Digite a 1º Nota"));
        Media = Media + Nota;
        
        Nota = Float.parseFloat(JOptionPane.showInputDialog ("Digite a 2º Nota"));
        Media = Media + Nota;
        
        Nota = Float.parseFloat(JOptionPane.showInputDialog ("Digite a 3º Nota"));
        Media = Media + Nota;     
        
        Nota = Float.parseFloat(JOptionPane.showInputDialog ("Digite a 4º Nota"));
        Media = Media + Nota;
        
        Media = Media /4;
        
        if (Media >= 6) {
            System.out.println ("APROVADO");
        } else{
            if (Media < 3) {
            System.out.println ("REPROVADO");
            } else {
                System.out.println ("EXAME");
            }
        }

    }
}

