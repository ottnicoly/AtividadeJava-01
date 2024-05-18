
public class Main {
    public static void main(String[] args) {

        Salario lider = new Lider(5,10);
        Salario gerente = new Gerente(5,10);

        System.out.println("Salário do Lider: " + lider.salarioFinal());
        System.out.println("Salário do Gerente: " + gerente.salarioFinal());


    }
}