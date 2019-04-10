package com.company;

import java.util.Scanner;

public class PublicacoesT {

    /**
     * a função abaixo seta o nome
     */
    public void setNome(){
        Scanner bot = new Scanner(System.in);
        nome = bot.nextLine();
    }

    /**
     * a função abaixo seta o comentario
     */
    public void setComentario(){
        Scanner bot = new Scanner(System.in);
        comentario = bot.nextLine();
    }

    /**
     * a função abaixo da um get em tudo para imprimir no terminal
     */
    public void getTudo() {
        if (nome != null && comentario != null) {
            ComentarioT tesao = new ComentarioT();
            tesao.mostrar(nome, comentario);
        } else {
            System.out.println("algum campo esta vazio");
        }
    }


    private String nome = null;
    private String comentario = null;
}
