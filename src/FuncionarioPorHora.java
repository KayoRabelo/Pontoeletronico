import java.time.LocalDate;

public class FuncionarioPorHora extends Funcionario {
    private double valorHora;
    private double horasTrabalhadas;

    public FuncionarioPorHora(String nome, LocalDate dataContratacao, double valorHora, double horasTrabalhadas) {
        super(nome, dataContratacao);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário por Hora: R$" + calcularSalario();
    }
}
