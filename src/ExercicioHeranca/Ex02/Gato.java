package ExercicioHeranca.Ex02;

public class Gato extends Animal{
    private String pelagem;

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public void arranharMoveis(){
        System.out.println(getNome()+ " arranhou os móveis.");
    }

    @Override
    public void emitirSom(){
        System.out.println("Miiiaaauu... Miaaaauuu");
    }
}
