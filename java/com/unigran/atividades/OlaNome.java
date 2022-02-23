package com.unigran.atividades;

import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class OlaNome {

    public static void main(String[] args) {
        String nome;
        
        nome = JOptionPane
                .showInputDialog("Entre com o nome:");
        JOptionPane
                .showMessageDialog(null, "Olá " + nome);
    }
}
