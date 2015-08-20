/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojavafx.control;

import exemplojavafx.model.Pessoa;
import exemplojavafx.view.Tela2;
import exemplojavafx.view.TelaPrincipal;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

/**
 *
 * @author Jean
 */
public class ControladorPrincipal {

    private Stage root;
    private TelaPrincipal telaPrincipal;
    private Tela2 tela2;
    private ObservableList<Pessoa> pessoas;

    public ControladorPrincipal(Stage primaryStage) {
        this.root = primaryStage;
        this.telaPrincipal = new TelaPrincipal(this);
        this.tela2 = new Tela2();
        this.pessoas = FXCollections.observableArrayList();
        inicializarDados();
    }
    
    public void iniciar() {
        telaPrincipal.iniciar(root);
        //tela2.iniciar(root);
    }

    private void inicializarDados() {
        pessoas.add(new Pessoa("Jean", "Rua", "jean@jean"));
        pessoas.add(new Pessoa("Pedro", "Rua", "jean@jean"));
        pessoas.add(new Pessoa("Paulo", "Rua", "jean@jean"));
        pessoas.add(new Pessoa("Carlos", "Rua", "jean@jean"));
        pessoas.add(new Pessoa("João", "Rua", "jean@jean"));
    }

    public ObservableList getPessoas() {
        return this.pessoas;
    }
    
}
