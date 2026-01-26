package ExercicioHeranca.Ex02;

public class Main {
    static void main(String[] args) {

        Gato gato1 = new Gato();
        gato1.setNome("Agatha");
        gato1.setDono("Alany");
        gato1.setIdade(2);
        gato1.setPelagem("Grande e fino");
        gato1.arranharMoveis();
        gato1.emitirSom();

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Loki");
        cachorro1.setDono("Mateus");
        cachorro1.setIdade(4);
        cachorro1.setBrinquedoPreferido("Bolinha");
        cachorro1.abanarRabo();
        cachorro1.emitirSom();



    }
}
