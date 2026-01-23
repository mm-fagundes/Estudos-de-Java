package ExerciciosCurso3;

public class Musica {

    String nome;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFicha(){
        System.out.format("""
                        Titulo: $s
                        Artista: %s
                        Ano de Lançamento: %d
                        Avaliação: %f,
                        Número de avaliações: %d
                        """,
                nome,
                artista,
                anoLancamento,
                avaliacao,
                numAvaliacoes
        );
        }

        void avalia(double nota) {

        avaliacao += nota;
        numAvaliacoes++;

        }







}
