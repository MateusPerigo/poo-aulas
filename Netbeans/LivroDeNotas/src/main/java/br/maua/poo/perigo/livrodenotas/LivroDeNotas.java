/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.maua.poo.perigo.livrodenotas;

/**
 *
 * @author 25.00934-1
 */
public class LivroDeNotas {
    private String nomeDoCurso;
    
    public void exibirMensagem(String nomeDoCurso) {
        System.out.printf("Bom dia MAGNATA %s", nomeDoCurso);
    }
    public String getNomeDoCurso() {
        return nomeDoCurso;
    }
    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }
    
}

