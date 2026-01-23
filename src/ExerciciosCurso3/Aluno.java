package ExerciciosCurso3;

public class Aluno {

    String nome;
    int idade;

    void puxaFicha(){
        System.out.format("""
                Nome do Aluno: %s
                Idade do Aluno: %d
                """ , nome, idade);
    }



}
