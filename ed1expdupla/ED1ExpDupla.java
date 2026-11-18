/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.luiz.ed1expdupla;

/**
 *
 * @author lazar
 */
 public class ED1ExpDupla {
    private No inicio;
    private No fim;

    
    public ED1ExpDupla() {
        this.inicio = null;
        this.fim = null;
    }
    public void inserirNaPosicao(int posicao, String Nomes) {
        No novoNo = new No(Nomes);
        if (posicao < 0) {
            System.out.println("inválido.");
            return;
        }
        
        if (posicao == 0) {
            novoNo.proximo = this.inicio;
            if (this.inicio != null) {
                this.inicio.anterior = novoNo;
            }
            this.inicio = novoNo;   
            if (this.fim == null) {
                this.fim = novoNo;
            }
            return;
        }
        
        No atual = this.inicio;
        for (int i = 0; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }
        
        if (atual == null) {
            System.out.println("inválido.");
            return;
        }
        
        novoNo.proximo = atual.proximo;
        if (atual.proximo != null) {
            atual.proximo.anterior = novoNo;
        } else {
            this.fim = novoNo;
        }
        atual.proximo = novoNo;
        novoNo.anterior = atual;
    }
    public void inserir(String Nomes) {
        No novoNo = new No(Nomes);
        if (this.inicio == null) {
            this.inicio = novoNo;
            this.fim = novoNo;
        } else {
            this.fim.proximo = novoNo;
            novoNo.anterior = this.fim;
            this.fim = novoNo;
        }
    }
    public void esvaziar() {
        this.inicio = null;
        this.fim = null;
    }
    public int tamanho() {
        int tamanho = 0;
        No atual = this.inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    public void exibir() {
        No atual = this.inicio;
        while (atual != null) {
            System.out.print(atual.Nomes + " ");
            atual = atual.proximo;
        }
        System.out.println("\n");
    }

    public void remover(String Nomes) {
        No atual = this.inicio;
        while (atual != null) {
            if (atual.Nomes.equals(Nomes)) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    this.inicio = atual.proximo;
                }
                
                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    this.fim = atual.anterior;
                }
                
                break; 
            }
            atual = atual.proximo;
        }
    }
    public void removerNaPosicao(int posicao) {
    if (posicao < 0 || this.inicio == null) {
        System.out.println("Posição inválida.");
        return;
    }

    if (posicao == 0) {
        this.inicio = this.inicio.proximo;
        if (this.inicio != null) {
            this.inicio.anterior = null;
        } else {
            this.fim = null;
        }
        return;
    }

    No atual = this.inicio;
    for (int i = 0; i < posicao && atual != null; i++) {
        atual = atual.proximo;
    }

    if (atual == null) {
        System.out.println("Posição inválida.");
        return;
    }

    if (atual.proximo != null) {
        atual.proximo.anterior = atual.anterior;
    } else {
        this.fim = atual.anterior;
    }

    if (atual.anterior != null) {
        atual.anterior.proximo = atual.proximo;
    }
    
}
    public void inserirInicio(String Nomes) {
        inserirNaPosicao(0, Nomes);
    }

    public boolean contem(String nome) {
        No atual = this.inicio;
        while (atual != null) {
            if (atual.Nomes.equalsIgnoreCase(nome)) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public void removerInicio() {
        if (this.inicio == null) {
            System.out.println("Lista vazia.");
            return;
        }
        this.inicio = this.inicio.proximo;
        if (this.inicio != null) {
            this.inicio.anterior = null;
        } else {
            this.fim = null;
        }
    }

    public void removerFim() {
        if (this.fim == null) {
            System.out.println("Lista vazia.");
            return;
        }
        this.fim = this.fim.anterior;
        if (this.fim != null) {
            this.fim.proximo = null;
        } else {
            this.inicio = null;
        }
    }
    }

