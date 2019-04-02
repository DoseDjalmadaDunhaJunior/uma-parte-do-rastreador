package com.company;

public class Mensagem {

    public void inserirTxt(String ind, String txt){
        eu[posissao].mensagem = txt;
        eu[posissao].nome = ind;
        posissao++;
    }

    public String imprimeTxt(String ind){
        for (int i = 0; i < 10; i++){
            if(eu[i].nome == ind){
                return eu[i].mensagem;
            }
        }
        return "mensagem não encontrada";
    }

    private void setTam(int tam) {
        this.tam = tam;
    }

    private int getTam() {
        return tam;
    }

    private Pessoa eu[];
    public int posissao = 0;
    private int tam = 10;
}
