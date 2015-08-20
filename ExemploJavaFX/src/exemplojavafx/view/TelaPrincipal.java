/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojavafx.view;

import exemplojavafx.control.ControladorPrincipal;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Jean
 */
public class TelaPrincipal extends Stage {

    private ControladorPrincipal ctrl;
    
    public TelaPrincipal(ControladorPrincipal ctrl) {
        this.ctrl = ctrl;
    }

    public void iniciar(Stage primaryStage) {

        primaryStage.setTitle("Sistema TX - Tela Principal");

        Text scenetitle = new Text("Sistema FX");
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Scene scene = new Scene(grid, 800, 600);
        primaryStage.setScene(scene);

        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        
        grid.add(scenetitle, 0, 0, 2, 1);
        
        TableView tbResultados = new TableView();
        TableColumn col1 = new TableColumn("Nome");
        col1.setMinWidth(200);
        col1.setCellFactory(new PropertyValueFactory("nome"));
        TableColumn col2 = new TableColumn("Endereco");
        col2.setMinWidth(300);
        col1.setCellFactory(new PropertyValueFactory("endereco"));
        TableColumn col3 = new TableColumn("e-mail");
        col3.setMinWidth(150);
        col3.setCellFactory(new PropertyValueFactory("email"));
        tbResultados.setItems(ctrl.getPessoas());
        
        tbResultados.getColumns().addAll(col1, col2, col3);
        grid.add(tbResultados, 0, 1, 2, 1);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
