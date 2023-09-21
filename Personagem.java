public class Personagem {
    // atributos ou propriedades
    String nome;
    int energia;
    int fome;
    int sono;

    // comportamentos(metodo)
    void cacar() {
        if (energia >= 2) {
            System.out.println(nome + " Caçando...");
            energia -=2;//energia=energia-2
        } else {
            System.out.println(nome + " Sem energia para caçar...");

        }
        fome=Math.min(fome + 1,10);
        sono=Math.min(sono + 1,10);
    }

    void comer() {
        System.out.println(nome + " Comendo...");
    }

    void dormir() {
        System.out.println(nome + " dormindo...");
    }

    public static void main(String[] args) {

        var p = new Personagem();
        p.nome = "josé";
        p.cacar();
        p.comer();
        p.dormir();

    }

}