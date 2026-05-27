import java.util.ArrayList;

public class Banco {

    private ArrayList<ContaBancaria> listaContas = new ArrayList<ContaBancaria>();

    public void adicionarConta(ContaBancaria conta){
        listaContas.add(conta);
    }

    public ContaBancaria buscarConta(int numeroConta) {
        for (int i = 0; i < listaContas.size(); i++) {
            ContaBancaria contaAtual = listaContas.get(i);
            if (numeroConta == contaAtual.getNumeroConta()){
                return contaAtual;
            }
        } return null;
    }

    public void listarContas(){
        if(listaContas.isEmpty()){
            System.out.println("Nenhum Usuário cadastrado");
        }else{
            for(int i = 0; i < listaContas.size(); i++){
                listaContas.get(i).exibirDados();
            }
        }
    }
}
