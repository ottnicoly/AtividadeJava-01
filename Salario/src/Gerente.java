public class Gerente extends Salario{
    public Gerente(double valorHora, int horaTrabalhada){
        this.horaTrabalhada = horaTrabalhada;
        this.valorHora = valorHora;
    }

    public double salarioFinal() {
        final double valor = salario() + salario() * 0.05;
        return valor;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHoraTrabalhada() {
        return horaTrabalhada;
    }
}
