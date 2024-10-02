package main;
import java.util.Scanner;
import doador.Doador;
import util.TipoDoador;

public class CadastroDoador {
	 public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

	        System.out.println("Cadastro de Doador");
	        System.out.print("Nome: ");
	        String nome = scanner.nextLine();

	        System.out.print("Tipo (CPF ou CNPJ): ");
	        String tipoString = scanner.nextLine();
	        TipoDoador tipo = TipoDoador.valueOf(tipoString.toUpperCase());

	        System.out.print("Contato: ");
	        String contato = scanner.nextLine();

	        Doador doador = new Doador(nome, tipo, contato);

	        System.out.println("Doador cadastrado com sucesso!");
	        doador.imprimirDetalhes();

	        scanner.close();
	    }
}
