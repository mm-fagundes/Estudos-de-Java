package ExercicioHeranca.Ex03;

public class Main {
    static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        conta1.setNomeTitular("Mateus");
        conta1.setNumeroDaConta(123);

        conta1.depositarValor(100);
        conta1.sacarValor(100);
        conta1.cobrarTarifaMensal();
        conta1.consultarSaldo();

    }
}
