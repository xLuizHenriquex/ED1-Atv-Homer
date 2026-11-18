/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.luiz.ed1expdupla;

/**
 *
 * @author lazar
 */
public class No {
    String Nomes;
    No anterior;
    No proximo;
    
    public No(String Nomes){
        this.Nomes = Nomes;
        this.anterior = null;
        this.proximo = null;
    }

}
