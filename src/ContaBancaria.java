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
        saldoConta+= valorDepositado;
    }

    public void sacar(double valorSaque){
        saldoConta-= valorSaque;
    }
}
