/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplojavafx.model;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Jean
 */
public class Pessoa{
    
    private SimpleStringProperty nome;
    private SimpleStringProperty endereco;
    private SimpleStringProperty email;

    public Pessoa(String nome, String endereco, String email) {
        this.nome = new SimpleStringProperty(nome);
        this.endereco = new SimpleStringProperty(endereco);
        this.email = new SimpleStringProperty(email);
    }

    public String getNome() {
        return nome.get();
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public String getEndereco() {
        return endereco.get();
    }

    public void setEndereco(String endereco) {
        this.endereco.set(endereco);
    }

    public String getEmail() {
        return email.get();
    }

    public void setEmail(String email) {
        this.email.set(email);
    }
    

}
