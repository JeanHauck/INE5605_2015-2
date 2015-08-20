/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojavafx;

import exemplojavafx.control.ControladorPrincipal;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Jean
 */
public class ExemploJavaFX extends Application {

    private ControladorPrincipal ctrl;
    
    @Override
    public void start(Stage primaryStage) {

        ctrl = new ControladorPrincipal(primaryStage);
        ctrl.iniciar();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(ExemploJavaFX.class,args);
    }

}
