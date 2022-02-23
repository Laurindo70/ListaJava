/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unigran.atividades;

import javax.swing.JOptionPane;


/**
 *
 * @author laboratorio
 */
public class Tabuada {
    
    public static void main(String[] args){
        Integer[] tabuada = new Integer[10];
        Integer numero;
        Integer cont;
        
        numero = Integer.parseInt(
                JOptionPane.showInputDialog("Entre com o numero para tabuada:"));
        
        for(cont = 0; cont < 10; cont++){
            tabuada[cont] = ((cont+1)*numero);
        }
        
        JOptionPane
                .showMessageDialog(null, "Tabuada do " + numero +"\nTabuada:"+tabuada);
    }
    
}
