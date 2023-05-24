import Animais.*;

public class App {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("jujuba", "branco", 24, 3.2, 1);

        cachorro1.setNome("Pipoka");

        cachorro1.setCor("branco");
        cachorro1.setAltura(5);
        cachorro1.setPeso(4.2);
        cachorro1.setTamanhoDoRabo(4);

        cachorro1.latir();
        cachorro1.pegar();
        System.out.println("O cachorro pegou a " + cachorro1.pegar());

        System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro1.interagir("nada"));
        System.out.println("O cachorro esta " + cachorro1.interagir("Vai dormir!"));

        cachorro2.latir();

        System.out.println("O cachorro esta " + cachorro2.interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro2.interagir("nada"));
        System.out.println("O cachorro esta " + cachorro2.interagir("Vai dormir!"));

    }
}