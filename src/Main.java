import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.setTitulo("O Poder dos Quietos");
        livro1.setAutor("Susan Cain");
        livro1.setAnoPublicacao(2012);
        livro1.setDisponivel(true);

        livro2.setTitulo("O Alienista");
        livro2.setAutor("Machado de Assis");
        livro2.setAnoPublicacao(1882);
        livro2.setDisponivel(true);

        livro3.setTitulo("Java para Leigos");
        livro3.setAutor("Barry Burd");
        livro3.setAnoPublicacao(2006);
        livro3.setDisponivel(true);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Biblioteca ===");
            System.out.println("1 - Acervo de Livros");
            System.out.println("2 - Consultar Livro");
            System.out.println("3 - Empréstimo");
            System.out.println("0 - Sair");                
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nTodos os livros do acervo:");

                    System.out.println("\n==================");
                    System.out.println("Titulo: " + livro1.getTitulo());
                    System.out.println("Autor: " + livro1.getAutor());
                    System.out.println("Ano de publicação: " + livro1.getAnoPublicacao());
                    System.out.println("Disponível: " + (livro1.getDisponivel() ? "Sim" : "Não"));

                    System.out.println("\n==================");
                    System.out.println("Titulo: " + livro2.getTitulo());
                    System.out.println("Autor: " + livro2.getAutor());
                    System.out.println("Ano de publicação: " + livro2.getAnoPublicacao());
                    System.out.println("Disponível: " + (livro2.getDisponivel() ? "Sim" : "Não"));

                    System.out.println("\n==================");
                    System.out.println("Titulo: " + livro3.getTitulo());
                    System.out.println("Autor: " + livro3.getAutor());
                    System.out.println("Ano de publicação: " + livro3.getAnoPublicacao());
                    System.out.println("Disponível: " + (livro3.getDisponivel() ? "Sim" : "Não"));

                    break;

                case 2:
                    System.out.print("Digite o nome do livro: ");
                    String titulo = scanner.nextLine();

                    
                    if (titulo.equalsIgnoreCase(livro1.getTitulo())) {
                        System.out.println(livro1.getDisponivel() ? "Livro disponível!" : "Livro indisponível (emprestado).");
                    } else if (titulo.equalsIgnoreCase(livro2.getTitulo())) {
                        System.out.println(livro2.getDisponivel() ? "Livro disponível!" : "Livro indisponível (emprestado).");
                    } else if (titulo.equalsIgnoreCase(livro3.getTitulo())) {
                        System.out.println(livro3.getDisponivel() ? "Livro disponível!" : "Livro indisponível (emprestado).");
                    } else {
                        System.out.println("Livro não está disponível.");
                    }

                    break;

                case 3:
                    System.out.println("\nQual livro deseja emprestar?");
                    System.out.println("1 = " + livro1.getTitulo());
                    System.out.println("2 = " + livro2.getTitulo());
                    System.out.println("3 = " + livro3.getTitulo());
                    System.out.print("Escolha: ");

                    int emprestimo = scanner.nextInt();
                    scanner.nextLine();

                    switch (emprestimo) {
                        case 1:
                            if (livro1.getDisponivel()) {
                                livro1.setDisponivel(false);
                                System.out.println("Empréstimo realizado!");
                            } else {
                                System.out.println("Livro já emprestado.");
                            }
                            break;
                        case 2:
                            if (livro2.getDisponivel()) {
                                livro2.setDisponivel(false);
                                System.out.println("Empréstimo realizado!");
                            } else {
                                System.out.println("Livro já emprestado.");
                            }
                            break;
                        case 3:
                            if (livro3.getDisponivel()) {
                                livro3.setDisponivel(false);
                                System.out.println("Empréstimo realizado!");
                            } else {
                                System.out.println("Livro já emprestado.");
                            }
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }

                    break; 

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close(); 
    }
}