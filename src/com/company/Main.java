package com.company;

/**
 * tudo no main por enquanto é para testes, ver se funcoes estao funcionando entre outras coisas
 */

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) {

        Desktop d = Desktop.getDesktop();
        try {
            d.browse(new URI( "https://goo.gl/maps/ToTSgc8fakL2"));
        }
        catch ( IOException e ) {
            System.out.println(e);
        }
        catch ( URISyntaxException e ) {
            System.out.println(e);
        }
    }
}