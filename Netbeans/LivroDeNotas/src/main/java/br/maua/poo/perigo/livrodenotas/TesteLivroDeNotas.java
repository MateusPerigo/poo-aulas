/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.maua.poo.perigo.livrodenotas;

import javax.swing.JOptionPane;
/**
 *
 * @author 25.00934-1
 */
public class TesteLivroDeNotas {
    
    public static void main(String[] args) {
        
        String primeiroCurso = JOptionPane.showInputDialog("Prof, qual o nome do primeiro curso ?");
        String segundoCurso = JOptionPane.showInputDialog("Prof, qual o nome do segundo curso ?");
        
        
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        nomeDoCurso = JOptionPane.showinputDialog("Informe o nome do curso");
        livroDeNotas.setNomeDoCurso(nomeDoCurso);
        
        livroDeNotas1.exibirMensagem("nomeDoCurso");
        livroDeNotas2.exibirMensagem("nomeDoCurso");
    }
       
}
