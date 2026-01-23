package ExerciciosCurso3;

public class Main {

    public static void main(String[] args) {

        //Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        Pessoa.olaMundo();

        //Crie uma classe Calculadora com um método que recebe
        // um número como parâmetro e retorna o dobro desse número.
        Calculadora.calcularDobro(20);


        //Crie uma classe Musica com atributos titulo, artista, anoLancamento,avaliacao e numAvaliacoes, e métodos para
        // exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Musica musica1 = new Musica();
        musica1.nome = "Dive";
        musica1.artista = "Ed Sheeran";
        musica1.anoLancamento = 2017;
        musica1.avaliacao = 0;
        musica1.numAvaliacoes = 0;

        musica1.avalia(10);
        System.out.println(musica1.avaliacao);
        System.out.println(musica1.numAvaliacoes);


        // Crie uma classe Carro com atributos modelo, ano, cor e métodos
        // para exibir a ficha técnica e calcular a idade do carro.

        Carro carro1 = new Carro();
        carro1.modelo = "Corsa";
        carro1.ano = 2009;
        carro1.cor = "Preto";

        carro1.puxaFicha();
        int idadeCarro = carro1.calculaIdade();
        System.out.println(idadeCarro);


        // Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno,
        //  atribua valores aos seus atributos e utilize o método para exibir as informações.

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Richard";
        aluno1.idade = 12;
        aluno1.puxaFicha();




    }


}
