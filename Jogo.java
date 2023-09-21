import java.util.Random;

public class Jogo {

    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var personagem = new Personagem();
        personagem.nome = "jonh";
        var soneca = new Personagem();
        //nasce com muito e sem energia. fome mais ou menos
        //ele tem a probabilidade 80% de dormir
        //10% de caçar
        //10% de comer
        while(true){
            int oQuefazer = gerador.nextInt(3); //[0..3]
            switch(oQuefazer){
                case 0: 
                personagem.cacar();
                break;
                case 1: 
                personagem.comer();
                break;
                case 2:
                personagem.dormir();
                break;
            }
            System.out.printf(
            "e: %d, f: %d, s: %d\n", 
            personagem.energia,
            personagem.fome, 
            personagem.sono
            );
            System.out.println("************");
        Thread.sleep(6000);
        }
    }
}
