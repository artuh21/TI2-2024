package com.carros;
import java.util.Scanner;

// Principal.java
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DAO dao = new DAO();

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1) Listar");
            System.out.println("2) Inserir");
            System.out.println("3) Excluir");
            System.out.println("4) Atualizar");
            System.out.println("5) Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (opcao) {
                case 1:
                    List<X> lista = dao.listar();
                    for (X x : lista) {
                        System.out.println(x);
                    }
                    break;

                case 2:
                    System.out.print("Informe o nome: ");
                    String nome = scanner.nextLine();
                    X novoX = new X();
                    novoX.setNome(nome);
                    dao.inserir(novoX);
                    break;

                case 3:
                    System.out.print("Informe o ID para excluir: ");
                    int idExcluir = scanner.nextInt();
                    dao.excluir(idExcluir);
                    break;

                case 4:
                    System.out.print("Informe o ID para atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    X xAtualizado = new X();
                    ((Object) xAtualizado).setId(idAtualizar);

                    System.out.print("Informe o novo nome: ");
                    String novoNome = scanner.nextLine();
                    xAtualizado.setNome(novoNome);

                    dao.atualizar(xAtualizado);
                    break;

                case 5:
                    System.out.println("Saindo do programa. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 5);

        scanner.close();
    }
}