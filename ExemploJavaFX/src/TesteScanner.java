
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jean
 */
public class TesteScanner {

    public static void main(String[] args) {

        String nome, idadeS, endereco;
        Integer idade;
        float salario;

        clrscr();
        header();
        space();
       
        Scanner teclado = new Scanner(System.in);

        System.out.println("Entre com o seu nome:");
        nome = teclado.nextLine();

        System.out.println("Entre com a sua idade:");
        idadeS = teclado.nextLine();

        idade = Integer.parseInt(idadeS);

        System.out.println("Entre com o seu endereco:");
        endereco = teclado.nextLine();

        System.out.println("Entre com seu salario:");
        salario = teclado.nextFloat();

        System.out.println("Nome:" + nome + ", " + "Idade: " + idade + ", " + "Salario: " + salario);

        footer();
    }

    private static void clrscr() {
        for (int i = 0; i < 50; i++)System.out.println();
    }
    
    private static void space() {
        for (int i = 0; i < 2; i++)System.out.println();
    }

    private static void header() {
        System.out.println("---------------------------- SYS TEMA 2.0 ---------------------------- ");
    }

    private static void footer() {
        System.out.println("---------------------------------------------------------------------- ");
    }

}
