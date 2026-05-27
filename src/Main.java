import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Banco banco = new Banco();

    int opcaoPrincipal = 0;

    while (opcaoPrincipal != 4) {
      System.out.println("1-Criar conta | 2-Listar contas | 3-Acessar conta | 4-Sair");
      opcaoPrincipal = scanner.nextInt();
      scanner.nextLine();

      switch (opcaoPrincipal) {
        case 1: {
          System.out.println("Digite seu nome: ");
          String titular = scanner.nextLine();

          System.out.println("Digite o número da conta: ");
          int numeroConta = scanner.nextInt();

          double saldoConta = 500;

          ContaBancaria conta = new ContaBancaria(titular, numeroConta, saldoConta);
          banco.adicionarConta(conta);

          System.out.println("Conta criada com sucesso!");
          break;
        }

        case 2: {
          banco.listarContas();
          break;
        }

        case 3: {
          System.out.println("Digite o número da conta: ");
          int numeroBusca = scanner.nextInt();

          ContaBancaria contaEncontrada = banco.buscarConta(numeroBusca);

          if (contaEncontrada == null) {
            System.out.println("Conta não encontrada.");
          } else {
            int opcaoConta = 0;

            while (opcaoConta != 6) {
              System.out.println("1-Depositar | 2-Sacar | 3-Mostrar saldo | 4-Mostrar dados | 5-Histórico | 6-Voltar");
              opcaoConta = scanner.nextInt();

              switch (opcaoConta) {
                case 1: {
                  System.out.println("Qual o valor que você quer depositar ?");
                  double valorDeposito = scanner.nextDouble();
                  contaEncontrada.depositar(valorDeposito);
                  break;
                }

                case 2: {
                  System.out.println("Qual o valor que você quer sacar ?");
                  double valorSaque = scanner.nextDouble();
                  contaEncontrada.sacar(valorSaque);
                  break;
                }

                case 3: {
                  System.out.println("Seu saldo atual é de R$" + contaEncontrada.getSaldoConta());
                  break;
                }

                case 4: {
                  contaEncontrada.exibirDados();
                  break;
                }

                case 5: {
                  contaEncontrada.mostrarHistorico();
                  break;
                }

                case 6: {
                  System.out.println("Voltando ao menu principal...");
                  break;
                }

                default:
                  System.out.println("Opção inválida.");
              }
            }
          }
          break;
        }

        case 4: {
          System.out.println("Saindo do sistema...");
          break;
        }

        default:
          System.out.println("Opção inválida.");
      }
    }

    scanner.close();
  }
}