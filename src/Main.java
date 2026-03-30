import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();

        livro1.setTitulo("Como se tornar um programador");
        livro1.setAutor("Matheus");
        livro1.setAnoPublicacao(2026);
        livro1.setDisponivel(true);

        livro2.setTitulo("Os Lusiades");
        livro2.setAutor("Machado de Assis");
        livro2.setAnoPublicacao(2002);
        livro2.setDisponivel(true);

        livro3.setTitulo("Como aprender Java!");
        livro3.setAutor("Josias");
        livro3.setAnoPublicacao(1998);
        livro3.setDisponivel(true);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Biblioteca ===");
            System.out.println("1 - Acervo de Livros");
            System.out.println("2 - Consultar Livros");
            System.out.println("3 - Empréstimo");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    System.out.println("Todos os livros disponiveis");
                    System.out.println("\n==================");
                    System.out.println("Titulo: " + livro1.getTitulo());
                    System.out.println("Autor: " + livro1.getAutor());
                    System.out.println("Ano de publicação: " + livro1.getAnoPublicacao());

                    System.out.println("\n==================");

                    System.out.println("Titulo: " + livro2.getTitulo());
                    System.out.println("Autor: " + livro2.getAutor());
                    System.out.println("Ano de publicação: " + livro2.getAnoPublicacao());

                    System.out.println("\n==================");

                    System.out.println("Titulo: " + livro3.getTitulo());
                    System.out.println("Autor: " + livro3.getAutor());
                    System.out.println("Ano de publicação: " + livro3.getAnoPublicacao());

                    break;

                case 2:
                    System.out.print("Digite o nome do livro: ");
                    String titulo = scanner.nextLine();
                    if (titulo.equalsIgnoreCase(livro1.getTitulo())) {
                        System.out.println("Livro Disponivel");
                    } else if (titulo.equalsIgnoreCase(livro2.getTitulo())) {
                        System.out.println("Livro Disponivel");
                    } else if (titulo.equalsIgnoreCase(livro3.getTitulo())) {
                        System.out.println("Livro Disponivel");
                    } else {
                        System.out.println("Livro Indisponivel");
                    }

                    break;
                case 3:
                    System.out.print("\nQual livro deseja emprestar? ");
                    System.out.println("\n1 = Titulo: " + livro1.getTitulo());
                    System.out.println("2 = Titulo: " + livro2.getTitulo());
                    System.out.println("3 = Titulo: " + livro3.getTitulo());

                    int emprestimo = scanner.nextInt();
                    switch (emprestimo) {
                        case 1:
                            if (livro1.getDisponivel() == true) {
                                livro1.setDisponivel(false);
                                System.out.println("Emprestimo Realizado!");
                            } else {
                                System.out.println("Livro ja emprestado");
                            }
                            continue;
                        case 2:
                            if (livro2.getDisponivel() == true) {
                                livro2.setDisponivel(false);
                                System.out.println("Emprestimo Realizado!");
                            } else {
                                System.out.println("Livro ja emprestado");
                            }
                            continue;
                        case 3:
                            if (livro3.getDisponivel() == true) {
                                livro3.setDisponivel(false);
                                System.out.println("Emprestimo Realizado!");
                            } else {
                                System.out.println("Livro ja emprestado");
                            }
                            continue;

                        default:
                    }

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");

                    scanner.close();
            }
        }
    }
}
