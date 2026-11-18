/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.luiz.ed1expdupla;

/**
 *
 * @author lazar
 */
public class Teste1 {
    public static void main(String[] args) {
        ED1ExpDupla lista = new ED1ExpDupla();
        
        System.out.println("1");
        lista.inserir("Homer");
        lista.inserir("Marge");
        lista.exibir();

        
        System.out.println("2");
        lista.esvaziar();
        lista.exibir();

        
        System.out.println("3");
        lista.inserir("Homer");
        lista.inserirNaPosicao(0, "Bart");
        lista.inserirNaPosicao(1, "Moll");
        lista.exibir();

       
        System.out.println("4");
        lista.esvaziar();

        
        System.out.println("5");
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserirInicio("Lisa");
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        
        System.out.println("6");
        lista.esvaziar();
        lista.exibir();

        
        System.out.println("7");
        lista.inserir("Homer");
        lista.inserir("Maggie");
        lista.inserirNaPosicao(0, "Bart");
        lista.inserirNaPosicao(1, "Marge");
        lista.exibir();
        System.out.println("Lisa está na lista? " + lista.contem("Lisa"));

       
        System.out.println("8");
        lista.esvaziar();

        
        System.out.println("9");
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        
        System.out.println("10");
        System.out.println("Marge: " + lista.contem("Marge"));
        System.out.println("Homer: " + lista.contem("Homer"));
        System.out.println("Bart: " + lista.contem("Bart"));
        System.out.println("Maggie: " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        
        System.out.println("11");
        lista.esvaziar();

        
        System.out.println("12");
        lista.inserirInicio("Homer");
        lista.inserirInicio("Bart");
        lista.inserir("Marge");
        lista.inserirNaPosicao(1, "Maggie");
        lista.inserirInicio("Ned Flanders");
        lista.inserir("Sr. Burns");
        lista.exibir();

        
        System.out.println("13");
        lista.removerFim();
        lista.exibir();

        
        System.out.println("14");
        lista.removerNaPosicao(1);
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        
        System.out.println("15");
        System.out.println("Marge: " + lista.contem("Marge"));
        System.out.println("Homer: " + lista.contem("Homer"));
        System.out.println("Bart: " + lista.contem("Bart"));
        System.out.println("Maggie: " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        
        System.out.println("16");
        lista.removerInicio();
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        
        System.out.println("17");
        System.out.println("Marge: " + lista.contem("Marge"));
        System.out.println("Homer: " + lista.contem("Homer"));
        System.out.println("Bart: " + lista.contem("Bart"));
        System.out.println("Maggie: " + lista.contem("Maggie"));
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        
        System.out.println("18");
        lista.esvaziar();
        lista.exibir();
    }
}
