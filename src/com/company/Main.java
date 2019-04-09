package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

//public class Main extends Application {
public class Main{
    /*
        public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("visual/comentario.fxml"));
        primaryStage.setScene(new Scene(root,500,500));
        primaryStage.show();
    }
*/
    public static void main(String[] args) {
	Pessoa oi = new Pessoa();
	oi.url("https://www.google.com.br/maps/uv?hl=pt-BR&pb=!1s0x94ce4158ef9c7c05:0x776b798985695f52!2m22!2m2!1i80!2i80!3m1!2i20!16m16!1b1!2m2!1m1!1e1!2m2!1m1!1e3!2m2!1m1!1e5!2m2!1m1!1e4!2m2!1m1!1e6!3m1!7e115!4s/maps/place/fei/@-23.7240687,-46.5793847,3a,75y,184h,90t/data%3D*213m4*211e1*213m2*211s81onwgy4UPPwnf-940FV_w*212e0*214m2*213m1*211s0x94ce4158ef9c7c05:0x776b798985695f52?sa%3DX!5sfei+-+Pesquisa+Google&imagekey=!1e2!2s81onwgy4UPPwnf-940FV_w&sa=X&ved=2ahUKEwigzY_HyLLhAhU9GrkGHQs_Au0Qpx8wEXoECAkQCw");
    //launch(args);
        System.out.println("oi");
    }
}
