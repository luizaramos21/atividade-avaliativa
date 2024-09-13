/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade001;

import javax.swing.JOptionPane;


 
public class Atividade001 {

    public static void main(String[] args) {
        int quant=
         Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de nomes a ser cadastrada"));
        String nomes[] = new String[quant];
        
         for(int i = 0; i < quant; i++){
          nomes[i] =
          JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ": ");        
         }
          while(true){
        int posicao = 
         Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a posição do nome a ser consultado ou -1 para sair"));    
        
        if (posicao == 1){
            break;
        } else if (posicao >= 1 && posicao <= quant) {
         JOptionPane.showMessageDialog(null, "Nome registrado na posição " + posicao + " é " + nomes[posicao - 1]);   
        }
        else{
         JOptionPane.showMessageDialog(null, "Posição invalida");   
        }
    }
    }
}
