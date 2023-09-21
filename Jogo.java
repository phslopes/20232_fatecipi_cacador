import java.util.Random;

public class Jogo {

    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var personagem = new Personagem("john");
        var soneca = new Personagem("soneca",0,4,10);

        //nasce com muito e sem energia. fome mais ou menos
        //ele tem a probabilidade 80% de dormir
        //10% de caçar
        //10% de comer
       //personagem.exibirEstado();
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
            personagem.exibirEstado();

            System.out.println("---------------");
            var oQueOSonecaVaifazer = gerador.nextDouble();
            if (oQueOSonecaVaifazer <= 0.8){
                soneca.dormir();
            }
            else if(oQueOSonecaVaifazer <= 0.9){
                soneca.comer();
            }
            else{
                soneca.cacar();
            }
            soneca.exibirEstado();
            System.out.println("************");
        Thread.sleep(6000);
        }
    }
}
