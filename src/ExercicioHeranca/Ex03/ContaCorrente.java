package ExercicioHeranca.Ex03;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal = 100;


    public void cobrarTarifaMensal(){
        if(tarifaMensal <= saldo){
            saldo -= tarifaMensal;
        } else{
            System.out.println("Saldo insuficiente para a cobrança da taxa, adicione saldo e tente novamente.");
        }

    }
}
