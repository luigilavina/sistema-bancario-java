import java.util.ArrayList;

public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldoConta;

    private ArrayList<String> historicoTransacoes = new ArrayList<String>();

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
            historicoTransacoes.add("Deposito de R$"+valorDepositado);

            System.out.println("Agora o Saldo de sua conta é de R$"+getSaldoConta());
        }else {
            System.out.println("Digite um valor válido.");
        }
    }

    public void sacar(double valorSaque){

        if (valorSaque > 0 && valorSaque <= getSaldoConta()){
            saldoConta-= valorSaque;
            historicoTransacoes.add("Saque de R$"+valorSaque);

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

    public void mostrarHistorico(){

        if (historicoTransacoes.isEmpty()){
            System.out.println("Nenhuma transação realizada");
        }else {
            for (int i = 0; i < historicoTransacoes.size(); i++){
                System.out.println(historicoTransacoes.get(i));
            }
        }
    }
}