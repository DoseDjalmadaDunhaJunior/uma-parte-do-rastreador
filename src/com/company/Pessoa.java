package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URI;
import java.awt.Desktop;

public class Pessoa {
/** a função abaixo serve para salvar a url de posição da pessoa */
    public void url(String html) {
        try {
            URL local = new URL(html);
            String texto;
            InputStreamReader stream = new InputStreamReader(local.openStream());
            PrintWriter saida = new PrintWriter("arqXml.html");
            BufferedReader input = new BufferedReader(stream);
            while ((texto = input.readLine()) != null) {
                saida.println(texto);
            }
            saida.flush();
            saida.close();
        } catch (
                MalformedURLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        } catch (
                IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void abrir(){

    }

    public String nome;
    public String mensagem;
    public URL local;

}
