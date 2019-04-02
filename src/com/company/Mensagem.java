package com.company;
/**
inicialmente farei os vetores estaticos simplismente para aplicar a logica
 */
public class Mensagem {

    /** a funcao abaixo serve para o usuario inserir uma mensagem*/
    public void inserirTxt(String ind, String txt){
        eu[posissao].mensagem = txt;
        eu[posissao].nome = ind;
        posissao++;
    }

    /** a funcao abaixo retorna a mensagem */
    public String imprimeTxt(String ind){
        for (int i = 0; i < 10; i++){
            if(eu[i].nome == ind){
                return eu[i].mensagem;
            }
        }
        return "mensagem não encontrada";
    }

    /** a funcao serve para darmos um tamanho estatico ao vetor */
    private void setTam(int tam) {
        this.tam = tam;
    }

    /** a funcao retorna o tamanho do vetor */
    private int getTam() {
        return tam;
    }

    private Pessoa eu[];
    public int posissao = 0;
    private int tam = 10;
}
