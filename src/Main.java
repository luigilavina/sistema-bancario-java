import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String titular = scanner.nextLine();

    System.out.println("Digite o número da conta");
    int numeroConta = scanner.nextInt();

    double saldoConta = 500;

    ContaBancaria contaBancaria = new ContaBancaria(titular, numeroConta, saldoConta);

    int escolha = 0;
    while (escolha != 6){
      System.out.println("Escolha uma das opções: 1-Depositar | 2-Sacar | 3-Mostrar saldo | 4-Mostrar Dados | 5-Historico | 6-Sair : ");
      escolha = scanner.nextInt();

      switch (escolha){
        case 1: {
          System.out.println("Seu saldo atual é de R$"+ contaBancaria.getSaldoConta());
          System.out.println("Qual o valor que voce quer depositar: ");
          double valorDeposito = scanner.nextDouble();

          contaBancaria.depositar(valorDeposito);
          break;
        }
        case 2: {
          System.out.println("Seu saldo atual é de R$"+contaBancaria.getSaldoConta());
          System.out.println("Qual o valor que voce quer sacar: ");
          double valorSaque = scanner.nextDouble();

          contaBancaria.sacar(valorSaque);
          break;
        }
        case 3:{
          System.out.println("Seu saldo atual é de R$"+ contaBancaria.getSaldoConta());
          break;
        }
        case 4:{
          contaBancaria.exibirDados();
          break;
        }
        case 5:{
          contaBancaria.mostrarHistorico();
          break;
        }
        case 6:{
          System.out.println("Saindo do sistema...");
          break;
        }
        default:
          System.out.println("Opção inválida.");
      }
    }
  }
}