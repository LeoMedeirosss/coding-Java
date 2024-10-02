package main;
import java.util.Scanner;
import ong.Ong;

public class CadastroOng {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de ONG");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Contato: ");
        String contato = scanner.nextLine();

        System.out.print("Área de Atuação: ");
        String areaAtuacao = scanner.nextLine();

        Ong ong = new Ong(nome, endereco, contato, areaAtuacao);

        System.out.println("ONG cadastrada com sucesso:");
        ong.imprimirDetalhesCadastro();

        scanner.close();
    }
}
