package com.company;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static javafx.application.Application.launch;

public class AdmComentario extends Application {
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("visual/comentario.fxml"));
        primaryStage.setScene(new Scene(root,300,200));
        primaryStage.show();
    }

    AdmComentario(){
        String[] args;
        //launch(args);
    }

}
