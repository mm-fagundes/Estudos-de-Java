package ExercicioHeranca.Ex02;

public class Cachorro extends Animal{
    public String brinquedoPreferido;

    public String getBrinquedoPreferido() {
        return brinquedoPreferido;
    }

    public void setBrinquedoPreferido(String brinquedoPreferido) {
        this.brinquedoPreferido = brinquedoPreferido;
    }

    public void abanarRabo(){
        System.out.println(getNome()+ " abanou o rabo.");
    }

    @Override
    public void emitirSom(){
        System.out.println("Au Au.. Au Au");
    }
}
