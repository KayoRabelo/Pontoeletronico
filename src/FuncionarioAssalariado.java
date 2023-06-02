import java.time.LocalDate;

public class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, LocalDate dataContratacao, double salarioMensal) {
        super(nome, dataContratacao);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }

    public double calcularBonus(double fatorBonus) {
        return salarioMensal * fatorBonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sal�rio Mensal: R$" + calcularSalario();
    }
}
