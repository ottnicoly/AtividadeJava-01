
public class Main {
    public static void main(String[] args) {

        Retangulo retanguloNormal = new RetanguloSimples("normal");
        retanguloNormal.desenhar();

        Retangulo retanguloColorido = new RetanguloColorido("colorido");
        retanguloColorido.desenhar();

    }
}