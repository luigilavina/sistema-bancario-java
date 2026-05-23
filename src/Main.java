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
    while (escolha != 5){
      System.out.println("Escolha uma das opções: 1-Depositar | 2-Sacar | 3-Mostrar saldo | 4-Mostrar Dados | 5-Sair : ");
      escolha = scanner.nextInt();

      switch (escolha){
        case 1: {
          System.out.println("Seu saldo atual é de R$"+ contaBancaria.getSaldoConta());
          System.out.println("Qual o valor que voce quer depositar: ");
          double valorDeposito = scanner.nextDouble();
          if (valorDeposito > 0){
            contaBancaria.depositar(valorDeposito);

            System.out.println("Agora o Saldo de sua conta é de R$"+contaBancaria.getSaldoConta());
          }else {
            System.out.println("Digite um valor válido.");
          }
          break;
        }
        case 2: {
          System.out.println("Seu saldo atual é de R$"+contaBancaria.getSaldoConta());
          System.out.println("Qual o valor que voce quer sacar: ");
          double valorSaque = scanner.nextDouble();

          if (valorSaque > 0 && valorSaque <= contaBancaria.getSaldoConta()){
            contaBancaria.sacar(valorSaque);
            System.out.println("Agora o Saldo de sua conta é de R$"+contaBancaria.getSaldoConta());
          }else{
            System.out.println("Valor indisponivel para saque");
          }
          break;
        }
        case 3:{
          System.out.println("Seu saldo atual é de R$"+ contaBancaria.getSaldoConta());
          break;
        }
        case 4:{
          System.out.println("Nome: "+contaBancaria.getTitular());
          System.out.println("Número da Conta: "+contaBancaria.getNumeroConta());
          System.out.println(contaBancaria.getSaldoConta());
          break;
        }
        case 5:{
          System.out.println("Saindo do sistema...");
          break;
        }
        default:
          System.out.println("Opção inválida.");
      }
    }
  }
}