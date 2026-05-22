public class ContaBancaria {

    String titular;
    int numeroConta;
    float saldoConta;

    ContaBancaria(String titular, int numeroConta, float saldoConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    public float depositar(float valorDepositado){
        return saldoConta+= valorDepositado;
    }

    public float sacar(float valorSaque){
        return saldoConta-= valorSaque;
    }
}
