package ExerciciosCurso3;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void puxaFicha(){
        System.out.format("""
                Modelo: %s
                Ano: %d
                Cor: %s
                """, modelo,ano,cor);
    }

    int calculaIdade(){
        int idade = 2026 - ano;
        return idade;
    }
}
