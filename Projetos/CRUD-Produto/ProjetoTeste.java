package Turing;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoTeste {
    
    static ArrayList<Produto> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;

        while (opcao != 5) {

            System.out.println("\n1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Editar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                criar();
            } else if (opcao == 2) {
                listar();
            } else if (opcao == 3) {
                editar();
            } else if (opcao == 4) {
                excluir();
            } else if (opcao == 5) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Inválido");
            }
        }
    }

    // CREATE
    static void criar() {
        System.out.print("SKU: ");
        String sku = sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        System.out.print("Perecível (true/false): ");
        boolean perecivel = sc.nextBoolean();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        sc.nextLine();

        lista.add(new Produto(sku, nome, quantidade, perecivel, preco));
    }

    // READ
    static void listar() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + " - " + lista.get(i));
        }
    }

    // UPDATE
    static void editar() {
        listar();

        System.out.print("Índice para editar: ");
        int i = sc.nextInt();
        sc.nextLine();

        if (i >= 0 && i < lista.size()) {

            Produto p = lista.get(i);

            System.out.println("\n1 - Nome");
            System.out.println("2 - Quantidade");
            System.out.println("3 - Perecível");
            System.out.println("4 - Preço");
            System.out.print("Escolha o campo: ");

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Novo nome: ");
                p.setNome(sc.nextLine());

            } else if (op == 2) {
                System.out.print("Nova quantidade: ");
                p.setQuantidade(sc.nextInt());
                sc.nextLine();

            } else if (op == 3) {
                System.out.print("Perecível (true/false): ");
                p.setPerecivel(sc.nextBoolean());
                sc.nextLine();

            } else if (op == 4) {
                System.out.print("Novo preço: ");
                p.setPreco(sc.nextDouble());
                sc.nextLine();

            } else {
                System.out.println("Opção inválida");
            }

        } else {
            System.out.println("Índice inválido");
        }
    }

    // DELETE
    static void excluir() {
        listar();

        System.out.print("Índice para excluir: ");
        int i = sc.nextInt();
        sc.nextLine();

        if (i >= 0 && i < lista.size()) {
            lista.remove(i);
            System.out.println("Produto removido.");
        } else {
            System.out.println("Índice inválido");
        }
    }
}
