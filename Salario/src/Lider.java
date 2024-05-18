public class Lider extends Salario {
    public Lider(double valorHora, int horaTrabalhada){
        this.horaTrabalhada = horaTrabalhada;
        this.valorHora = valorHora;
    }

    public double salarioFinal() {
        final double valor = salario() + salario() * 0.02;
        return valor;
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHoraTrabalhada() {
        return horaTrabalhada;
    }
}
