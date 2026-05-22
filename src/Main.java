import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String titular = scanner.nextLine();

    System.out.println("Digite o número da conta");
    int numeroConta = scanner.nextInt();

    float saldoConta = 500;

    ContaBancaria contaBancaria = new ContaBancaria(titular, numeroConta, saldoConta);

    int escolha = 0;
    while (escolha != 4){
      System.out.println("Escolha uma das opções: 1-Depositar | 2-Sacar | 3-Mostrar saldo | 4-Sair : ");
      escolha = scanner.nextInt();

      switch (escolha){
        case 1: {
          System.out.println("Seu saldo atual é de R$"+contaBancaria.saldoConta);
          System.out.println("Qual o valor que voce quer depositar: ");
          float valorDeposito = scanner.nextFloat();
          if (valorDeposito > 0){
            contaBancaria.depositar(valorDeposito);

            System.out.println("Agora o Saldo de sua conta é de R$"+contaBancaria.saldoConta);
          }else {
            System.out.println("Digite um valor válido.");
          }
          break;
        }
        case 2: {
          System.out.println("Seu saldo atual é de R$"+contaBancaria.saldoConta);
          System.out.println("Qual o valor que voce quer sacar: ");
          float valorSaque = scanner.nextFloat();

          if (valorSaque > 0 && valorSaque <= contaBancaria.saldoConta){
            contaBancaria.sacar(valorSaque);
            System.out.println("Agora o Saldo de sua conta é de R$"+contaBancaria.saldoConta);
          }else{
            System.out.println("Valor indisponivel para saque");
          }
          break;
        }
        case 3:{
          System.out.println("Seu saldo atual é de R$"+contaBancaria.saldoConta);
          break;
        }
        case 4:{
          System.out.println("Saindo do sistema...");
          break;
        }
        default:
          System.out.println("Opção inválida.");
      }
    }
  }
}