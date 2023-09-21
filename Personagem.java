public class Personagem {
    // atributos ou propriedades
    String nome;
    int energia;
    int fome;
    int sono;

    // comportamentos(metodo)
    void cacar() {
        System.out.println(nome + "Caçando...");
    }

    void comer() {
        System.out.println(nome + "Comendo...");
    }

    void dormir() {
        System.out.println(nome + "dormindo...");
    }

    public static void main(String[] args) {

        var p = new Personagem();
        p.nome = "josé";
        p.cacar();
        p.comer();
        p.dormir();

    }

}