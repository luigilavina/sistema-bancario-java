public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldoConta;

    public ContaBancaria(String titular, int numeroConta, double saldoConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public String getTitular(){
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void depositar(double valorDepositado){

        if (valorDepositado > 0){
            saldoConta+= valorDepositado;

            System.out.println("Agora o Saldo de sua conta é de R$"+getSaldoConta());
        }else {
            System.out.println("Digite um valor válido.");
        }
    }

    public void sacar(double valorSaque){

        if (valorSaque > 0 && valorSaque <= getSaldoConta()){
            saldoConta-= valorSaque;
            System.out.println("Agora o Saldo de sua conta é de R$"+getSaldoConta());
        }else{
            System.out.println("Valor indisponivel para saque");
        }
    }

    public void exibirDados(){
        System.out.println("Nome: "+getTitular());
        System.out.println("Número da Conta: "+getNumeroConta());
        System.out.println("O saldo de sua conta é R$"+getSaldoConta());
    }
}