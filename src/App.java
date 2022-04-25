import java.util.Scanner;

public class App {

    public static Pessoa getPessoas() {
        String nome;
        String cpf;
        String numero;

        Scanner in = new Scanner(System.in);

        Pessoa people = new Pessoa();

        System.out.println("Qual é seu nome?");
        nome = in.nextLine();
        people.setNome(nome);

        System.out.println("Digite seu cpf: ");
        cpf = in.nextLine();
        people.setCpf(cpf);

        System.out.println("Digite seu numero: ");
        numero = in.nextLine();
        people.setTelefone(numero);

        return people;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int opcao = 0;
        int opcaoFila = 0;
        int opcaoPilha = 0;
        Fila fila = new Fila();
        Pilha pilha = new Pilha();
        do {
            System.out.println("Fila de Pessoas (1)");
            System.out.println("Pilha de Pessoa (2)");
            System.out.println("Sair (0)");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Inserir na fila (1)");
                    System.out.println("Remover da fila (2)");
                    System.out.println("Mostrar fila (3)");
                    System.out.println("Sair (0)");
                    opcaoFila = in.nextInt();

                    switch (opcaoFila) {
                        case 1:
                            fila.inserirFim(getPessoas());
                            break;

                        case 2:
                            fila.removerInicio().getPessoas();
                            break;

                        case 3:
                            fila.mostrar();
                            break;

                        default:
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Inserir na pilha (1)");
                    System.out.println("Remover da pilha (2)");
                    System.out.println("Mostrar a pilha (3)");
                    System.out.println("Sair (0)");
                    opcaoPilha = in.nextInt();

                    switch (opcaoPilha) {
                        case 1:
                            pilha.inserirFim(getPessoas());
                            break;
                        
                        case 2:
                            pilha.removerFim().getPessoas();
                            break;
                        
                        case 3:
                            pilha.mostrar();
                            break;
                        default:
                            break;
                    }

                    break;
                default:
                    break;
            }
        } while (opcao != 0);
    }
}
