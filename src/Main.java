import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;

public class Main{





    public static void main(String[] args){


        // Criando 1º plano.

        Planos plus = new Planos();
        plus.id = 1;
        plus.nome = "Plano Plus";
        plus.vantagens = "Acesso total";


        // Criando 1º filme.
        Filmes f1 = new Filmes();
        f1.nome = "Formula Um";
        f1.desc = "Multimilionarios correndo em circulos.";
        f1.anoLacamento = 2024;
        f1.included = true;

        // Criando 2º filme.
        Filmes f2 = new Filmes();
        f1.nome = "Formula Dois";
        f1.desc = "Multimilionarios correndo em circulos 2.";
        f1.anoLacamento = 2025;
        f1.included = false;


        // Criando 1ºuser.
        User user1 = new User();
        user1.nome = "Mateus";
        user1.idade = 18;
        user1.idplano = 1;

        if(f2.included == true || user1.idplano == plus.id){
            System.out.println("Filme liberado.");
        }else{
            System.out.println("Filme não incluso.");
        }


    }


}