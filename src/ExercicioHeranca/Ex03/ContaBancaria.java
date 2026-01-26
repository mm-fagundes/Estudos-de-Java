package ExercicioHeranca.Ex03;

public class ContaBancaria {
    private String nomeTitular;
    protected double saldo;
    private int numeroDaConta;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void depositarValor(double valor){
        saldo += getSaldo() + valor;
        System.out.println("Depósito concluído! Saldo atualizado: " + saldo);
    }

    public void sacarValor(double valor){
        if(saldo >= valor){
            saldo = getSaldo() - valor;
            System.out.println("Saque concluído! Saldo atualizado: " + saldo);
        } else{
            System.out.println("Saldo insuficiente para a conclusão do saque, adicione saldo e tenten novamente.");
        }

    }

    public void consultarSaldo(){
        System.out.println("Saldo da conta: " + getSaldo());
    }












}
