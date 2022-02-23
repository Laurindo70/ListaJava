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
public class Idade {
    public static void main(String[] args){
        Integer idade, mes, dia, dias;
        
        idade = Integer.parseInt(
                JOptionPane.showInputDialog("Entre com a idade:"));
        mes = Integer.parseInt(
                JOptionPane.showInputDialog("Entre com os meses:"));
        dia = Integer.parseInt(
                JOptionPane.showInputDialog("Entre com os dias:"));
        
        dias = ((idade*365) + (mes*30) + dia);
        
        JOptionPane
                    .showMessageDialog(null, "Os dias são "+dias);
        
    }
}
